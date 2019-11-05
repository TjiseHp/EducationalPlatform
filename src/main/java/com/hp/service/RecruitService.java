package com.hp.service;
import java.util.List;

import com.hp.bean.Recruit;
import com.hp.bean.User;

public interface RecruitService {

	List<Recruit> queryAllBycNum(Recruit recruit);

	int insertSelective(Recruit record);
	
	List<Recruit> queryRecruitHistory(Integer uId);
	
	List<Recruit> queryRecruitByuId(Integer uId);

	String queryRecruitTextByRecruitNum(Integer recruitNum);
	
	Recruit queryAllByRecruitNum(Integer recruitNum);
	
	int updateByPrimaryKeySelective(Recruit record);	

	List<Recruit> queryRecruitByUid2(Integer uId);
}
