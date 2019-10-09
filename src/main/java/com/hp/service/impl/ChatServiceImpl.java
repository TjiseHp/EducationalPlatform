package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Chat;
import com.hp.bean.Chat_status;
import com.hp.dao.ChatDao;
import com.hp.dao.ChatMapper;
import com.hp.dao.Chat_statusMapper;
import com.hp.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService{

	@Autowired
	public ChatDao chatDao;
	
	@Autowired
	public ChatMapper  chatMapper;
	
	@Autowired
	public Chat_statusMapper chat_statusMapper;

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

	public int insertSelective(Chat chat) {
		// TODO Auto-generated method stub
		return chatMapper.insertSelective(chat);
	}

	public List<Chat> queryAllSendInfoByuId(Integer uId) {
		// TODO Auto-generated method stub
		return chatDao.queryAllSendInfoByuId(uId);
	}

	public List<Chat> queryChatListByuId(Integer uId) {
		// TODO Auto-generated method stub
		return chatDao.queryChatListByuId(uId);
	}

	public Chat_status queryStatus(Integer cSNum) {
		// TODO Auto-generated method stub
		return chat_statusMapper.selectByPrimaryKey(cSNum);
	}

	public int updateByPrimaryKeySelective(Integer chatNum) {
		// TODO Auto-generated method stub
		return chatDao.updateByPrimaryKeySelective(chatNum);
	}
	

}

