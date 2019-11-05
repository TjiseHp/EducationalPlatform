package com.hp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.quartz.jobs.ee.jms.JmsJobException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alipay.api.domain.UseTime;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Appraise;
import com.hp.bean.City;
import com.hp.bean.Credit;
import com.hp.bean.Recruit;
import com.hp.bean.User;
import com.hp.service.CityService;
import com.hp.service.ClassService;
import com.hp.service.CreditService;
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
	

	@Autowired
	public CreditService creditService;
	
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
	public List<Recruit> queryRecruitByCity(User user) {
		User users = userService.queryTeacherByuId(user.getuId());
		Recruit recruit = new Recruit();
		recruit.setClassNum(users.getClassNum());
		recruit.setcNum(users.getcNum());
		List<Recruit> recruits = recruitService.queryAllBycNum(recruit);
		for (int j = 0; j < recruits.size(); j++) {
			Date date = recruits.get(j).getRecruitSTime();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = simpleDateFormat.format(date);
			recruits.get(j).setState(dateString);
			User user1 = new User();
			String uNameString = userService.queryUnameByUid(recruits.get(j).getuId());
			user1.setuName(uNameString);
			recruits.get(j).setUser1(user1);
		}
		
		return recruits;
	}
	
	//添加招聘信息
		@ResponseBody
		@RequestMapping("/add")
		public String recruitAdd( Recruit recruit,HttpServletRequest httpServletRequest) {	
			System.out.println("ccc"+recruit.getcNum());
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
			recruit.setRecruitSTime(currentDate);
			recruitService.insertSelective(recruit);	
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("result", true);
			
			return jsonObject.toString();
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
	public List<Recruit> queryRecruitTable(User user) {
		Integer integer = user.getuId();
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
		ModelAndView modelAndView = new ModelAndView();	
		String recruit2 = recruitService.queryRecruitTextByRecruitNum(recruit.getRecruitNum());
		recruit.setRecruitText(recruit2);
		modelAndView.addObject("recruit",recruit);	
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
	public List<Recruit> queryRecruitTeacherTable(User user) {
		
		Integer integer = user.getuId();
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
	
	//教师申请发布信息
	@RequestMapping("/teacherApplyRecruit")
	public ModelAndView teacherApplyRecruit(Recruit recruit,HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		Integer integer = recruit.getRecruitNum();
		recruit = recruitService.queryAllByRecruitNum(integer);
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		recruit.setuId2(101);
		recruitService.updateByPrimaryKeySelective(recruit);
		modelAndView.addObject("mainPage", "mainPage.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//结束课程
	@RequestMapping("/endTeacher")
	public ModelAndView endTeacher(Recruit recruit,HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		Integer integer = recruit.getRecruitNum();
		recruit = recruitService.queryAllByRecruitNum(integer);
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		recruit.setRecruitEDate(currentDate);
		recruitService.updateByPrimaryKeySelective(recruit);
		modelAndView.addObject("mainPage", "recruit/recruitTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//教师记录评价跳转
	@RequestMapping("/appraiseTeacherTable")
	public ModelAndView appraiseTeacherTable(Recruit recruit,HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		Integer integer = recruit.getRecruitNum();
		recruit = recruitService.queryAllByRecruitNum(integer);
		User user = userService.queryTeacherByuId(recruit.getuId2());
		recruit.setUser2(user);
		modelAndView.addObject("recruit",recruit);
		modelAndView.addObject("mainPage", "recruit/appraiesTeacher.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//电话查询积分验证
	@ResponseBody
	@RequestMapping("/lookPhone")
	public String lookPhone( Credit credit) {
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		JSONObject jsonObject = new JSONObject();
		String string = creditService.queryCreditSum(credit.getuId());
		int i = Integer.parseInt(string);
		if(i>300) {
			credit.setCreditSum(-300);
			credit.setCreditText("查看教师资料");
			credit.setCreditDate(currentDate);
			creditService.insertSelective(credit);
			jsonObject.put("result", true);
		}else {
			jsonObject.put("result", false);
		}
		return jsonObject.toString();
	}
	
	//电话查询积分验证
	@ResponseBody
	@RequestMapping("/lookPhone2")
	public User lookPhone2( User user) {
		User users = userService.queryTeacherByuId(user.getuId());
		return users;
		
	}
		
	//招聘记录页面跳转(教师端)
		@RequestMapping("/studentHistory")
		public ModelAndView teacherHistory(HttpServletRequest httpServletRequest) {
			
			ModelAndView modelAndView = new ModelAndView();		
			modelAndView.addObject("mainPage", "recruit/studentHistoryTable.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		
		//招聘记录查询(教师端)
		@ResponseBody
		@RequestMapping("/queryRecruitStudentTable")
		public List<Recruit> queryRecruitStudentTable(User user) {
			
			Integer integer = user.getuId();
			List<Recruit> recruits=recruitService.queryRecruitByUid2(integer);
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

	
}
