package com.hp.service;
import java.util.List;
import com.hp.bean.Role;

public interface RoleService {

	List<Role> queryAllRole();

	List<Role> roleTable();

	Role queryRoleByroNo(Integer roNo);

	int updateByPrimaryKeySelective(Role role);

	int insertSelective(Role role);

	int deleteByPrimaryKey(Integer roNo);

	



}
