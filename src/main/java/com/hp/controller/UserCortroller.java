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
	public ModelAndView updateStudent
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
	public String doUpdateStudent(User user,HttpServletRequest httpServletRequest) {
		userService.updateByPrimaryKeySelective(user);
		return "redirect: studentTable";
	}
	
	//模糊查询
	@RequestMapping("/searchStudent")
	public ModelAndView searchStudent
		(		@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,
				@RequestParam(required = true,value = "search") String search,
				HttpServletRequest httpServletRequest) {
		System.out.println("模糊查询:"+search);
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		PageHelper.startPage(pageNum, pageSize);
		List<User> users = userService.queryStudentByExample(search);
		PageInfo<User> pageInfo = new PageInfo<User>(users);
		System.out.println("users size:"+users.size());
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "user/studentTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//删除教师
		@RequestMapping("/deleteTeacher")
		public String deleteTeacher(
				HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uId") Integer uId) {
			int row = userService.deleteByPrimaryKey(uId);
			return "redirect:teacherTable";
		}
		

	//插入学生信息--页面跳转
	@RequestMapping("/insertStudent")
	public ModelAndView insertStudent(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "user/insertStudent.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}

	//教师更新页面跳转
	@RequestMapping("/updateTeacher")
	public ModelAndView updateTeacher
			(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "uId") Integer uId) {
		HttpSession httpSession = httpServletRequest.getSession();
		User user = userService.queryTeacherByuId(uId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("user",user);
		modelAndView.addObject("mainPage", "user/updateTeacher.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}

	//执行插入学生信息
	@RequestMapping(value = "/doInsertStudent",produces = {"text/html;charset=utf-8"})
	public String doInsertStudent(User user,HttpSession httpSession) {
		user.setgNum(1);
		userService.insertSelective(user);
		return "redirect: studentTable";
	}
	
	//更新学生信息
		@RequestMapping(value = "/doUpdateTeacher",produces = {"text/html;charset=utf-8"})
		public String updateTeacher(User user,HttpServletRequest httpServletRequest) {
			userService.updateByPrimaryKeySelective(user);
			return "redirect: teacherTable";
		}
		
	//招聘中心在职教师查询
	@RequestMapping("/teacherByworking")
	public ModelAndView teacherByworking(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,User user,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);
		
		user.setClassNum(4);
		user.setcNum(14);
		
		List<User> teacher=userService.queryTeacherByworking(user);
		PageInfo<User> pageInfo = new PageInfo<User>(teacher);		
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "recruit/teacherByworking.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	
	
}
