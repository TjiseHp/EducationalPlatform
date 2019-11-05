package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.dao.UtilDao;
import com.hp.service.UtilService;

@Service
public class UtilServiceImpl implements UtilService {

	@Autowired
	public UtilDao utilDao;
	
	public List<String> queryEmailOnly2(String email) {
		return utilDao.queryEmailOnly2(email);
	}

	public int queryEmailOnly(String email) {
		return utilDao.queryEmailOnly(email);
	}

	public int queryEmailCount() {
		return utilDao.queryEmailCount();
	}

	public int insertEmail(String email) {
		return utilDao.insertEmail(email);
	}

}
