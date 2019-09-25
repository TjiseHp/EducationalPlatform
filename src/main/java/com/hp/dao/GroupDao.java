package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Group;

public interface GroupDao {

	@Select("select * from e_group ")
	List<Group> queryAllGroup();

	@Select("select * from e_group where RO_NO = #{roNo}")
	Group queryGroupBygNum(Integer gNum);



}
