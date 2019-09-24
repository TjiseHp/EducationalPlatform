package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hp.bean.Chat;

public interface ChatDao {

	
	List<Chat> queryAllReceiveInfoByuId(Integer uId);

	
	Chat selectByPrimaryKey(@Param("chatNum")Integer chatNum, @Param("uId")Integer uId);

	@Select ("select * from e_chat where chat_num=#{chatNum}")
	Chat queryChatByChatNum(Integer chatNum);
	

}
