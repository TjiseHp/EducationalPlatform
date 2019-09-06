package com.hp.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * *
 * @author ThinkPad
 *	本控制器为公共区 主控制器。
 */
@Controller
public class MainController {
	
	//退出登录
	@RequestMapping("/loginOut")
	public String logingOut(HttpSession session) {
		session.invalidate();	
		return "redirect:userLogin";	
	}
	
	//控制主页跳转
	@RequestMapping("/main")
	public ModelAndView adminMain(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
//		Account_num loginNum = (Account_num)httpSession.getAttribute("loginNum"); 	[暂时不获取登录信息，登录页做好了以后再恢复]
//		User loginUser = (User)httpSession.getAttribute("loginUser");				[暂时不获取登录信息，登录页做好了以后再恢复]
		modelAndView.addObject("httpSession",httpSession);
//		modelAndView.addObject("loginNum",loginNum);								[暂时不获取登录信息，登录页做好了以后再恢复]
//		modelAndView.addObject("loginUser",loginUser);								[暂时不获取登录信息，登录页做好了以后再恢复]
		modelAndView.addObject("mainPage", null);
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
}
