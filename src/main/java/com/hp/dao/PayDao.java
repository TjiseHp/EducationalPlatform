package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.hp.bean.Pay;
import com.hp.bean.User;

public interface PayDao {

	@Select("select * from e_pay where pay_num = 1")
	List<Pay> queryAllPay();

	@Select("select * from e_pay where U_ID = #{uId}")
	Pay queryPayByuId(Integer uId);

	List<Pay> queryPayByExample(String search);



	

}
