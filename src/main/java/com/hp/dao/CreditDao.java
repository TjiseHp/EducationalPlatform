package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Credit;

public interface CreditDao {

	@Select("select SUM(CREDIT_SUM) from e_credit where U_ID = #{integer}")
	String queryCreditSum(Integer integer);
	
	@Select("select * from e_credit where CREDIT_TEXT <> '充值' and U_ID = #{uId}")
	List<Credit> queryAllConsumptionByuId(Integer uId);
	
	@Select("select * from e_credit where CREDIT_TEXT = '充值' and U_ID = #{uId}")
	List<Credit> queryHistoryBuyByuId(Integer uId);

    @Select("select * from e_credit where U_ID = #{uId} order by CREDIT_DATE DESC")
	List<Credit> queryAllDetailById(Integer uId);
    
    
	
//	List<Credit> queryAllDetailById(Integer uId);


}
