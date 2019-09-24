package com.hp.dao;
import org.apache.ibatis.annotations.Delete;

public interface PowerDao {
	
	@Delete("delete from e_power where RO_NO = #{roNo}")
	int DeletePowerForRoNo(Integer roNo);
	
}
