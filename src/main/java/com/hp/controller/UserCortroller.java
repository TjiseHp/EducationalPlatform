package com.hp.controller;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
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
import com.hp.bean.Chat;
import com.hp.bean.Check;
import com.hp.bean.City;
import com.hp.bean.Class;
import com.hp.bean.Group;
import com.hp.bean.Role;
import com.hp.bean.User;
import com.hp.service.AppraiseService;
import com.hp.service.CheckService;
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
	
	@Autowired
	public CheckService checkService;
	
	@Autowired
	public AppraiseService appraiseService;
	
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
//	@RequestMapping(value = "/doInsertStudent",produces = {"text/html;charset=utf-8"})
//	public String doInsertStudent(User user,HttpSession httpSession) {
//		System.out.println("执行插入学生信息");
//		System.out.println("学生性别："+user.getuSex()+"学生城市："+user.getCity().getcCity());
//		user.setgNum(1);
//		userService.insertSelective(user);
//		return "redirect: studentTable2";
//	}
	
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
	@ResponseBody
	@RequestMapping(value = "/doUpdateStudent",produces = {"text/html;charset=utf-8"})
	public String doUpdateStudent(User user,HttpServletRequest httpServletRequest) {
		System.out.println("执行修改学生信息");
		JSONObject json = new JSONObject();     
	    int row= userService.updateByPrimaryKeySelective(user);
	    System.out.println(user.getcNum());
		if(row==1) {
			json.put("result", true);
		}
		else {
			json.put("result", false);
		}
		return json.toString();
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
		Class uClass = classService.queryClassByClassNum(user.getClassNum());
		  if (uClass !=null) {
			  user.setuClass(uClass);	
		}
		  
		  City city = cityService.queryCityByCnum(user.getcNum());
		  if (city !=null) {
			user.setCity(city);
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("user",user);
		modelAndView.addObject("mainPage", "user/updateTeacher.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}

	//更新教师信息
	@ResponseBody
	@RequestMapping("/doUpdateTeacher")
	public String doUpdateTeacher(
			@RequestParam(value = "uId") Integer uId,
			@RequestParam(value = "cNum") Integer cNum,
			@RequestParam(value = "classNum") Integer classNum,
			@RequestParam(value = "uName") String uName,
			@RequestParam(value = "uSex") String uSex,
			@RequestParam(value = "uPhone") String uPhone,
			@RequestParam(value = "uEmail") String uEmail
			) {
		User user = new User();
		user.setuId(uId);
		user.setcNum(cNum);
		user.setClassNum(classNum);
		user.setuName(uName);
		user.setuSex(uSex);
		user.setuPhone(uPhone);
		user.setuEmail(uEmail);
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
		
		if(user.getuExp()!=0 && user.getuExp()!=null) {
			user.setLeave(user.getuExp()/50);
		}else {
			user.setLeave(0);
		}
		
		Group group =  groupService.queryGroupBygNum(user.getgNum());
		if(group!=null) {
			Role role = roleService.queryRoleByroNo(group.getRoNo());
			if(role!=null) {
				group.setRole(role);
				user.setGroup(group);
			}
		}
		
		Check check = checkService.queryCheckBycheckNum(user.getCheckNum());
		 if(check != null) {
			 user.setCheck(check);
		 }
		 
		 Class uClass = classService.queryClassByClassNum(user.getClassNum());
		  if (uClass !=null) {
			  user.setuClass(uClass);	
		}
		  
		  City city = cityService.queryCityByCnum(user.getcNum());
		  if (city !=null) {
			user.setCity(city);
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
		Class uClass = classService.queryClassByClassNum(user.getClassNum());
		  if (uClass !=null) {
			  user.setuClass(uClass);	
		}
		  
		  City city = cityService.queryCityByCnum(user.getcNum());
		  if (city !=null) {
			user.setCity(city);
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("user",user);
		modelAndView.addObject("mainPage", "user/updateTeacherInfo.jsp");
		modelAndView.setViewName("main");
		System.out.println("进入教师个人中心");
		return modelAndView;
	}

	//更新老师信息
	@ResponseBody
	@RequestMapping("/doUpdateTeacherInfo")
	public String doUpdateTeacherInfo(
			@RequestParam(value = "uId") Integer uId,
			@RequestParam(value = "cNum") Integer cNum,
			@RequestParam(value = "classNum") Integer classNum,
			@RequestParam(value = "uName") String uName,
			@RequestParam(value = "uSex") String uSex,
			@RequestParam(value = "uPhone") String uPhone,
			@RequestParam(value = "uEmail") String uEmail
			) {
		User user = new User();
		user.setuId(uId);
		user.setcNum(cNum);
		user.setClassNum(classNum);
		user.setuName(uName);
		user.setuSex(uSex);
		user.setuPhone(uPhone);
		user.setuEmail(uEmail);
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
	
	//修改密码--跳转
	@RequestMapping("/updateTeacherUpwd")
	public ModelAndView updateTeacherUpwd(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "uId") Integer uId) {
		HttpSession httpSession = httpServletRequest.getSession();
		System.out.println("heihei");
		User user = userService.queryTeacherByInfo(uId);
		System.out.println("heihei1233");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("user",user);
		modelAndView.addObject("mainPage", "user/updateTeacherUpwd.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	//修改教师密码
	@ResponseBody
	@RequestMapping("/doUpdateTeacherUpwd")
	public String doUpdateTeacherUpwd(HttpSession session,User user) {
		System.out.println("update："+user.getuId()+user.getuName());
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
	
	
	@ResponseBody
	@RequestMapping("/cProvince")
	public List<City> cProvince(){	
		List<City> clist = userService.queryAllCityBycProvince();	
		return clist;
	}
	

	@ResponseBody
	@RequestMapping("/cCity")
	public List<City> cCity(City city){
		List<City> ccity = userService.queryAllCity(city);
		System.out.println(ccity.get(0).getcNum());
		return ccity;
	}	
	
	@ResponseBody
	@RequestMapping("/cClass")
	public List<Class> cClass(Class uclass){
		List<Class> cClass = userService.queryAllClass(uclass);
		System.out.println("class-yes");
		return(cClass);
	}
	

	@ResponseBody
	@RequestMapping("/docheckAndinsert")
	public String docheck(HttpSession session,
			HttpServletRequest request,User user2) {
		System.out.println(777+user2.getuName());
		JSONObject json = new JSONObject();     
		user2.setgNum(1);
	   int row= userService.insertSelective(user2);
		if(row==1) {
			json.put("result", true);
		}
		else {
			json.put("result", false);
		}
		return json.toString();
	}
	
	@ResponseBody
	@RequestMapping("/updatePwd")
	public String docheck(	HttpSession session,
							HttpServletRequest request) {
		JSONObject json = new JSONObject();   
		String oldPwd = request.getParameter("oldPwd");
		String newPwd = request.getParameter("newPwd");
		String uId = request.getParameter("uId");
		User oldUser = new User();
		oldUser.setuId(Integer.valueOf(uId));
		oldUser.setuPwd(oldPwd);
		User user = userService.queryUserByPwd(oldUser);
				
		if (user !=null) {
			System.out.println("userOK");
			user.setuPwd(newPwd);
			int row = userService.updateByPrimaryKeySelective(user);
			if (row==1) {
				System.out.println("pwdOK");
				json.put("result", true);
			}else {
				System.out.println("no1");
				json.put("result", false);
			}
		}else {
			System.out.println("no2");
			json.put("result", false);
		}
		
		return json.toString();
	}
	
	
}
