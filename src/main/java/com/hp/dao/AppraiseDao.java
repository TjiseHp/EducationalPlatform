package com.hp.dao;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Appraise;
import com.hp.bean.Recruit;

public interface AppraiseDao {
	
	@Select("select * from e_appraise where u_id = #{uId} and u_id2 = #{uId2}")
	Appraise queryAppraiseByUid(Appraise appraise);

}
