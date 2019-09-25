package com.hp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.hp.bean.Role;


public interface RoleDao {

	@Select("select * from e_role")
	List<Role> queryAllRole();

	@Select("select * from e_role where RO_NO = #{roNo}")
	Role queryRoleByroNo(Integer roNo);


	@Select("select * from e_role")
	List<Role> queryAllRoles();

	void insertRoleAssign(Map<String, Object> paramMap);
	
	List<Role> queryRoleByExample(String search);
	
	@Select("select * from e_role where RO_NO = #{roNo}")
	Role queryAllRolesByroNo(Integer roNo);
	
	@Delete("delete from e_group where RO_NO = #{roNo}")
	int deleteGroupByroNo(Integer roNo);
	
}
