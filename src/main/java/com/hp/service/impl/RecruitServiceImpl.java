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

	public List<Recruit> queryRecruitByuId(Integer uId) {
		// TODO Auto-generated method stub
		return recruitDao.queryRecruitByuId(uId);
	}

	public String queryRecruitTextByRecruitNum(Integer recruitNum) {
		// TODO Auto-generated method stub
		return recruitDao.queryRecruitTextByRecruitNum(recruitNum);
	}

	public Recruit queryAllByRecruitNum(Integer recruitNum) {
		// TODO Auto-generated method stub
		return recruitDao.queryAllByRecruitNum(recruitNum);
	}

	public int updateByPrimaryKeySelective(Recruit record) {
		// TODO Auto-generated method stub
		return recruitMapper.updateByPrimaryKeySelective(record);
	}

	public List<Recruit> queryRecruitByUid2(Integer uId) {
		// TODO Auto-generated method stub
		return recruitDao.queryRecruitByUid2(uId);
	}



	

}
