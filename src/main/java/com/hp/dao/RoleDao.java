package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Role;


public interface RoleDao {

	@Select("select * from e_role ")
	List<Role> queryAllRole();

	@Select("select * from e_role where RO_NO = #{roNo}")
	Role queryRoleByroNo(Integer roNo);




	
	
	
}
