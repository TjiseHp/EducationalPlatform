package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.bean.Exchange;
import com.hp.controller.ExchangeController;
import com.hp.dao.ExchangeDao;
import com.hp.dao.ExchangeMapper;
import com.hp.dao.UserMapper;
import com.hp.service.ExchangeService;

@Service
public class ExchangeServiceImpl implements ExchangeService {
	
	@Autowired
	public ExchangeDao exchangeDao;


	@Autowired
	public ExchangeMapper exchangeMapper;
	
	public List<Exchange> queryAllExchange() {
		// TODO Auto-generated method stub
		return exchangeDao.queryAllExchange();
	}
	
	public Exchange queryExchangeByexchangeNum(Integer exchangeNum) {
		return exchangeDao.queryExchangeByexchangeNum(exchangeNum);
	}

	public int updateByPrimaryKeySelective(Exchange exchange) {
		return exchangeMapper.updateByPrimaryKeySelective(exchange);
	}
	
	public List<Exchange> queryExchangeByExample(String search) {
		return exchangeDao.queryExchangeByExample(search);
	}
	
	public int insertSelective(Exchange exchange) {
		return exchangeMapper.insertSelective(exchange);
	}

	public double queryExchange() {
		return exchangeDao.queryExchange();
	}





}
