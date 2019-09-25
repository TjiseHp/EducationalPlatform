package com.hp.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.dao.PowerDao;
import com.hp.service.PowerService;

@Service
public class PowerServiceImpl implements PowerService {
	
	@Autowired
	private PowerDao powerDao;

	public int DeletePowerForRoNo(Integer roNo) {
		return powerDao.DeletePowerForRoNo(roNo);
	}
	
}
