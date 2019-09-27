package com.hp.dao;


import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Class;
import com.hp.bean.Credit;
import com.hp.bean.Pay;

public interface EchartDao {
	
	@Select("select * from e_class ")
	java.util.List<Class> queryAll();

	//用户充值记录
	@Select("SELECT DATE_FORMAT(CREDIT_DATE,\"%Y年%m月\") as CREDIT_TEXT2,sum(CREDIT_SUM) as CREDIT_SUM  FROM e_credit WHERE CREDIT_TEXT = \"充值\" and u_Id = #{uId} GROUP BY DATE_FORMAT(CREDIT_DATE,\"%Y-%m\") ORDER BY CREDIT_DATE ASC")
	List<Credit> queryCreditEchart(Integer uId);
	
	//用户消费记录-时间
	@Select("SELECT DATE_FORMAT(CREDIT_DATE,\"%Y年%m月\") as CREDIT_TEXT2,ABS(sum(CREDIT_SUM)) as CREDIT_SUM  FROM e_credit WHERE CREDIT_SUM<0 and u_Id = #{uId} GROUP BY DATE_FORMAT(CREDIT_DATE,\"%Y-%m\") ORDER BY CREDIT_DATE ASC")
	List<Credit> queryCreditPayEchart(Integer uId);
	
	//用户消费记录-事件
	@Select("SELECT CREDIT_TEXT,ABS(sum(CREDIT_SUM)) as CREDIT_SUM  FROM e_credit WHERE CREDIT_TEXT != \"充值\" AND u_Id = #{uId} GROUP BY CREDIT_TEXT ORDER BY CREDIT_DATE ASC")
	List<Credit> queryCreditPayByThingEchart(Integer uId);	
	
	//管理员查看充值信息 因日期格式问题，日期在查询后值均存入string格式字段中，故保存在pay_num，上两条同
	@Select("SELECT DATE_FORMAT(PAY_DATE,\"%Y年%m月\") as PAY_NUM,ABS(sum(PAY_TEXT)) as PAY_TEXT  FROM e_pay \r\n" + 
			"WHERE TRADE_NO  is NOT NULL\r\n" + 
			"GROUP BY DATE_FORMAT(PAY_DATE,\"%Y-%m\") ORDER BY pay_date ASC")
	List<Pay> queryComplatePay();
	
	
}
