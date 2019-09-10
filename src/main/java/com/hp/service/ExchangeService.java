package com.hp.service;

import java.util.List;

import com.hp.bean.Exchange;

public interface ExchangeService {
	
	List<Exchange> queryAllExchange();

	void updateByPrimaryKeySelective(Exchange exchange);

	List<Exchange> queryExchangeByExample(String search);

	Exchange queryExchangeByexchangeNum(Integer exchangeNum);

	



}
