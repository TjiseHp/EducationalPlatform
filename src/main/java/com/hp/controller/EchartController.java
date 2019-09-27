package com.hp.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.javassist.expr.NewArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.hp.bean.Appraise;
import com.hp.bean.Class;
import com.hp.bean.Credit;
import com.hp.bean.Pay;
import com.hp.bean.Recruit;
import com.hp.bean.User;
import com.hp.service.EchartService;

@Controller
@RequestMapping("/echart")
public class EchartController {
	@Autowired
	EchartService echartService;
	
	
	//test
	@RequestMapping("test")
	public ModelAndView test(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("mainPage", "echart/test2.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//test3
		@RequestMapping("test3")
		public ModelAndView test3(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			java.util.List<Class> list = echartService.queryAll();
			modelAndView.addObject("list",list);
			modelAndView.addObject("mainPage", "echart/test.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
	
	//实现
	@RequestMapping("test2")
	public JSONObject test2() {
				java.util.List<com.hp.bean.Class> xlist = new ArrayList<com.hp.bean.Class>();
//				Map<String,Object> xmap=new HashMap<String,Object>();
////		        /*接受数据*/
				xlist=echartService.queryAll();
////	       		 /*创建装载月销量数组*/
//				int[] xxdata=new int[xlist.size()];
////		        /*创建装载月份数组*/
//				String[] xdata=new String[xlist.size()];
////		        /*定义数组下标*/
//				int i=0;
////		        /*遍历数据库数据*/
//				for (Class class1 : xlist) {
////		            /*将销量放入数组*/
//					xxdata[i]=class1.getClassNum();
////		            /*将月份放入数组*/
//					xdata[i]=class1.getClassKind();
//					i++;
//				}
//				//将两个数组存入集合中
//				xmap.put("classKind", xdata);
//				xmap.put("classNum", xxdata);
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("data", xlist);
	//			JSONArray jsonArray = JSONArray.fromObject(xlist);
				return jsonObject;
	}
	
	
		//积分充值图表
		@RequestMapping("creditEchart")
		public ModelAndView creditEchart(User user,HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			user.setuId(1);
			java.util.List<Credit> list = echartService.queryCreditEchart(user.getuId());
			modelAndView.addObject("list",list);
			modelAndView.addObject("mainPage", "echart/creditEchart.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		
		//消费记录图表
		@RequestMapping("payEchart")
		public ModelAndView payEchart(User user,HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			user.setuId(1);
			java.util.List<Credit> list = echartService.queryCreditPayEchart(user.getuId());
			java.util.List<Credit> list2 = echartService.queryCreditPayByThingEchart(user.getuId());
			modelAndView.addObject("list2",list2);
			modelAndView.addObject("list",list);
			modelAndView.addObject("mainPage", "echart/payEchart.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		//管理员查看充值情况
		@RequestMapping("adminLookPay")
		public ModelAndView adminLookPay(User user,HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			java.util.List<Pay> list = echartService.queryComplatePay();
			modelAndView.addObject("list",list);
			modelAndView.addObject("mainPage", "echart/adminLookPay.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
}
