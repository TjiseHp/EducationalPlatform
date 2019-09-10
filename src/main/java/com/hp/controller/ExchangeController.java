package com.hp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Exchange;
import com.hp.bean.User;
import com.hp.service.ExchangeService;
import com.hp.util.PageUtil;


@Controller
@RequestMapping("/exchange")
public class ExchangeController {
	
	@Autowired
	public ExchangeService exchangeService;
	
	@RequestMapping("/exchangeTable")
	public ModelAndView exchangeTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		List<Exchange> exchanges = exchangeService.queryAllExchange();
		PageInfo<Exchange> pageInfo = new PageInfo<Exchange> (exchanges);
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "exchange/exchangeTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	

	//营收比例更新页面跳转
	@RequestMapping("/updateExchange")
	public ModelAndView updateExchange
			(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "exchangeNum") Integer exchangeNum) {
		HttpSession httpSession = httpServletRequest.getSession();
		System.out.println("updateExchange");
		Exchange exchange = exchangeService.queryExchangeByexchangeNum(exchangeNum);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("exchange",exchange);
		modelAndView.addObject("mainPage", "exchange/updateExchange.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//更新营收比例信息
	@RequestMapping(value = "/doUpdateExchange",produces = {"text/html;charset=utf-8"})
	public String doUpdateExchange(Exchange exchange,HttpServletRequest httpServletRequest) {
		exchangeService.updateByPrimaryKeySelective(exchange);
		return "redirect: exchangeTable";
	}
	
	//模糊查询
	@RequestMapping("/searchExchange")
	public ModelAndView searchExchange
		(		@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,
				@RequestParam(required = true,value = "search") String search,
				HttpServletRequest httpServletRequest) {
		System.out.println("模糊查询:"+search);
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		PageHelper.startPage(pageNum, pageSize);
		List<Exchange> exchange = exchangeService.queryExchangeByExample(search);
		PageInfo<Exchange> pageInfo = new PageInfo<Exchange>(exchange);
		System.out.println("exchanges size:"+exchange.size());
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "exchange/exchangeTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}



	
	
	


}
