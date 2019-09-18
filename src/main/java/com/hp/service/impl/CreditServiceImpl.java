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
	
	public List<Credit> queryAllConsumptionByuId(Integer uId) {
		// TODO Auto-generated method stub
		return creditDao.queryAllConsumptionByuId(uId);
	}

	public List<Credit> queryHistoryBuyByuId(Integer uId) {
		// TODO Auto-generated method stub
		return creditDao.queryHistoryBuyByuId(uId);
	}
	

	public int deleteByPrimaryKey(Integer creditNum) {
		// TODO Auto-generated method stub
		return creditMapper.deleteByPrimaryKey(creditNum);
	}

	public void insertSelective(Credit credit) {
		// TODO Auto-generated method stub
		creditMapper.insertSelective(credit);
		
	}

	public List<Credit> queryAllDetailById(Integer uId) {
		// TODO Auto-generated method stub
		return creditDao.queryAllDetailById(uId);
	}





	
}
