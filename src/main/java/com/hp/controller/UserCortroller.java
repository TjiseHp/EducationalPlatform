package com.hp.controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.City;
import com.hp.bean.Group;
import com.hp.bean.Role;
import com.hp.bean.User;
import com.hp.service.CityService;
import com.hp.service.ClassService;
import com.hp.service.CreditService;
import com.hp.service.GroupService;
import com.hp.service.RoleService;
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
	
	@Autowired
	public ClassService classService;
	
	@Autowired
	public CityService cityService;
	
	@Autowired
	public GroupService groupService;
	
	@Autowired
	public RoleService roleService;
	
	//查询全部学生(会员)列表,包含积分总和
	@ResponseBody
	@RequestMapping("/queryAllStudent")
	public List<User> queryAllStudent() {
		List<User> students = userService.queryAllStudent();
		for(User u:students) {
			String credit = creditService.queryCreditSum(u.getuId());
			if (credit==null||credit.equals("")) {
				credit="0";
			}
			u.setCredit(credit);
		}
		return students;
	}
	
	//查询学生信息--页面跳转
	@RequestMapping("/studentTable2")
	public ModelAndView studentTable2(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "user/studentTable2.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//插入学生信息--页面跳转
	@RequestMapping("/insertStudent")
	public ModelAndView insertStudent(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "user/insertStudent.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//执行插入学生信息
	@RequestMapping(value = "/doInsertStudent",produces = {"text/html;charset=utf-8"})
	public String doInsertStudent(User user,HttpSession httpSession) {
		user.setgNum(1);
		userService.insertSelective(user);
		return "redirect: studentTable2";
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
		return "redirect: studentTable2";
	}
	

	//删除学生信息2
	@ResponseBody
	@RequestMapping("/deleteStudent2")
	public String deleteStudent2(User student) {
		System.out.println("deleteStudent:"+student.getuId());
		JSONObject json = new JSONObject();
		int row = userService.deleteByPrimaryKey(student.getuId());
		System.out.println("删除了"+row+"行数据");
		if (row==1) {
			json.put("result", true);
		}else {
			json.put("result", false);
		}
		return json.toString();
	}
	
	//查询教师信息--页面跳转
	@RequestMapping("/teacherTable2")
	public ModelAndView teacherTable2(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "user/teacherTable2.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
		
	//查询全部教师列表
	@ResponseBody
	@RequestMapping("/queryAllTeacher")
	public List<User> queryAllTeacher() {
		List<User> teacher = userService.queryAllTeacher();
		for(User t:teacher) {
			if (t.getuExp()==null) {
				t.setuExp(0);
			}
			int exp1=t.getuExp();
			int exp2=exp1/100;
			t.setuExp(exp2);
		}	
		return teacher;
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

	//更新教师信息
	@RequestMapping(value = "/doUpdateTeacher",produces = {"text/html;charset=utf-8"})
	public String updateTeacher(User user,HttpServletRequest httpServletRequest) {
		userService.updateByPrimaryKeySelective(user);
		return "redirect: teacherTable2";
	}
	
	//插入教师信息--页面跳转
	@RequestMapping("/insertTeacher")
	public ModelAndView insertTeacher(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "user/insertTeacher.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	

	//执行插入教师信息
	@RequestMapping(value = "/doInsertTeacher",produces = {"text/html;charset=utf-8"})
	public String doInsertTeacher(User user,HttpSession httpSession) {
		user.setgNum(2);
		userService.insertSelective(user);
		return "redirect: teacherTable2";
	}
	
	
	//删除教师信息2
	@ResponseBody
	@RequestMapping("/deleteTeacher2")
	public String deleteTeacher2(User teacher) {
		System.out.println("deleteTeacher2:"+teacher.getuId());
		JSONObject json = new JSONObject();
		int row = userService.deleteByPrimaryKey(teacher.getuId());
		System.out.println("删除了"+row+"行数据");
		if (row==1) {
			json.put("result", true);
		}else {
			json.put("result", false);
		}
		return json.toString();
	}
	
	
		
	//招聘中心在职教师查询跳转
	@RequestMapping("/teacherByworking")
	public ModelAndView teacherByworking(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "recruit/teacherByworking.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//招聘中心在职教师查询
	@ResponseBody
	@RequestMapping("/queryTeacherByworking")
	public List<User> queryTeacherByworking(User user) {
		
		List<User> teacher=userService.queryTeacherByworking();
		for(int i = 0;i<teacher.size();i++) {
			int j = teacher.get(i).getuExp()/100;
			teacher.get(i).setuExp(j);
			City city = cityService.queryCityByCnum(teacher.get(i).getcNum());
			com.hp.bean.Class class1 = classService.queryAllByClassNum(teacher.get(i).getClassNum());
			teacher.get(i).setCity(city);
			teacher.get(i).setuClass(class1);
		}
		
		return teacher;
	}
	
	//用户(老师）个人信息页
	@RequestMapping("/teacherInfo")
	public ModelAndView teacherInfo(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "uId") Integer uId) {
		HttpSession httpSession = httpServletRequest.getSession();
		ModelAndView modelAndView = new ModelAndView();
		User user = userService.queryTeacherByInfo(uId);
		Group group =  groupService.queryGroupBygNum(user.getgNum());
		if(group!=null) {
			Role role = roleService.queryRoleByroNo(group.getRoNo());
			if(role!=null) {
				group.setRole(role);
				user.setGroup(group);
			}
		}
		
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("user",user);
		modelAndView.addObject("mainPage", "user/teacherInfo.jsp");
		modelAndView.setViewName("main");
		return modelAndView;

	}
	
	
	@RequestMapping("/updateTeacherInfo")
	public ModelAndView updateTeacherInfo(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "uId") Integer uId) {
		HttpSession httpSession = httpServletRequest.getSession();
		User user = userService.queryTeacherByInfo(uId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("user",user);
		modelAndView.addObject("mainPage", "user/updateTeacherInfo.jsp");
		modelAndView.setViewName("main");
		System.out.println("456");
		return modelAndView;
	}

	//更新老师信息
	@ResponseBody
	@RequestMapping("/doUpdateTeacherInfo")
	public String doUpdateTeacherInfo(HttpSession session,User user) {
		System.out.println("update："+user.getuId());
		JSONObject json = new JSONObject();
		int row = userService.updateByPrimaryKeySelective(user);		
		if(row==1) {
			System.out.println("成功");
			json.put("result", true);
		}else {
			json.put("result", false);
		}
		return json.toString();
	}
	
	@RequestMapping("/returnTest")
	public ModelAndView returnTest(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "test/returnTest.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	

	@RequestMapping("/studentReturn")
	public ModelAndView studentReturn(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "user/studentReturn.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	

	@RequestMapping("/teacherReturn")
	public ModelAndView teacherReturn(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("mainPage", "user/teacherReturn.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
}
