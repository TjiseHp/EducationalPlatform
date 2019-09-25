package com.hp.service;

import java.util.List;

import com.hp.bean.Group;

public interface GroupService {

	List<Group> queryAllGroup();

	int updateByPrimaryKeySelective(Group group);

	Group queryGroupBygNum(Integer gNum);

	int insertSelective(Group group);

	int deleteByPrimaryKey(Integer getgNum);

}
