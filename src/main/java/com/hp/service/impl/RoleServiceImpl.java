package com.hp.service.impl;
import java.util.List;
import java.util.Map;

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

	public List<Role> queryAllRole() {
		return roleDao.queryAllRole();
	}

	public Role queryRoleByrNum(Integer roNo) {
		return roleDao.queryRoleByrNum(roNo);
	}
	
	public List<Role> queryAllRoles(){
		return roleDao.queryAllRoles();
	}

	public void insertRoleAssign(Map<String, Object> paramMap) {
		roleDao.insertRoleAssign(paramMap);
	}

	public List<Role> queryRoleByExample(String search) {
		return roleDao.queryRoleByExample(search);
	}

	public int deleteByPrimaryKey(Integer roNo) {
		return roleMapper.deleteByPrimaryKey(roNo);
	}

	public Role queryAllRolesByroNo(Integer roNo) {
		return roleDao.queryAllRolesByroNo(roNo);
	}

	public int deleteGroupByroNo(Integer roNo) {
		return roleDao.deleteGroupByroNo(roNo);
	}

	public int insertSelective(Role record) {
		return roleMapper.insertSelective(record);
	}

	public int updateByPrimaryKeySelective(Role record) {
		return roleMapper.updateByPrimaryKeySelective(record);
	}

}
