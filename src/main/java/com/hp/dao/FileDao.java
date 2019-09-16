package com.hp.dao;

import org.apache.ibatis.annotations.Select;

public interface FileDao {

	@Select("select MAX(LIST_ID) from e_check_list")
	int queryMaxListId();

}
