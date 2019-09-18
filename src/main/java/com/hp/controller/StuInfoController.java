package com.hp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.User;
import com.hp.service.StuInfoService;
import com.hp.service.UserService;

@Controller
@RequestMapping("/stuInfo")
public class StuInfoController {
	
	@Autowired
	public StuInfoService stuInfoService;
	
	@Autowired
	public UserService userService;
	
	//查询学生个人信息
	@RequestMapping("/stuInfoCenter")
	public User PersonalInfo(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "uId") Integer uId) {
		HttpSession httpSession = httpServletRequest.getSession();
		User user = stuInfoService.queryStudentInfoById(uId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("user",user);
		modelAndView.addObject("mainPage", "stuInfo/stuInfoCenter.jsp");
		modelAndView.setViewName("main");		
		return user;		
	}
	
	//修改个人信息页面跳转
		@RequestMapping("/updateStuInfo")
		public ModelAndView updateStuInfo
				(HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uId") Integer uId) {
			HttpSession httpSession = httpServletRequest.getSession();
			User user = userService.queryStudentByuId(uId);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("user",user);
			modelAndView.addObject("mainPage", "stuInfo/updateStuInfo.jsp");
			modelAndView.setViewName("main");
			System.out.println("456");
			return modelAndView;
		}
		
//		//更新学生信息
//		@RequestMapping(value = "/doUpdateStuInfo",produces = {"text/html;charset=utf-8"})
//		public String doUpdateStuInfo(User user,HttpServletRequest httpServletRequest) {
//			System.out.println("123 "+user.getuId());
//			userService.updateByPrimaryKeySelective(user);
//			return "redirect:stuInfoCenter";
//		}
		
		//更新学生信息
		@ResponseBody
		@RequestMapping("/doUpdateStuInfo")
		public String doUpdateStuInfo(HttpSession session,User user) {
			System.out.println("update："+user.getuId());
			JSONObject json = new JSONObject();
			int row = userService.updateByPrimaryKeySelective(user);		
			if(row==1) {
				System.out.println("成功");
				json.put("result", true);
			}else {
				json.put("result", false);
			}
			return json.toString();
		}
	
	
	

}
