package com.hp.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.hp.bean.Credit;
import com.hp.bean.User;
import com.hp.service.CreditService;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/credit")
public class CreditController {

	@Autowired
	public CreditService creditService;
	
	//积分消费记录明细查询
	@RequestMapping("/creditConsumption")
	public ModelAndView creditTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,
			HttpServletRequest httpServletRequest,
			@RequestParam(defaultValue = "1",required = true,value = "uId") Integer uId,Credit credit) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		List<Credit> creditConsumption=creditService.queryAllConsumptionByuId(uId);
		PageInfo<Credit> pageInfo = new PageInfo<Credit>(creditConsumption);
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "credit/creditConsumption.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
		
	//查询历史购买订单
	@RequestMapping("/creditBuy")
	public ModelAndView creditBuyTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		List<Credit> creditBuy=creditService.queryAllBuy();
		PageInfo<Credit> pageInfo = new PageInfo<Credit>(creditBuy);
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "credit/creditBuy.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
		
	//积分详情查询
	@RequestMapping("/creditDetail")
	public ModelAndView creditDetail(@RequestParam(defaultValue = "1",required = true,value = "pageNum")Integer pageNum,Credit credit,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		List<Credit> creditDetail=creditService.queryAllDetailById(credit.getuId());
		PageInfo<Credit> pageInfo = new PageInfo<Credit>(creditDetail);

		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);	
		modelAndView.addObject("mainPage", "credit/creditDetail.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	  //查询积分详情信息--页面跳转
		@RequestMapping("/creditDetail1")
		public ModelAndView creditDetail1(
				HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uId") Integer uId) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("uId",uId);
			modelAndView.addObject("mainPage", "credit/creditDetail1.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
			
		//查询用户积分列表
		@ResponseBody
		@RequestMapping("/queryAllDetailById")
		public List<Credit> queryAllDetailById(
				HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uId") Integer uId) {
			System.out.println("当前积分列表用户id："+uId);
			List<Credit> creditDetail=creditService.queryAllDetailById(uId);
			System.out.println(uId+"用户列表条数："+creditDetail.size());
			return creditDetail;
		}
	
		//删除积分信息
		@ResponseBody
		@RequestMapping("/deleteCredit2")
		public String deleteCredit(Credit credit) {
			System.out.println("deleteCredit:"+credit.getCreditNum());
			JSONObject json = new JSONObject();
			int row = creditService.deleteByPrimaryKey(credit.getCreditNum());
			System.out.println("删除了"+row+"行数据");
			if (row==1) {
				json.put("result", true);
			}else {
				json.put("result", false);
			}
			return json.toString();
		}
		
	   //插入积分奖惩信息--页面跳转
		@RequestMapping("/creditInsert")
		public ModelAndView insertCredit(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("mainPage", "credit/creditInsert.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
	
		//执行插入积分奖惩信息		
		@RequestMapping(value = "/doInsertCredit",produces = {"text/html;charset=utf-8"})
		public String doInsertCredit(Credit credit,HttpSession httpSession,@RequestParam(value="uId", required = false) Integer uId) throws ParseException {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	        String date=df.format(new Date());// new Date()为获取当前系统时间
	        Date date1 = df.parse(date);
	        System.out.println("系统当前时间"+date1);
	        credit.setCreditDate(date1);
//			System.out.println("获取到的用户id："+credit.getuId());
			creditService.insertSelective(credit);
			return "redirect: creditDetail1";
		}
		
	

}
