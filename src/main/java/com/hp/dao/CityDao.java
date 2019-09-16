package com.hp.dao;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.City;

public interface CityDao {

	@Select("select * from e_city where c_num = #{cNum}")
	City queryCityByCnum(Integer cNum);
}
