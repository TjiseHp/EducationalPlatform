package com.hp.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hp.bean.Menu;
import com.hp.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	public MenuService menuService;
	
	//AJAX对应角色的权限菜单回显
	@ResponseBody
	@RequestMapping("/loadAssignData")
	public Object loadAssignData(Integer roNo) {
		List<Menu> menus = new ArrayList<Menu>();
		List<Menu> list = menuService.queryAllMenu();
		List<Integer> menunos = menuService.queryMenuNosByRoNo(roNo);
		Map<Integer, Menu> menuMap = new HashMap<Integer, Menu>();
		for(Menu m : list) {
			if (menunos.contains(m.getMenuNo())) {
				m.setChecked(true);
			}else {
				m.setChecked(false);
			}
		}
		for(Menu m : list) {
			menuMap.put(m.getMenuNo(), m);
		}
		for(Menu m : list) {
			Menu child = m;
			if (child.getMenuUpperNo() == -1) {
				menus.add(m);
			}else {
				Menu parent = menuMap.get(child.getMenuUpperNo());
				parent.getChildren().add(child);
			}
		}
		return menus;
	}
	
}
