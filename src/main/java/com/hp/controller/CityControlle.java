package com.hp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.City;
import com.hp.service.CityService;

@Controller
@RequestMapping("/city")
public class CityControlle {
	@Autowired
	CityService cityService;

		//省份
		@RequestMapping("/city1")
		@ResponseBody
		public List<City> city1() {
			List<City> list = cityService.queryCityAllprovince();
			return list;
		}
		
		//市
		@RequestMapping("/city2")
		@ResponseBody
		public List<City> city2(City city) {
			List<City> list = cityService.queryCityBycProvince(city);
			return list;
		}
}
