package com.hp.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.PayDao;
import com.hp.dao.PayMapper;
import com.hp.service.AlipayService;

@Service
public class AlipayServiceImpl implements AlipayService {

	@Autowired
	public PayMapper payMapper;
	
	@Autowired
	public PayDao payDao;
	
	
	
}
