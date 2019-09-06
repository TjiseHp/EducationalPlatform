package com.hp.service;
import java.util.List;
import com.hp.bean.User;

public interface UserService {

	List<User> queryAllStudent();

	List<User> queryAllTeacher();

}
