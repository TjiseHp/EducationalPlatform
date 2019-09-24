package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Menu;
import com.hp.bean.User;

public interface MenuDao {

	//查询顶级节点
	@Select("select * from e_menu where MENU_UPPER_NO = -1")
	Menu queryRootMenu();

	//查询子节点
	@Select("select * from e_menu where MENU_UPPER_NO = #{menuNo}")
	List<Menu> queryChildrenMenu(Integer menuNo);
	
	//查询全部菜单
	@Select("select * from e_menu")
	List<Menu> queryAllMenu();

	//根据角色查询菜单号
	@Select("select MENU_NO from e_power where RO_NO = #{roNo}")
	List<Integer> queryMenuNosByRoNo(Integer roNo);

	//根据账号查询权限
	@Select("SELECT * from e_menu where MENU_NO in (select MENU_NO from e_power where RO_NO = (select RO_NO from e_group where G_NO = #{gNo}))")
	List<Menu> queryMenuByUser(User loginUser);
	
}
