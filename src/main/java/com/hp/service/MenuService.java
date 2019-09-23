package com.hp.service;

import java.util.List;

import com.hp.bean.Menu;

public interface MenuService {

	List<Menu> queryAllMenu();

	List<Integer> queryMenuNosByRoNo(Integer roNo);

}
