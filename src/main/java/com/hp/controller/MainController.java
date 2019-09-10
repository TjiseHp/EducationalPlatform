package com.hp.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.hp.bean.User;
import com.hp.service.UserService;

/**
 * *
 * @author ThinkPad
 *	本控制器为公共区 主控制器。
 */
@Controller
public class MainController {
	
	@Autowired
	public UserService userService;
	
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
		User loginUser = (User)httpSession.getAttribute("loginUser");
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("loginUser",loginUser);
		modelAndView.addObject("mainPage", null);
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//跳转登录注册页
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	
	/***
	 * 	【用户登录跳转，在测试期间不添加权限模块，之后记得来添加】
	 * @param session
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/doUserLogin")
	public String doUserLogin(HttpSession session,User user) {
		System.out.println("登录："+user.getuAcc()+" "+user.getuPwd());
		JSONObject json = new JSONObject();
		User loginUser = userService.queryLoginByUser(user);
		if (loginUser != null) {
			System.out.println("登录用户正常："+loginUser.getuName());
			session.setAttribute("loginUser", loginUser);
			json.put("result", true);
			//之后务必记得在这里添加权限信息!!!!!!!!!!!!!
		}else {
			System.out.println("登录用户不正常");
			json.put("result", false);
		}
		
		/*
		Account_num loginNum = loginService.queryLoginNumForUser(account_num);
		if (loginNum != null) {
			System.out.println(loginNum.getAccNo()+" "+loginNum.getAccNum());
			User loginUser = loginService.queryLoginUserForAdmin(loginNum.getAccNo());
			
			session.setAttribute("loginNum", loginNum);
			session.setAttribute("loginUser", loginUser);
			json.put("result", true);
			json.put("identity", "user");
		} else {
			loginNum = loginService.queryLoginNumForAdmin(account_num);
			if (loginNum != null) {
				System.out.println(loginNum.getAccNo()+" "+loginNum.getAccNum());
				User loginUser = loginService.queryLoginUserForAdmin(loginNum.getAccNo());
				
				
				List<Menu> menus = menuService.queryMenuByUser(loginUser);
				Menu rootMenu=null;
				Map<Integer, Menu> menuMap = new HashMap<Integer, Menu>();
				for(Menu m: menus) {
					menuMap.put(m.getMenuNo(),m);
				}
				for(Menu m: menus) {
					Menu child= m;
					if(child.getMenuUpperNo()==-1) {
						rootMenu=child;
					}else {
						Menu parent=menuMap.get(child.getMenuUpperNo());
						parent.getChildren().add(child);
					}
				}
				session.setAttribute("rootMenu", rootMenu);
				
				session.setAttribute("loginNum", loginNum);
				session.setAttribute("loginUser", loginUser);
				json.put("result", true);
				json.put("identity", "admin");
			}else {
				json.put("result", false);
			}
		}
		*/
		
		return json.toString();
	}
	
	//执行注册操作
	@ResponseBody
	@RequestMapping("/doUserReg")
	public String doUserReg(HttpSession session,User user) {
		System.out.println("注册："+user.getuAcc()+" "+user.getuPwd());
		JSONObject json = new JSONObject();
		/*
		Account_num loginNum = loginService.queryLoginNumForUser(account_num);
		if (loginNum == null) {
			account_num.setAccState("正常");
			int i = loginService.insertSelective(account_num);
			if (i<=0) {
				json.put("result", false);
			}else {
				account_num = loginService.queryLoginNumForNumAndPwd(account_num);
				User newUser = new User();
				newUser.setAccNo(account_num.getAccNo());
				String gName ="用户组";
				newUser.setgNo(loginService.queryGnoFromGroupForGname(gName));
				int j = loginService.insertSelective(newUser);
				if (j<=0) {
					json.put("result", false);
					userService.deleteByPrimaryKey(account_num.getAccNo());
				}else {
					json.put("result", true);
				}
				}
			
		}else {
			json.put("result", false);
		}
		*/
		return json.toString();
	}
	
}
