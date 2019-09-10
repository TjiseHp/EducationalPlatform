package com.hp.service;

import java.util.List;

import com.hp.bean.Pay;


public interface PayService {
	
	List<Pay> queryAllPay();

	int deleteByPrimaryKey(Integer uId);

	Pay queryPayByuId(Integer uId);

	void updateByPrimaryKeySelective(Pay pay);

	List<Pay> queryPayByExample(String search);

	void insertSelective(Pay pay);







}
