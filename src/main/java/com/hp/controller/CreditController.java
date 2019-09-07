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
import com.hp.bean.Credit;
import com.hp.service.CreditService;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/credit")
public class CreditController {

	@Autowired
	public CreditService creditService;
	
	//积分消费记录明细查询
	@RequestMapping("/creditConsumption")
	public ModelAndView creditTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		List<Credit> creditConsumption=creditService.queryAllConsumption();
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
		public ModelAndView creditDetail(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
			Integer pageSize=PageUtil.getPageSize();
			ModelAndView modelAndView = new ModelAndView();
			HttpSession httpSession = httpServletRequest.getSession();
			
			PageHelper.startPage(pageNum, pageSize);
			List<Credit> creditDetail=creditService.queryAllDetail();
			PageInfo<Credit> pageInfo = new PageInfo<Credit>(creditDetail);
			
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("httpSession",httpSession);		
			modelAndView.addObject("mainPage", "credit/creditDetail.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		
		
		
		
		
}
