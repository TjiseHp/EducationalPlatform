package com.hp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Pay;
import com.hp.bean.User;
import com.hp.service.PayService;
import com.hp.util.PageUtil;

/**
 * *
 * @author BS
 *	本控制器为营收纪录控制器
 */


@Controller
@RequestMapping ("/pay")
public class PayController {
	
	@Autowired
	public PayService payService;
	
	@RequestMapping("/payTable")
	public ModelAndView payTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		List<Pay> pays = payService.queryAllPay();
		PageInfo<Pay> pageInfo = new PageInfo<Pay>(pays);
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "pay/payTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	/*
	//删除营收
	@RequestMapping("/deletePay")
	public String deleteSPay(
			HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "uId") Integer uId) {
		System.out.println("deletePay:"+uId);		
		int row = payService.deleteByPrimaryKey(uId);
		System.out.println("删除了"+row+"行数据");
		return "redirect:payTable2";
	}
	*/
		
	//营收更新页面跳转
	@RequestMapping("/updatePay")
	public ModelAndView updatePay
			(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "payNum") String payNum) {
		HttpSession httpSession = httpServletRequest.getSession();
		Pay pay = payService.queryPayBypayNum(payNum);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("pay",pay);
		modelAndView.addObject("mainPage", "pay/updatePay.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
		
	//更新营收信息
	@RequestMapping(value = "/doUpdatePay",produces = {"text/html;charset=utf-8"})
	public String doUpdatePay(Pay pay,HttpServletRequest httpServletRequest) {
		System.out.println(pay.getPayNum());
		int row = payService.updateByPrimaryKeySelective(pay);
		System.out.println("更新了"+row+"行数据");
		return "redirect: payTable2";
	}
	
	//模糊查询
	@RequestMapping("/searchPay")
	public ModelAndView searchPay
		(		@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,
				@RequestParam(required = true,value = "search") String search,
				HttpServletRequest httpServletRequest) {
		System.out.println("模糊查询:"+search);
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		PageHelper.startPage(pageNum, pageSize);
		List<Pay> pays = payService.queryPayByExample(search);
		PageInfo<Pay> pageInfo = new PageInfo<Pay>(pays);
		System.out.println("pays size:"+pays.size());
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "pay/payTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//插入营收信息--页面跳转
	@RequestMapping("/insertPay")
	public ModelAndView insertPay(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "pay/insertPay.jsp");
		modelAndView.setViewName("main");
			return modelAndView;

	}
		
	//查询总营收信息
	/*@RequestMapping(value = "/doInsertPay",produces = {"text/html;charset=utf-8"})
	
	 * public String doInsertPay(Pay pay,HttpSession httpSession) { int row =
	 * payService.insertSelective(pay); System.out.println("插入了"+row+"行数据"); return
	 * "redirect: payTable2"; }
	 */
	
	//查询营收信息--页面跳转2
	@RequestMapping("/payTable2")
	public ModelAndView payTable2(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "pay/payTable2.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//查询全部营收列表
	@ResponseBody
	@RequestMapping("/queryAllPay")
	public List<Pay> queryAllPay() {
		List<Pay> pays = payService.queryAllPay();
		
		return pays;
	}
	
	
//	//删除营收信息2
//	@ResponseBody
//	@RequestMapping("/deletePay2")
//	public String deleteStudent2(Pay pay) {
//		System.out.println("deletePay:"+pay.getPayNum());
//		JSONObject json = new JSONObject();
//		int row = payService.deleteByPrimaryKey(pay.getPayNum());
//		System.out.println("删除了"+row+"行数据");
//		if (row==1) {
//			json.put("result", true);
//		}else {
//			json.put("result", false);
//		}
//		return json.toString();
//	}
		

}
