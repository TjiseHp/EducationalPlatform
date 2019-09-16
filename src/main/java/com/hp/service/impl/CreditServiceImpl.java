package com.hp.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Credit;
import com.hp.dao.CreditDao;
import com.hp.dao.CreditMapper;
import com.hp.service.CreditService;

@Service
public class CreditServiceImpl implements CreditService {

	@Autowired
	public CreditDao creditDao;
	
	@Autowired
	public CreditMapper creditMapper;
	
	public String queryCreditSum(Integer integer) {
		// TODO Auto-generated method stub
		return creditDao.queryCreditSum(integer);
	}
	
	public List<Credit> queryAllConsumption() {
		// TODO Auto-generated method stub
		return creditDao.queryAllConsumption();
	}

	public List<Credit> queryAllBuy() {
		// TODO Auto-generated method stub
		return creditDao.queryAllBuy();
	}
	
	public List<Credit> queryAllDetailById(Integer uId) {
		// TODO Auto-generated method stub
		return creditDao.queryAllDetailById(uId);
	}

	public int deleteByPrimaryKey(Integer creditNum) {
		// TODO Auto-generated method stub
		return creditMapper.deleteByPrimaryKey(creditNum);
	}

	public void insertSelective(Credit credit) {
		// TODO Auto-generated method stub
		creditMapper.insertSelective(credit);
		
	}





	
}
