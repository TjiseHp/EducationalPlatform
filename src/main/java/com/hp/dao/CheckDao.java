package com.hp.dao;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Check;

public interface CheckDao {
	
	@Select("select * from e_check where CHECK_Num = #{checkNum}")
	Check queryCheckBycheckNum(Integer checkNum);

}
