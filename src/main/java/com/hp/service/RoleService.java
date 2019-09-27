package com.hp.service;
import java.util.List;
import java.util.Map;

import com.hp.bean.Role;

public interface RoleService {

	List<Role> queryAllRole();

	List<Role> roleTable();

	Role queryRoleByroNo(Integer roNo);

	int updateByPrimaryKeySelective(Role role);

	int insertSelective(Role role);

	int deleteByPrimaryKey(Integer roNo);
	
	public void insertRoleAssign(Map<String, Object> paramMap);
	
	public List<Role> queryAllRoles();
	
	public List<Role> queryRoleByExample(String search);
	
	//主键查询
	Role queryAllRolesByroNo(Integer roNo);
	
	//删除用户组
	int deleteGroupByroNo(Integer roNo);

	Role queryRoleByRole(Role role);

	Role queryRoleByUpdate(Role role);
	
}
