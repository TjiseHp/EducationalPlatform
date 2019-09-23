package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.bean.Role;
import com.hp.dao.RoleDao;
import com.hp.dao.RoleMapper;
import com.hp.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	public RoleDao roleDao;
	
	@Autowired
	public RoleMapper roleMapper;

	public Role queryAllRole(Integer rNum) {
		return null;
	}

	public List<Role> queryAllRole() {
		return roleDao.queryAllRole();
	}

	public Role queryRoleByrNum(Integer rNum) {
		return roleDao.queryRoleByrNum(rNum);
	}

}
