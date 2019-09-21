package com.hp.service;

import com.hp.bean.Appraise;

public interface AppraiseService {

	int insertSelective(Appraise appraise);
	
	Appraise queryAppraiseByUid(Appraise appraise);
}
