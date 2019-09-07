package com.hp.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Credit;
import com.hp.dao.CreditDao;
import com.hp.service.CreditService;

@Service
public class CreditServiceImpl implements CreditService {

	@Autowired
	public CreditDao creditDao;
	
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

	public List<Credit> queryAllDetail() {
		// TODO Auto-generated method stub
		return creditDao.queryAllDetail();
	}
	
}
