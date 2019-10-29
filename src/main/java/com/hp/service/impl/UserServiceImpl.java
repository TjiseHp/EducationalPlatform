package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.City;
import com.hp.bean.Class;
import com.hp.bean.Recruit;
import com.hp.bean.User;
import com.hp.dao.UserDao;
import com.hp.dao.UserMapper;
import com.hp.service.UserService;
import com.hp.util.Md5Util;

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

	public int updateByPrimaryKeySelective(User user) {
		String upwd1 = Md5Util.getMd5Code(user.getuPwd());
		user.setuPwd(upwd1);
//		System.out.println("加密后的密码："+user.getuPwd());
		return userMapper.updateByPrimaryKeySelective(user);
	}

	public User queryTeacherByuId(Integer uId) {
		return userDao.queryTeacherByuId(uId);
	}

	public List<User> queryStudentByExample(String search) {
		return userDao.queryStudentByExample(search);
	}

	public int insertSelective(User user) {
		return userMapper.insertSelective(user);
	}

	public List<User> queryTeacherByworking() {
		return userDao.queryTeacherByworking();
	}
	public List<User> queryTeacherByExample(String search) {
		return userDao.queryTeacherByExample(search);
	}

	public User queryLoginByUser(User user) {
		String upwd1 = Md5Util.getMd5Code(user.getuPwd());
		user.setuPwd(upwd1);
//		System.out.println("用户登陆输入密码的加密：："+user.getuPwd());
		return userDao.queryLoginByUser(user);
	}

	public User queryRegUser(User user) {
		String upwd1 = Md5Util.getMd5Code(user.getuPwd());
		user.setuPwd(upwd1);
//		System.out.println("用户注册验证输入密码的加密：："+user.getuPwd());		
		return userDao.queryRegUser(user);
	}

	public int insertUserSelective(User user) {
		return userMapper.insertSelective(user);
	}

	public String queryUnameByUid(Integer uId) {
		// TODO Auto-generated method stub
		return userDao.queryUnameByUid(uId);
	}
	
	public User queryAllTeacherByuId(Integer uId) {
		// TODO Auto-generated method stub
		return userDao.queryAllTeacherByuId(uId);
	}

	public User queryTeacherByInfo(Integer uId) {
		// TODO Auto-generated method stub
		return userDao.queryTeacherByInfo(uId);
	}

	public User queryUserByEmail(String uEmail) {
		return userDao.queryUserByEmail(uEmail);
	}

	public List<City> queryAllCity(City city) {
		// TODO Auto-generated method stub
		return userDao.queryAllCity(city);
	}

	public List<City> queryAllCityBycProvince() {
		// TODO Auto-generated method stub
		return userDao.queryAllCityBycProvince();
	}

	public User queryUserByPwd(User user) {
		// TODO Auto-generated method stub
		String upwd1 = Md5Util.getMd5Code(user.getuPwd());
		user.setuPwd(upwd1);
//		System.out.println("验证用户修改密码的加密："+user.getuPwd());	
		return userDao.queryUserByPwd(user);
	}

	public List<Class> queryAllClass(Class uclass) {
		// TODO Auto-generated method stub
		return userDao.queryAllClass(uclass);
	}

	



}
