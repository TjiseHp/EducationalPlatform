package com.hp.service;
import java.util.List;

import com.hp.bean.City;
import com.hp.bean.Class;
import com.hp.bean.Recruit;
import com.hp.bean.User;

public interface UserService {

	List<User> queryAllStudent();

	List<User> queryAllTeacher();

	int deleteByPrimaryKey(Integer uId);

	User queryStudentByuId(Integer uId);

	int updateByPrimaryKeySelective(User user);

	User queryTeacherByuId(Integer uId);
	
	List<User> queryStudentByExample(String search);

	int insertSelective(User user);
	
	List<User> queryTeacherByworking();

	List<User> queryTeacherByExample(String search);

	User queryLoginByUser(User user);

	User queryRegUser(User user);

	int insertUserSelective(User user);

	String queryUnameByUid(Integer uId);
	
	User queryAllTeacherByuId(Integer uId);

	User queryTeacherByInfo(Integer uId);

	User queryUserByEmail(String uEmail);

	List<City> queryAllCity(City city);

	List<City> queryAllCityBycProvince();

	User queryUserByPwd(User oldUser);

	List<Class> queryAllClass(Class uclass);



}
