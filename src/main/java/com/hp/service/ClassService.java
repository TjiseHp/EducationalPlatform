package com.hp.service;

import java.util.List;

import com.hp.bean.Class;

public interface ClassService {

	Class queryAllByClassNum(Integer classNum);
	

	List<Class> queryAllClass();

	Class queryClassByClassNum(Integer classNum);


	Integer queryAllClassByclasskind(String classkind);
}
