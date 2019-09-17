package com.hp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Class;
import com.hp.dao.ClassDao;
import com.hp.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService{
	@Autowired
	ClassDao classDao;

	public Class queryAllByClassNum(Integer classNum) {
		// TODO Auto-generated method stub
		return classDao.queryAllByClassNum(classNum);
	}
	
}
