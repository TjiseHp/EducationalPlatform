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

import com.hp.bean.City;
import com.hp.bean.Class;
import com.hp.bean.User;
import com.hp.service.CityService;
import com.hp.service.ClassService;
import com.hp.service.CreditService;
import com.hp.service.StuInfoService;
import com.hp.service.UserService;

@Controller
@RequestMapping("/stuInfo")
public class StuInfoController {
	
	@Autowired
	public StuInfoService stuInfoService;
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public CreditService creditService;
	
	@Autowired
	public ClassService classService;
	
	@Autowired
	public CityService cityService;
	
	//查询学生个人信息
	@RequestMapping("/stuInfoCenter")
	public ModelAndView  PersonalInfo(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "uId") Integer uId) {
		HttpSession httpSession = httpServletRequest.getSession();
		User user = stuInfoService.queryStudentInfoById(uId);
		
		City city = cityService.queryCityByCnum(user.getcNum());
		  if (city !=null) {
			user.setCity(city);
		}
		
		//剩余积分
		String credit = creditService.queryCreditSum(uId);
		if (credit==null||credit.equals("")) {
			credit="0";
		}
		user.setCredit(credit);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("user",user);
		modelAndView.addObject("mainPage", "stuInfo/stuInfoCenter.jsp");
		modelAndView.setViewName("main");		
		return modelAndView ;		
	}
	
	//修改个人信息页面跳转
		@RequestMapping("/updateStuInfo")
		public ModelAndView updateStuInfo
				(HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uId") Integer uId) {
			HttpSession httpSession = httpServletRequest.getSession();
			User user = stuInfoService.queryStudentInfoById(uId);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("user",user);
			modelAndView.addObject("mainPage", "stuInfo/updateStuInfo.jsp");
			modelAndView.setViewName("main");
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
		public String doUpdateStuInfo(HttpSession session,HttpServletRequest request) {
			JSONObject json = new JSONObject();
			String uId = request.getParameter("uId");
			String cNum = request.getParameter("cNum");
			String uEmail = request.getParameter("uEmail");
			String uSex = request.getParameter("uSex");
			String uName = request.getParameter("uName");
			String uPhone = request.getParameter("uPhone");
			System.out.println("cNum:"+cNum);
			User user = new User();
			user.setuId(Integer.valueOf(uId));
			if(cNum.contains("市")) {
				user.setcNum(cityService.querycNumBycCity(cNum));
			}else {
			user.setcNum(Integer.valueOf(cNum));}
			//查询当前用户的email在数据库中的条数
			int row = userService.queryUserCountByEmail(uEmail);
			//通过id查询出当前用户的email是否和传来的email相同
			User user1 = userService.queryStudentByuId(Integer.valueOf(uId));
			if(user1.getuEmail().equals(uEmail)||row==0) {
			    user.setuEmail(uEmail);
			    user.setuSex(uSex);
			    user.setuName(uName);
			    user.setuPhone(uPhone);			
				System.out.println("学生getuId："+user.getuId());
				System.out.println("学生getcNum："+user.getcNum());
				int row2 = userService.updateByPrimaryKeySelective(user);		
				if(row2==1) {
					System.out.println("更新学生信息成功");
					json.put("result", true);
				}
			}				
			else {
				json.put("result", false);
			}
			return json.toString();
		}
		
		//修改密码--跳转
		@RequestMapping("/updateUpwd")
		public ModelAndView updateUpwd
				(HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uId") Integer uId) {
			HttpSession httpSession = httpServletRequest.getSession();
			User user = stuInfoService.queryStudentInfoById(uId);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("user",user);
			modelAndView.addObject("mainPage", "stuInfo/updateUpwd.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		
		//修改密码
		@ResponseBody
		@RequestMapping("/doUpdateUpwd")
		public String doUpdateUpwd(HttpSession session,User user) {
			System.out.println("update："+user.getuId()+user.getuPwd());
			JSONObject json = new JSONObject();
			int row = userService.updateByuPwd(user);		
			if(row==1) {
				System.out.println("成功");
				json.put("result", true);
			}else {
				json.put("result", false);
			}
			return json.toString();
		}
		
		
	
	

}
