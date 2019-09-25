package com.hp.service;
import java.util.List;
import java.util.Map;

import com.hp.bean.Role;

public interface RoleService {

	List<Role> queryAllRole();

	Role queryRoleByrNum(Integer roNo);
	
	public void insertRoleAssign(Map<String, Object> paramMap);
	
	public List<Role> queryAllRoles();
	
	public List<Role> queryRoleByExample(String search);
	
	//删除
	int deleteByPrimaryKey(Integer roNo);
	
	//主键查询
	Role queryAllRolesByroNo(Integer roNo);
	
	//删除用户组
	int deleteGroupByroNo(Integer roNo);
	
	//增加
	int insertSelective(Role record);
	
	//更新
	int updateByPrimaryKeySelective(Role record);

}
