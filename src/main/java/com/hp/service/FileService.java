package com.hp.service;

import com.hp.bean.Check_list;

public interface FileService {

	int queryMaxListId();

	int insertSelective(Check_list check_list);

}
