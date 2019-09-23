package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Check_list;

public interface FileDao {

	@Select("select MAX(LIST_ID) from e_check_list")
	int queryMaxListId();
	
	@Select("select * from e_check_list where list_e_time is null")
	List<Check_list> queryCheckList();

	@Select("select * from e_check_list where list_name = #{listName}")
	Check_list queryCheckListBylistName(Check_list check_list);
}
