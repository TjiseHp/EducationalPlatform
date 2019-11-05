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

	//通过城市查询主键
	@Select("select C_NUM from e_city where C_CITY=#{cNum}")
	Integer querycNumBycCity(String cNum);
}
