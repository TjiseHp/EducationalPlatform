package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.bean.Role;
import com.hp.dao.RoleDao;
import com.hp.dao.RoleMapper;
import com.hp.service.RoleService;

@Service
public  class RoleServiceImpl implements RoleService {
	
	@Autowired
	public RoleDao roleDao;
	
	@Autowired
	public RoleMapper roleMapper;

	public List<Role> queryAllRole() {
		return roleDao.queryAllRole();
	}

	public Role queryRoleByroNo(Integer roNo) {
		return roleDao.queryRoleByroNo(roNo);
	}

	public List<Role> roleTable() {
		return null;
	}

	public int updateByPrimaryKeySelective(Role role) {
		return roleMapper.updateByPrimaryKeySelective(role);
	}

	public int insertSelective(Role role) {
		return roleMapper.insertSelective(role);
		
	}

	public int deleteByPrimaryKey(Integer roNo) {
		return roleMapper.deleteByPrimaryKey(roNo);
	}



}
