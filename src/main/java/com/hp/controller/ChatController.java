package com.hp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.Chat;
import com.hp.bean.User;
import com.hp.service.UserService;

@Controller
@RequestMapping("/chat")
public class ChatController {
	@Autowired
	public UserService userService;
		
	//教师列表页面跳转
	@RequestMapping("/stuMessageCenter")
	public ModelAndView stuMessageCenter(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "chat/stuMessageCenter.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	//查询教师列表
	@ResponseBody
	@RequestMapping("/queryAllTeacher")
	public List<User> queryAllTeacher() {
		List<User> teacher = userService.queryAllTeacher();
		return teacher;
	}
	
	//聊天界面跳转
	@RequestMapping("/chatInfo")
	public ModelAndView chatInfo(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "chat/chatInfo.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//插入聊天信息
	@RequestMapping("/doInsertChatInfo")
	public String doInsertChatInfo(Chat chat,HttpSession httpSession) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date=df.format(new Date());// new Date()为获取当前系统时间
        Date date1 = df.parse(date);
        System.out.println("系统当前时间"+date1);
		chat.setChatDate(date1);
//		chatService.insertSelective(chat);
		return "redirect: ";
	}
	
	

}
