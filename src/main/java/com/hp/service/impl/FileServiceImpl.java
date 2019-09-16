package com.hp.service.impl;
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
}
