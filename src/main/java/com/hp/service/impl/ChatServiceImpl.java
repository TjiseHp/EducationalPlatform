package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Chat;
import com.hp.dao.ChatDao;
import com.hp.dao.ChatMapper;
import com.hp.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService{

	@Autowired
	public ChatDao chatDao;
	
	@Autowired
	public ChatMapper  chatMapper;

	public List<Chat> queryAllReceiveInfoByuId(Integer uId2) {
		// TODO Auto-generated method stub
		return chatDao.queryAllReceiveInfoByuId(uId2);	}

	public int deleteByPrimaryKey(Integer chatNum) {
		// TODO Auto-generated method stub
		return chatMapper.deleteByPrimaryKey(chatNum);
	}

	public Chat selectByPrimaryKey(Integer chatNum ,Integer uId) {
		// TODO Auto-generated method stub
		return chatDao.selectByPrimaryKey(chatNum,uId);
	}

	public Chat queryChatByChatNum(Integer chatNum) {
		// TODO Auto-generated method stub
		return chatDao.queryChatByChatNum(chatNum);
	}
	

}

