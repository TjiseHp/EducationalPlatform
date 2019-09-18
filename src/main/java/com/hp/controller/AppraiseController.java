package com.hp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.Appraise;
import com.hp.bean.Recruit;
import com.hp.service.AppraiseService;

@Controller
@RequestMapping("/appraise")
public class AppraiseController {
	
	@Autowired
	AppraiseService appraiseService;
	
	//教师记录评价
	@RequestMapping("/appraiseTeacher")
	public ModelAndView appraiseTeacher(Recruit recruit,HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		Appraise appraise = new Appraise();
		appraise.setaText(recruit.getState());
		appraise.setuId(recruit.getuId());
		appraise.setuId2(recruit.getuId2());
		//recruit中没有此实体，固用cNum代替
		appraise.setaLeave(recruit.getcNum());
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		appraise.setaDate(currentDate);
		appraiseService.insertSelective(appraise);
		modelAndView.addObject("mainPage", "mainPage.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//是否已评价验证
	@ResponseBody
	@RequestMapping("/appraiseApply")
	public String appraiseApply(HttpSession session,Recruit recruit) {
		JSONObject json = new JSONObject();
		Appraise appraise = new Appraise();
		appraise.setuId(recruit.getuId());
		appraise.setuId2(recruit.getuId2());
		if(	appraiseService.queryAppraiseByUid(appraise)==null) {
			json.put("result", true);
		}else {
			json.put("result", false);
		}
		return json.toString();
	}
}
