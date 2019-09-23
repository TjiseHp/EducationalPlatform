package com.hp.service;
import com.hp.bean.Pay;

public interface AlipayService {
	
	public int insertSelective(Pay pay);

	public Pay queryPay(String payNum);

	public int updateByPrimaryKeySelective(Pay pay);
}
