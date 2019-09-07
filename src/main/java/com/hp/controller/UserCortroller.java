package com.hp.controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
public class UserCortroller  {
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public CreditService creditService;
	
	
	//查询全部学生(会员)列表，包含积分总和
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
		}
		PageInfo<User> pageInfo = new PageInfo<User>(students);
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "user/studentTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//查询全部教师列表
	@RequestMapping("/teacherTable")
	public ModelAndView teacherTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		List<User> teacher=userService.queryAllTeacher();
		PageInfo<User> pageInfo = new PageInfo<User>(teacher);
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "user/teacherTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//删除学生
	@RequestMapping("/deleteStudent")
	public String deleteStudent(
			HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "uId") Integer uId) {
		System.out.println("deleteStudent:"+uId);		
		int row = userService.deleteByPrimaryKey(uId);
		System.out.println("删除了"+row+"行数据");
		return "redirect:studentTable";
	}
	
	//学生更新页面跳转
	@RequestMapping("/updateStudent")
	public ModelAndView updateCourier
			(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "uId") Integer uId) {
		HttpSession httpSession = httpServletRequest.getSession();
		User user = userService.queryStudentByuId(uId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("user",user);
		modelAndView.addObject("mainPage", "user/updateStudent.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//更新学生信息
	@RequestMapping(value = "/doUpdateStudent",produces = {"text/html;charset=utf-8"})
	public String updateCourier(User user,HttpServletRequest httpServletRequest) {
		userService.updateByPrimaryKeySelective(user);
		return "redirect: studentTable";
	}
	
	
	
	
	
	
	
}
