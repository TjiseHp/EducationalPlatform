package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Class;

public interface ClassDao {

	@Select("select * from e_class where class_num = #{classNum}")
	Class queryAllByClassNum(Integer classNum);
	
	@Select("select * from e_class ")
	List<Class> queryAllClass();

	@Select("select * from e_class where class_num = #{classNum}")
	Class queryClassByClassNum(Integer classNum);
}
