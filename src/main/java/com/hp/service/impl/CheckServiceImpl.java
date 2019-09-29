package com.hp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Check;
import com.hp.dao.CheckDao;
import com.hp.service.CheckService;

@Service
public class CheckServiceImpl implements CheckService {
	
	@Autowired
	public CheckDao checkDao;

	public Check queryCheckBycheckNum(Integer checkNum) {
		return checkDao.queryCheckBycheckNum(checkNum);
	}

}
