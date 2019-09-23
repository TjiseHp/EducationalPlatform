package com.hp.service;

import java.util.List;

import com.hp.bean.Check_list;

public interface FileService {

	int queryMaxListId();

	int insertSelective(Check_list check_list);
	
	List<Check_list> queryCheckList();
	
	Check_list queryCheckListBylistName(Check_list check_list);

	 int updateByPrimaryKeySelective(Check_list record);
}
