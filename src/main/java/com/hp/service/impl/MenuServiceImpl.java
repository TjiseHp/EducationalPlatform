package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.bean.Menu;
import com.hp.bean.User;
import com.hp.dao.MenuDao;
import com.hp.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	public MenuDao menuDao;
	
	public Menu queryRootMenu() {
		return menuDao.queryRootMenu();
	}

	public List<Menu> queryChildrenMenu(Integer menuNo) {
		return menuDao.queryChildrenMenu(menuNo);
	}

	public List<Menu> queryAllMenu() {
		return menuDao.queryAllMenu();
	}

	public List<Integer> queryMenuNosByRoNo(Integer roNo) {
		return menuDao.queryMenuNosByRoNo(roNo);
	}

	public List<Menu> queryMenuByUser(User loginUser) {
		return menuDao.queryMenuByUser(loginUser);
	}
	
}
