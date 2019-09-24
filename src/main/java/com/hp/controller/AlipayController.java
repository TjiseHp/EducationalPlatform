package com.hp.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.hp.bean.Pay;
import com.hp.service.PayService;
import com.hp.util.AlipayConfig;
/***
 * 	ALIPAY相关模块
 * @author ThinkPad
 *
 */
@Controller
@RequestMapping("/alipay")
public class AlipayController {
	
	@Autowired
	public PayService payService;

	@RequestMapping("/payMenu")
	public ModelAndView payMenu(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "alipay/payMenu.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	@RequestMapping("/payPage")
	public ModelAndView payPage(
			HttpServletRequest httpServletRequest,
			int money) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(money);
		modelAndView.addObject("money",money);
		modelAndView.addObject("mainPage", "alipay/payPage.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping(value = "/doPay", produces = {"text/html; charset=UTF-8"})
	public String doPay(
			HttpServletRequest request, 
			HttpServletRequest response,
			@RequestParam(required = true,value = "uId") Integer uId) throws Exception , UnsupportedEncodingException {
		System.out.println("doPay模块--uId:"+uId+"\n");
		String urlEncode = URLEncoder.encode("uId="+uId,"UTF-8");
		System.out.println("urlEncode: "+urlEncode);
		AlipayClient alipayClient = new DefaultAlipayClient(
				AlipayConfig.gatewayUrl, 
				AlipayConfig.app_id, 
				AlipayConfig.merchant_private_key, 
				"json", 
				AlipayConfig.charset, 
				AlipayConfig.alipay_public_key, 
				AlipayConfig.sign_type);
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
		//订单号
		String out_trade_no = new String(
				request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),
				"UTF-8");
		//金额
		String total_amount = new String(
				request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),
				"UTF-8");
		String subject = new String(
				request.getParameter("WIDsubject").getBytes("ISO-8859-1"),
				"UTF-8");
		String body = new String(
				request.getParameter("WIDbody").getBytes("ISO-8859-1"),
				"UTF-8");
		
		alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
				+ "\"total_amount\":\""+ total_amount +"\","
				+ "\"subject\":\""+ subject +"\","
				+ "\"body\":\""+ body +"\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\","
				+ "\"passback_params\":\""+ urlEncode +"\"}");
		
		//封装用户信息,暂无支付宝账号及积分修改
		Pay pay = new Pay();
		pay.setPayNum(out_trade_no);
		pay.setPayText(total_amount);
		Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        pay.setPayDate(timestamp);
        pay.setuId(uId);
        int row = payService.insertSelective(pay);
        System.out.println("交易记录更新了 "+row+" 条");
		
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		
		System.out.println(result);
		
		
		
		return result;
	}
	
	@RequestMapping("/returnUrl")
	public ModelAndView returnUrl(
			HttpServletRequest request, 
			HttpServletRequest response) throws Exception{
		System.out.println("\n成功进入同步回调页\n");
		Map<String,String> params = new HashMap<String,String>();
		Map<String,String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type);
		//----------------功能分割线----------------------
		ModelAndView modelAndView = new ModelAndView();
		if(signVerified) {	//验证成功
			
			//商户订单号
			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
		
			//支付宝交易号
			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
		
			//付款金额
			String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
			
			//输出验证信息
			System.out.println("同步信息回显："+"trade_no :"+trade_no+"\nout_trade_no :"+out_trade_no+"\ntotal_amount :"+total_amount);
			
			if (out_trade_no!=null && trade_no!=null && total_amount!=null) {
				Pay pay = new Pay();
				pay.setPayNum(out_trade_no);
				pay.setTradeNo(trade_no);
				pay.setPayText(total_amount);
				Date date = new Date();
		        Timestamp timestamp = new Timestamp(date.getTime());
		        pay.setPayDate(timestamp);
		        int row = payService.insertSelective(pay);
		        System.out.println("交易记录更新了 "+row+" 条");
		        modelAndView.addObject("result",true);
			}else {
				modelAndView.addObject("result",false);
			}
			modelAndView.addObject("out_trade_no",out_trade_no);
			modelAndView.addObject("trade_no",trade_no);
			modelAndView.addObject("total_amount",total_amount);
			modelAndView.addObject("mainPage", "alipay/payMenu.jsp");
			modelAndView.setViewName("main");
			
		}else {	//验证失败
			System.out.println("验签失败");
			modelAndView.addObject("result",false);
		}
		return modelAndView;
	}
	
	/*
	@ResponseBody
	@RequestMapping("/notifyUrl")
	public String notifyUrl(
			HttpServletRequest request, 
			HttpServletRequest response)throws Exception, UnsupportedEncodingException{
		System.out.println("\n成功进入异步回调页\n");
		Map<String,String> params = new HashMap<String,String>();
		Map<String,String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名
		//----------------------功能分隔符---------------------
		
		if(signVerified) {//验证成功
			
			//商户订单号
			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
		
			//支付宝交易号
			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
		
			//回调信息
//			String passback_params = new String(request.getParameter("passback_params").getBytes("ISO-8859-1"),"UTF-8");
			
			//交易状态
			String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");
			
//			System.out.println("异步信息回显：\n"+"\nout_trade_no :"+out_trade_no+"\ntrade_no :"+trade_no+"\npassback_params :"+passback_params);
			
			if(trade_status.equals("TRADE_FINISHED")){
				//判断该笔订单是否在商户网站中已经做过处理
				//如果没有做过处理,根据订单号out_trade_no在商户网站的订单系统中查到该笔订单的详细,并执行商户的业务程序
				//如果有做过处理,不执行商户的业务程序
				//注意:本条件为退款模块,退款日期超过可退款期限后发送该交易状态通知
				System.out.println("进入退款模块");
			}else if (trade_status.equals("TRADE_SUCCESS")){
				//判断该笔订单是否在商户网站中已经做过处理
				//如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
				//如果有做过处理,不执行商户的业务程序
				//注意:付款完成后发送该交易状态通知
				System.out.println("进入付款成功模块");
			}
			
			System.out.println("success");
			
		}else {//验证失败
			System.out.println("fail");
		
			//调试用,写文本函数记录程序运行情况是否正常
			//String sWord = AlipaySignature.getSignCheckContentV1(params);
			//AlipayConfig.logResult(sWord);
		}
		
		return "success";
	}
	*/
	 
}