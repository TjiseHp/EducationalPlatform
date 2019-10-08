package com.hp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Appraise;
import com.hp.dao.AppraiseDao;
import com.hp.dao.AppraiseMapper;
import com.hp.service.AppraiseService;

@Service
public class AppraiseServiceImpl implements AppraiseService{

	@Autowired
	AppraiseMapper appraiseMapper;
	
	@Autowired
	AppraiseDao appraiseDao;
	
	public int insertSelective(Appraise appraise) {
		// TODO Auto-generated method stub
		return appraiseMapper.insertSelective(appraise);
	}

	public Appraise queryAppraiseByUid(Appraise appraise) {
		// TODO Auto-generated method stub
		return appraiseDao.queryAppraiseByUid(appraise);
	}

	//public Appraise queryAppraiseByuId(Integer uId) {
		// TODO Auto-generated method stub
		//return appraiseDao.queryAppraiseByUid(uId);
	//}

	
}
