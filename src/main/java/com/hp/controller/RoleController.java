package com.hp.controller;

import java.util.List;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.Group;
import com.hp.bean.Role;
import com.hp.bean.User;
import com.hp.service.GroupService;
import com.hp.service.RoleService;
import com.hp.service.PowerService;
import com.hp.service.RoleService;
import com.hp.util.LogicUtil;


@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	public RoleService roleService;
	
	@Autowired
	public GroupService groupService;
	
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

	
	//查询角色列表
	@RequestMapping("/roleTable")
	public ModelAndView roleTable(HttpServletRequest httpServletRequest) {
		HttpSession httpSession = httpServletRequest.getSession();
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "role/roleTable.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/queryAllRole")
	public List<Role> queryAllRole(){
		List<Role> role =  roleService.queryAllRole();
		return role;
	}
	
	//角色列表更新跳转
	@RequestMapping("/updateRole")
	public ModelAndView updateRole
			(HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "roNo") Integer roNo) {
		HttpSession httpSession = httpServletRequest.getSession();
		Role role = roleService.queryRoleByroNo(roNo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("role",role);
		modelAndView.addObject("mainPage", "role/updateRole.jsp");
		modelAndView.setViewName("main");
		return modelAndView;
	}
	

	//更新角色列表
		@RequestMapping(value = "/doUpdateRole",produces = {"text/html;charset=utf-8"})
		public String doUpdateRole(Role role,HttpServletRequest httpServletRequest) {
			System.out.println(role.getRoNo());
			System.out.println(role.getRoText());
			int row= roleService.updateByPrimaryKeySelective(role);
			System.out.println(row);
			Role role2 = roleService.queryRoleByUpdate(role);
			if (role2 != null) {
				System.out.println("OK");
				Group group = new Group();
				group.setRoNo(group.getRoNo());
				group.setgName(role2.getRoName()+"组");
				row =groupService.updateByPrimaryKeySelective(group);
				System.out.println(row);
			}else {
				System.out.println("NO");
				
				
			}
			
			return "redirect: roleTable";
			
		}
		
		//插入角色--页面跳转
		@RequestMapping("/insertRole")
		public ModelAndView insertRole(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("mainPage", "role/insertRole.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		
		//执行插入角色
		@RequestMapping(value = "/doInsertRole",produces = {"text/html;charset=utf-8"})
		public String doInsertRole(Role role,HttpSession httpSession) {
			System.out.println(role.getRoName());
			int row =roleService.insertSelective(role);
			System.out.println(row);
			Role role2 = roleService.queryRoleByRole(role);
			if (role2 != null) {
				System.out.println("OK");
				Group group = new Group();
				group.setRoNo(role2.getRoNo());
				group.setgName(role2.getRoName()+"组");
				row =groupService.insertSelective(group);
				System.out.println(row);
			}else {
				System.out.println("NO");
			}
			return "redirect: roleTable";
		}
		
		
		//删除角色
		@ResponseBody
		@RequestMapping("/deleteRole")
		public String deleteRole(Role role) {
			System.out.println("deleteRole:"+role.getRoNo());
			JSONObject json = new JSONObject();
			int row = roleService.deleteByPrimaryKey(role.getRoNo());
			System.out.println("删除了"+row+"行数据");
			if (row==1) {
				json.put("result", true);
			}else {
				json.put("result", false);
			}
			return json.toString();
		}
	
		//查询角色组列表
		@RequestMapping("/groupTable")
		public ModelAndView groupTable(HttpServletRequest httpServletRequest) {
			HttpSession httpSession = httpServletRequest.getSession();
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("mainPage", "group/groupTable.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		
		//角色组
		@ResponseBody
		@RequestMapping("/queryAllGroup")
		public List<Group> queryAllGroup(){
			List<Group> group =  groupService.queryAllGroup();
			return group;
		}
		
		//角色组列表更新跳转
		@RequestMapping("/updateGroup")
		public ModelAndView updateGroup
				(HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "gNum") Integer gNum) {
			HttpSession httpSession = httpServletRequest.getSession();
			Group group = groupService.queryGroupBygNum(gNum);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("group",group);
			modelAndView.addObject("mainPage", "group/updateGroup.jsp");
			modelAndView.setViewName("main");
			return modelAndView;
		}
		
		//更新角色组列表
			@RequestMapping(value = "/doUpdateGroup",produces = {"text/html;charset=utf-8"})
			public String doUpdateGroup(Group group,HttpServletRequest httpServletRequest) {
				System.out.println(group.getgNum());
				int row= groupService.updateByPrimaryKeySelective(group);
				System.out.println(row);
				return "redirect:groupTable";
			}
			
			//插入角色组--页面跳转
			@RequestMapping("/insertGroup")
			public ModelAndView insertGroup(HttpServletRequest httpServletRequest) {
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("mainPage", "group/insertGroup.jsp");
				modelAndView.setViewName("main");
				return modelAndView;
			}
			
			//执行插入角色组
			@RequestMapping(value = "/doInsertGroup",produces = {"text/html;charset=utf-8"})
			public String doInsertGroup(Group group,HttpSession httpSession) {
				System.out.println(group.getgName());
				int row =groupService.insertSelective(group);
				System.out.println(row);
				return "redirect: groupTable";
			}
			
			
			//删除角色组
			@ResponseBody
			@RequestMapping("/deleteGroup")
			public String deleteGroup(Group group) {
				System.out.println("deleteGroup:"+group.getgNum());
				JSONObject json = new JSONObject();
				int row = groupService.deleteByPrimaryKey(group.getgNum());
				System.out.println("删除了"+row+"行数据");
				if (row==1) {
					json.put("result", true);
				}else {
					json.put("result", false);
				}
				return json.toString();
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
