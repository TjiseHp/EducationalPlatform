package com.hp.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.hp.bean.Role;
import com.hp.service.PowerService;
import com.hp.service.RoleService;
import com.hp.util.LogicUtil;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	public RoleService roleService;
	
	@Autowired
	public PowerService powerService;
	
	//权限修改页面跳转
	@RequestMapping("/assignTable")
	public ModelAndView assignTable(
			HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "roNo") Integer roNo) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("roNo",roNo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "role/assignTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	@RequestMapping("/queryAllRole")
	public ModelAndView queryAllRole(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "rNum") Integer rNum) {
		HttpSession httpSession = httpServletRequest.getSession();
		ModelAndView modelAndView = new ModelAndView();
		List<Role> role =  roleService.queryAllRole();
		
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("role",role);
		modelAndView.addObject("mainPage", "role/roleTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;

	}
	
	@RequestMapping("/updateRole")
	public ModelAndView updateRole
			(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "rNum") Integer rNum) {
		HttpSession httpSession = httpServletRequest.getSession();
		Role role = roleService.queryRoleByrNum(rNum);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("role",role);
		modelAndView.addObject("mainPage", "role/updateRole.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/doAjaxAssign")
	public Object doAjaxAssign( Integer roNo,Integer[] menuNo) {
		LogicUtil result = new LogicUtil();
		try {
			int row = powerService.DeletePowerForRoNo(roNo);
			System.out.println("删除了"+roNo+"号角色的"+row+"条权限。");
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("roNo", roNo);
			paramMap.put("menuNo", menuNo);
			roleService.insertRoleAssign(paramMap);
			result.setLogic(true);
		} catch (Exception e) {
			e.printStackTrace();
			result.setLogic(false);
		}
		return result;
	}
	
}
