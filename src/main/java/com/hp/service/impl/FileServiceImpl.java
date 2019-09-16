package com.hp.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.dao.FileDao;
import com.hp.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Autowired
	public FileDao fileDao;

	public int queryMaxListId() {
		return fileDao.queryMaxListId();
	}
}
