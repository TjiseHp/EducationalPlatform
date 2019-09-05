package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.bean.User;
import com.hp.dao.UserDao;
import com.hp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;
	
	public List<User> queryAllStudent() {
		// TODO Auto-generated method stub
		return userDao.queryAllStudent();
	}

	

}
