package com.hp.controller;

import java.util.ArrayList;
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
import com.hp.service.UserService;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/recruit")
public class RecruitController {
	
	@Autowired
	public RecruitService recruitService;
	
	@Autowired
	public UserService userService;
	
	//增加招聘信息页面跳转	
	@RequestMapping("/insertRecruit")
	public ModelAndView insertRecruit(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "recruit/insertRecruit.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//根据城市，科目条件查询招聘信息 跳转
		@RequestMapping("/recruitByCity")
		public ModelAndView recruitByCity(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("mainPage", "recruit/recruitByCity.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
	
	//根据城市，科目条件查询招聘信息
	@ResponseBody
	@RequestMapping("/queryRecruitByCity")
	public List<Recruit> queryRecruitByCity(Recruit recruit) {
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
	
	//查看历史招聘信息页面跳转
	@RequestMapping("/recruitTable")
	public ModelAndView recruitTable(HttpServletRequest httpServletRequest) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "recruit/recruitTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//查询历史招聘信息
	@ResponseBody
	@RequestMapping("/queryRecruitTable")
	public List<Recruit> queryRecruitTable(Recruit recruit) {
		recruit.setuId(4);
		Integer integer = recruit.getuId();
		List<Recruit> recruits=recruitService.queryRecruitHistory(integer);
		for (int i = 0; i < recruits.size(); i++) {
			String uName = userService.queryUnameByUid(recruits.get(i).getuId());
		}
		
		
		return recruits;
	}
	
	//招聘历史详细信息
	@RequestMapping("/recruitTextInfo")
	public ModelAndView recruitText(Recruit recruit, HttpServletRequest httpServletRequest) {
		System.out.println(recruit.getRecruitText());
		ModelAndView modelAndView = new ModelAndView();	
		Recruit recruit2 = new Recruit();
		recruit.setRecruitText(recruit.getRecruitText());
		modelAndView.addObject("recruit",recruit2);	
		modelAndView.addObject("mainPage", "recruit/recruitTextInfo.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//教师招聘记录页面跳转
	@RequestMapping("/recruitTeacher")
	public ModelAndView recruitTeacher(HttpServletRequest httpServletRequest) {
		
		ModelAndView modelAndView = new ModelAndView();		
		modelAndView.addObject("mainPage", "recruit/recruitTeacher.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//教师招聘记录查询
	@ResponseBody
	@RequestMapping("/queryRecruitTeacherTable")
	public List<User> queryRecruitTeacherTable(Recruit recruit) {
		recruit.setuId(4);
		Integer integer = recruit.getuId();
		List<Integer> recruits=recruitService.queryRecruitByuId(integer);
		List<User> users2 = new ArrayList<User>();
		for(int i=0;i<recruits.size();i++) {
			Integer uId = recruits.get(i);
			User users = userService.queryTeacherByuId(uId);
			users2.add(users);
		}
		return users2;
	}
}
