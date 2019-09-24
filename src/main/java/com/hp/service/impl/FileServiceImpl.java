package com.hp.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Check_list;
import com.hp.dao.Check_listMapper;
import com.hp.dao.FileDao;
import com.hp.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	public FileDao fileDao;

	
	@Autowired
	public Check_listMapper check_listMapper;

	public int queryMaxListId() {
		return fileDao.queryMaxListId();
	}

	public int insertSelective(Check_list check_list) {
		return check_listMapper.insertSelective(check_list);
	}
	

	public List<Check_list> queryCheckList() {
		// TODO Auto-generated method stub
		return fileDao.queryCheckList();
	}

	public Check_list queryCheckListBylistName(Check_list check_list) {
		// TODO Auto-generated method stub
		return fileDao.queryCheckListBylistName(check_list);
	}

	public int updateByPrimaryKeySelective(Check_list check_list) {
		// TODO Auto-generated method stub
		return check_listMapper.updateByPrimaryKeySelective(check_list);
	}
}
