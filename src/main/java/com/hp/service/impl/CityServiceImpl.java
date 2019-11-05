package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.City;
import com.hp.bean.Recruit;
import com.hp.bean.User;
import com.hp.dao.CityDao;
import com.hp.dao.UserDao;
import com.hp.dao.UserMapper;
import com.hp.service.CityService;
import com.hp.service.UserService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	CityDao cityDao;

	public City queryCityByCnum(Integer cNum) {
		// TODO Auto-generated method stub
		return cityDao.queryCityByCnum(cNum);
	}

	public List<City> queryCityAllprovince() {
		// TODO Auto-generated method stub
		return cityDao.queryCityAllprovince();
	}

	public List<City> queryCityBycProvince(City city) {
		// TODO Auto-generated method stub
		return cityDao.queryCityBycProvince(city);
	}

	public Integer querycNumBycCity(String cNum) {
		// TODO Auto-generated method stub
		return cityDao.querycNumBycCity(cNum);
	}

}
