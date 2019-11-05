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

	public int deleteByPrimaryKey(String payNum) {
		return payMapper.deleteByPrimaryKey(payNum);
	}

	public Pay queryPayBypayNum(String payNum) {
		return payDao.queryPayBypayNum(payNum);
	}

	public int updateByPrimaryKeySelective(Pay pay) {
		return payMapper.updateByPrimaryKeySelective(pay);
	}

	public List<Pay> queryPayByExample(String search) {
		return payDao.queryPayByExample(search);
	}

	public int insertSelective(Pay pay) {
		return payMapper.insertSelective(pay);
	}

	public Pay queryPayByuId(Integer uId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int selectAllpay(Pay pay) {
		// TODO Auto-generated method stub
		return payDao.selectAllpay(pay);
	}



}
