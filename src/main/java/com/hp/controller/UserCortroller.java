package com.hp.controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.User;
import com.hp.service.CreditService;
import com.hp.service.UserService;
import com.hp.util.PageUtil;

/**
 * *
 * @author ThinkPad
 *	本控制器为用户控制器
 */
@Controller
@RequestMapping("/user")
public class UserCortroller {
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public CreditService creditService;
	
	@ResponseBody
	@RequestMapping("/TeacherTable")
	public Object teacherTable() {
		List<User> teacher=userService.queryAllTeacher();
		return teacher;
	}
	
	
	//查询全部学生(会员)列表
	@RequestMapping("/studentTable")
	public ModelAndView studentTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		List<User> students = userService.queryAllStudent();
		for(User u:students) {
			String credit = creditService.queryCreditSum(u.getuId());
			if (credit==null||credit.equals("")) {
				credit="0";
			}
			u.setCredit(credit);
			System.out.println(u.getCredit());
			
		}
		PageInfo<User> pageInfo = new PageInfo<User>(students);
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "user/studentTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	
	
	
}
