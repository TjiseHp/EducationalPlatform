package com.hp.service;

import java.util.List;

import com.hp.bean.Pay;


public interface PayService {
	
	List<Pay> queryAllPay();

	int deleteByPrimaryKey(String payNum);

	Pay queryPayBypayNum(String payNum);

	int updateByPrimaryKeySelective(Pay pay);

	List<Pay> queryPayByExample(String search);

	int insertSelective(Pay pay);

	int selectAllpay(Pay pay);







}
