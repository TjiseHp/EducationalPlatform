package com.hp.service;
import java.util.List;
import com.hp.bean.User;

public interface UserService {

	List<User> queryAllStudent();

	List<User> queryAllTeacher();

	int deleteByPrimaryKey(Integer uId);

	User queryStudentByuId(Integer uId);

	void updateByPrimaryKeySelective(User user);

}
