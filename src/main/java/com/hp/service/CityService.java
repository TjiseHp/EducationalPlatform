package com.hp.service;

import java.util.List;

import com.hp.bean.City;

public interface CityService {

	City queryCityByCnum(Integer cNum);
	
	List<City> queryCityAllprovince();
	
	List<City> queryCityBycProvince(City city);

	Integer querycNumBycCity(String cNum);
}
