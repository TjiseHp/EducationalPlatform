package com.hp.service;

import java.util.List;

import com.hp.bean.Class;
import com.hp.bean.Credit;
import com.hp.bean.Pay;

public interface EchartService {

	java.util.List<Class> queryAll();

	List<Credit> queryCreditEchart(Integer uId);
	
	List<Credit> queryCreditPayEchart(Integer uId);
	
	List<Pay> queryComplatePay();
	
	List<Credit> queryCreditPayByThingEchart(Integer uId);	
}
