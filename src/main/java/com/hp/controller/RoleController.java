package com.hp.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hp.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	public RoleService roleService;
	
	@RequestMapping("/assignTable")
	public ModelAndView assignTable(
			HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "roNo") Integer roNo) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("roNo",roNo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "role/assignTable.jsp");
		modelAndView.setViewName("Main");
		return modelAndView;
	}
	
	
}
