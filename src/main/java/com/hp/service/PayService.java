package com.hp.service;

import java.util.List;

import com.hp.bean.Pay;


public interface PayService {
	
	List<Pay> queryAllPay();

//	int deleteByPrimaryKey(String payNum);

	Pay queryPayBypayNum(Integer payNum);

	int updateByPrimaryKeySelective(Pay pay);

	List<Pay> queryPayByExample(String search);

	int insertSelective(Pay pay);







}
