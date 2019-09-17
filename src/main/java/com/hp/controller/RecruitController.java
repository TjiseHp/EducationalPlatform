package com.hp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import com.hp.bean.City;
import com.hp.bean.Recruit;
import com.hp.bean.User;
import com.hp.service.CityService;
import com.hp.service.ClassService;
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
	
	@Autowired
	public CityService cityService;
	
	@Autowired
	public ClassService classService;
	
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
		recruit.setcNum(23);
		List<Recruit> recruits = recruitService.queryAllBycNum(recruit);
		for (int j = 0; j < recruits.size(); j++) {
			Date date = recruits.get(j).getRecruitEDate();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = simpleDateFormat.format(date);
			recruits.get(j).setState(dateString);
		}
		
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
			String uName2 = userService.queryUnameByUid(recruits.get(i).getuId2());
			City city = cityService.queryCityByCnum(recruits.get(i).getcNum());
			com.hp.bean.Class class1 = classService.queryAllByClassNum(recruits.get(i).getClassNum());
			User userTest = new User();
			User userTest2 = new User();
			userTest.setuName(uName);
			userTest2.setuName(uName2);
			recruits.get(i).setUser1(userTest);
			recruits.get(i).setUser2(userTest2);
			recruits.get(i).setCity(city);
			recruits.get(i).setuClass(class1);
			if (recruits.get(i).getRecruitEDate()==null) {
				recruits.get(i).setState("未完成");
			}else {
				Date date = recruits.get(i).getRecruitEDate();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString = simpleDateFormat.format(date);
				recruits.get(i).setState(dateString);
			}
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
	public List<Recruit> queryRecruitTeacherTable(Recruit recruit) {
		recruit.setuId(4);
		
		Integer integer = recruit.getuId();
		List<Recruit> recruits=recruitService.queryRecruitByuId(integer);
		for(int i=0;i<recruits.size();i++) {
			Integer uId = recruits.get(i).getuId2();
			User users = userService.queryTeacherByuId(uId);
			recruits.get(i).setUser2(users);
			City city = cityService.queryCityByCnum(recruits.get(i).getcNum());
			com.hp.bean.Class class1 = classService.queryAllByClassNum(recruits.get(i).getClassNum());
			recruits.get(i).setCity(city);
			recruits.get(i).setuClass(class1);
		}
		return recruits;
	}
}
