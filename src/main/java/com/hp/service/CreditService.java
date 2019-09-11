package com.hp.service;

import java.util.List;

import com.hp.bean.Credit;

public interface CreditService {

	String queryCreditSum(Integer integer);
	
	List<Credit> queryAllConsumption() ;
	   
	List<Credit> queryAllBuy() ;

	List<Credit> queryAllDetail();

	int deleteByPrimaryKey(Integer creditNum);

	void insertSelective(Credit credit);

	List<Credit> queryAllConsumptionByID(Integer uId);
}
