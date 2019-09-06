package com.hp.dao;

import org.apache.ibatis.annotations.Select;

public interface CreditDao {

	@Select("select SUM(CREDIT_SUM) from e_credit where U_ID = #{integer}")
	String queryCreditSum(Integer integer);
	
}
