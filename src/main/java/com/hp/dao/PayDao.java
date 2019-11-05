package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.hp.bean.Pay;
import com.hp.bean.User;

public interface PayDao {

	@Select("select * from e_pay where TRADE_NO is not NULL ORDER BY PAY_DATE DESC")
	List<Pay> queryAllPay();

	@Select("select * from e_pay where PAY_NUM = #{payNum}")
	Pay queryPayBypayNum(String payNum);

	List<Pay> queryPayByExample(String search);

	@Select("select * from e_pay where PAY_NUM = #{payNum}")
	Pay queryPay(String payNum);



	

}
