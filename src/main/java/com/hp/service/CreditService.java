package com.hp.service;

import java.util.List;

import com.hp.bean.Credit;

public interface CreditService {

	String queryCreditSum(Integer integer);
	
	List<Credit> queryAllConsumptionByuId(Integer uId) ;
	   
	List<Credit> queryHistoryBuyByuId(Integer uId) ;

	List<Credit> queryAllDetailById(Integer uId);

	int deleteByPrimaryKey(Integer creditNum);

	void insertSelective(Credit credit);


}
