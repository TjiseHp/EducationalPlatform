package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hp.bean.Exchange;

public interface ExchangeDao {

	@Select("select * from e_exchange")
	List<Exchange> queryAllExchange();

	@Select("select * from e_exchange where exchange_num = #{exchangeNum}")
	Exchange queryExchangeByexchangeNum(Integer exchangeNum);

	List<Exchange> queryExchangeByExample(String search);
	
	@Select("select EXCHANGE_E from e_exchange where EXCHANGE_NUM = 1")
	double queryExchange();

	@Update("UPDATE e_exchange set EXCHANGE_E = #{exchangeE}")
	int updateByexchangeE(Double exchangeE);

}
