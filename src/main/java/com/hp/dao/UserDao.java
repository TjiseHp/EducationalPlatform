package com.hp.dao;
import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hp.bean.City;
import com.hp.bean.Class;
import com.hp.bean.Credit;
import com.hp.bean.Recruit;
import com.hp.bean.User;

public interface UserDao {

	List<User> queryAllStudent();

	List<User> queryAllTeacher();

	User queryStudentByuId(Integer uId);

	@Select("select * from e_user where U_ID = #{uId}")
	User queryTeacherByuId(Integer uId);

	List<User> queryStudentByExample(String search);

	//在职教师分类查询
	@Select("select * from e_user where g_num = 2  ORDER BY u_exp DESC")
	List<User> queryTeacherByworking();

	List<User> queryTeacherByExample(String search);

	//登录查询
	@Select("select * from e_user where U_ACC = #{uAcc} and U_PWD = #{uPwd}")
	User queryLoginByUser(User user);
	
	//注册查询
	@Select("select * from e_user where U_ACC = #{uAcc}")
	User queryRegUser(User user);

	@Select("select u_Name from e_user where u_id = #{uId}")
	String queryUnameByUid(Integer uId);
	
	int insertUserSelective(User user);

	@Select("select * from e_user where U_ID = #{uId}")
	User queryAllTeacherByuId(Integer uId);

	@Select("select * from e_user where U_ID = #{uId}")
	User queryTeacherByInfo(Integer uId);

	@Select("select * from e_user where u_Email=#{uEmail}")
	User queryUserByEmail(String uEmail);

	@Select("select * from e_city  where C_PROVINCE=#{cProvince}")
	List<City> queryAllCity(City city);

	@Select("select distinct C_PROVINCE from e_city ")
	List<City> queryAllCityBycProvince();

	@Select("select * from e_user where U_ID = #{uId} and U_PWD = #{uPwd}")
	User queryUserByPwd(User user);

	@Select("select * from e_class")
	List<Class> queryAllClass(Class uclass);

	@Update("update e_user SET U_PWD = #{uPwd} WHERE U_ID = #{uId}")
	int updateByuPwd(User user);

	@Select("Select count(*) from e_user where u_Email=#{uEmail}")
	int queryUserCountByEmail(String uEmail);


}
