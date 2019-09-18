package com.hp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.User;
import com.hp.dao.UserDao;
import com.hp.service.StuInfoService;

@Service
public class StuInfoServiceImpl  implements StuInfoService{
	
	
	@Autowired
	public UserDao userDao;

	public User queryStudentInfoById(Integer uId) {
		// TODO Auto-generated method stub
		return userDao.queryStudentByuId(uId);
	}

}
