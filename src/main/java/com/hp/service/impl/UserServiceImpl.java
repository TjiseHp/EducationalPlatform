package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.bean.User;
import com.hp.dao.UserDao;
import com.hp.dao.UserMapper;
import com.hp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;
	
	@Autowired
	public UserMapper userMapper;
	
	public List<User> queryAllStudent() {
		return userDao.queryAllStudent();
	}

	public List<User> queryAllTeacher() {
		return userDao.queryAllTeacher();
	}

	public int deleteByPrimaryKey(Integer uId) {
		return userMapper.deleteByPrimaryKey(uId);
	}

	public User queryStudentByuId(Integer uId) {
		return userDao.queryStudentByuId(uId);
	}

	public void updateByPrimaryKeySelective(User user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	public User queryTeacherByuId(Integer uId) {
		return userDao.queryTeacherByuId(uId);
	}

	public List<User> queryStudentByExample(String search) {
		return userDao.queryStudentByExample(search);
	}

	public void insertSelective(User user) {
		userMapper.insertSelective(user);
	}

	public List<User> queryTeacherByworking(User user) {
		// TODO Auto-generated method stub
		return userDao.queryTeacherByworking(user);
	}

}
