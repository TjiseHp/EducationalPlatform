package com.hp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Recruit;
import com.hp.bean.User;
import com.hp.service.RecruitService;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/recruit")
public class RecruitController {
	
	@Autowired
	public RecruitService recruitService;
	
	//增加招聘信息页面跳转	
	@RequestMapping("/insertRecruit")
	public ModelAndView insertRecruit(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "recruit/insertRecruit.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//根据城市，科目条件查询招聘信息
	@ResponseBody
	@RequestMapping("/recruitByCity")
	public Object queryRecruitByCity(Recruit recruit) {
		recruit.setClassNum(3);
		recruit.setcNum(14);
		
		List<Recruit> recruits = recruitService.queryAllBycNum(recruit);
		return recruits;
	}
	
	//添加招聘信息
	@RequestMapping("/add")
	public String recruitAdd( Recruit recruit,HttpServletRequest httpServletRequest) {			
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		recruit.setRecruitSTime(currentDate);
		recruitService.insertSelective(recruit);		
		return "main";
	}
	
	//查看历史招聘信息
	@RequestMapping("/recruitTable")
	public ModelAndView teacherTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum")Integer pageNum, HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		List<Recruit> recruits=recruitService.queryRecruitHistory();
		PageInfo<Recruit> pageInfo = new PageInfo<Recruit>(recruits);
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "recruit/recruitTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//招聘历史详细信息
	@RequestMapping("/recruitText")
	public ModelAndView teacherTable(Recruit recruit, HttpServletRequest httpServletRequest) {
	
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		System.out.println(recruit.getRecruitText());
		
		modelAndView.addObject("recruit",recruit);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "recruit/recruitText.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
}
