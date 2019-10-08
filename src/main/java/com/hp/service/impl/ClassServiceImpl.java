package com.hp.service.impl;

import java.util.List;

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
		return classDao.queryAllByClassNum(classNum);
	}

<<<<<<< HEAD
	public List<Class> queryAllClass() {
		// TODO Auto-generated method stub
		return classDao.queryAllClass();
=======
	public Class queryClassByClassNum(Integer classNum) {
		return classDao.queryClassByClassNum(classNum);
>>>>>>> branch 'master' of https://github.com/TjiseHp/EducationalPlatform.git
	}
	
}
