package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Group;
import com.hp.dao.GroupDao;
import com.hp.dao.GroupMapper;
import com.hp.service.GroupService;

@Service
public  class GroupServiceImpl implements GroupService {
	
	@Autowired
	public GroupDao groupDao;
	
	@Autowired
	public GroupMapper groupMapper;

	public List<Group> queryAllGroup() {
		return groupDao.queryAllGroup();
	}

	public Group queryGroupBygNum(Integer gNum) {
		return groupDao.queryGroupBygNum(gNum);
	}

	public int updateByPrimaryKeySelective(Group group) {
		return groupMapper.updateByPrimaryKeySelective(group);
	}

	public int insertSelective(Group group) {
		return groupMapper.insertSelective(group);
	}

	public int deleteByPrimaryKey(Integer getgNum) {
		return groupMapper.deleteByPrimaryKey(getgNum);
	}

}
