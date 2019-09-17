package com.hp.dao;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Class;

public interface ClassDao {

	@Select("select * from e_class where class_num = #{classNum}")
	Class queryAllByClassNum(Integer classNum);
}
