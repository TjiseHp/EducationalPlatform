package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.City;

public interface CityDao {

	@Select("select * from e_city where c_num = #{cNum}")
	City queryCityByCnum(Integer cNum);
	
	@Select("select DISTINCT c_province from e_city")
	List<City> queryCityAllprovince();
	
	@Select("select * from e_city where c_province = #{cProvince}")
	List<City> queryCityBycProvince(City city);
}
