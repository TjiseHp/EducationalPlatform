package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface UtilDao {

	@Select("select * from EmailUtil where email=#{email}")
	public List<String> queryEmailOnly2(String email);

	@Select("select count(*) from EmailUtil where email=#{email}")
	public int queryEmailOnly(String email);

	@Select("select count(*) from EmailUtil ")
	public int queryEmailCount();

	public int insertEmail(String email);

}
