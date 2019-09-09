package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Pay;
import com.hp.bean.User;
import com.hp.dao.ExchangeMapper;
import com.hp.dao.PayDao;
import com.hp.dao.PayMapper;
import com.hp.service.PayService;

@Service
public class PayServiceImpl implements PayService {
	
	@Autowired
	public PayDao payDao;
	
	@Autowired
	public PayMapper payMapper;
	
	public List<Pay> queryAllPay() {
		return payDao.queryAllPay();
	}

	public int deleteByPrimaryKey(Integer uId) {
		return payMapper.deleteByPrimaryKey(uId);
	}

	public Pay queryPaytByuId(Integer uId) {
		return payDao.queryPayByuId(uId);
	}

	public void updateByPrimaryKeySelective(Pay pay) {
		payMapper.updateByPrimaryKeySelective(pay);
	}

	public List<Pay> queryPayByExample(String search) {
		return payDao.queryPayByExample(search);
	}

	public void insertSelective(Pay pay) {
		payMapper.insertSelective(pay);
	}

	public Pay queryPayByuId(Integer uId) {
		// TODO Auto-generated method stub
		return null;
	}



}
