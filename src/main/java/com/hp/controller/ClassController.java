package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hp.bean.City;
import com.hp.bean.Class;
import com.hp.service.ClassService;

@Controller
@RequestMapping("/class")
public class ClassController {
	@Autowired
	ClassService classService;
	
	//下拉菜单显示科目
	@RequestMapping("/class1")
	@ResponseBody
	public List<Class> city1() {
		List<Class> list = classService.queryAllClass();
		return list;
	}

}
