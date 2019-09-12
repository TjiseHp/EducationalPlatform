package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Credit;

public interface CreditDao {

	@Select("select SUM(CREDIT_SUM) from e_credit where U_ID = #{integer}")
	String queryCreditSum(Integer integer);
	
	@Select("select * from e_credit where CREDIT_TEXT <> \"充值\"")
	List<Credit> queryAllConsumption();
	
	@Select("select * from e_credit where CREDIT_TEXT = \"充值\"")
	List<Credit> queryAllBuy();
	
    @Select("select * from e_credit where U_ID = #{uId}")
	List<Credit> queryAllDetailById(Integer uId);


}
