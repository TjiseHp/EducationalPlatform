package com.hp.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Recruit;
import com.hp.bean.User;
import com.hp.dao.RecruitDao;
import com.hp.dao.RecruitMapper;
import com.hp.dao.UserDao;
import com.hp.service.RecruitService;
import com.hp.service.UserService;

@Service
public class RecruitServiceImpl implements RecruitService {

	@Autowired
	public RecruitDao recruitDao;
	
	@Autowired
	public RecruitMapper recruitMapper;
	
	public List<Recruit> queryAllBycNum(Recruit recruit){
		return recruitDao.queryAllBycNum(recruit);
	}

	public int insertSelective(Recruit record) {
		// TODO Auto-generated method stub
		return recruitMapper.insertSelective(record);
	}

	public List<Recruit> queryRecruitHistory(Integer uId) {
		// TODO Auto-generated method stub
		return  recruitDao.queryRecruitHistory(uId);
	}

	public List<Integer> queryRecruitByuId(Integer uId) {
		// TODO Auto-generated method stub
		return recruitDao.queryRecruitByuId(uId);
	}



	

}
