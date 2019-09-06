package com.hp.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
}
