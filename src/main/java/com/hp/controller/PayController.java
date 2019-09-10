package com.hp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	//删除营收
		@RequestMapping("/deletePay")
		public String deleteSPay(
				HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uId") Integer uId) {
			System.out.println("deletePay:"+uId);		
			int row = payService.deleteByPrimaryKey(uId);
			System.out.println("删除了"+row+"行数据");
			return "redirect:payTable";
		}
		
		//营收更新页面跳转
		@RequestMapping("/updatePay")
		public ModelAndView updatePay
				(HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uId") Integer uId) {
			HttpSession httpSession = httpServletRequest.getSession();
			Pay pay = payService.queryPayByuId(uId);
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
			payService.updateByPrimaryKeySelective(pay);
			return "redirect: payTable";
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
		
		//执行插入营收信息
		@RequestMapping(value = "/doInsertPay",produces = {"text/html;charset=utf-8"})
		public String doInsertPay(Pay pay,HttpSession httpSession) {
			pay.setPayNum(1);
			payService.insertSelective(pay);
			return "redirect: payTable";
		}
		

}
