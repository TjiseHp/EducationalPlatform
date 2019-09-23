package com.hp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.Role;
import com.hp.bean.User;
import com.hp.service.RoleService;



@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	public RoleService roleService;

	
	@RequestMapping("/queryAllRole")
	public ModelAndView queryAllRole(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "rNum") Integer rNum) {
		HttpSession httpSession = httpServletRequest.getSession();
		ModelAndView modelAndView = new ModelAndView();
		Role role =  roleService.queryAllRole(rNum);
		
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("role",role);
		modelAndView.addObject("mainPage", "role/roleTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;

	}
	
	@RequestMapping("/updateRole")
	public ModelAndView updateRole
			(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "rNum") Integer rNum) {
		HttpSession httpSession = httpServletRequest.getSession();
		Role role = roleService.queryRoleByrNum(rNum);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("role",role);
		modelAndView.addObject("mainPage", "role/updateRole.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
}
