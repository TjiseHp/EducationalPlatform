package com.hp.service;
import java.util.List;

import com.hp.bean.Recruit;
import com.hp.bean.User;

public interface RecruitService {

	List<Recruit> queryAllBycNum(Recruit recruit);

	int insertSelective(Recruit record);
	
	List<Recruit> queryRecruitHistory();

}
