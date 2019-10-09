package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hp.bean.Chat;
import com.hp.bean.Chat_status;

public interface ChatDao {

	
	List<Chat> queryAllReceiveInfoByuId(Integer uId2);

	
	Chat selectByPrimaryKey(@Param("chatNum")Integer chatNum, @Param("uId")Integer uId);

	@Select ("select * from e_chat where chat_num=#{chatNum}")
	Chat queryChatByChatNum(Integer chatNum);


	List<Chat> queryAllSendInfoByuId(Integer uId);

    @Select("select * from e_chat where u_Id=#{uId}")
	List<Chat> queryChatListByuId(Integer uId);

    @Update("update e_chat set C_S_NUM = 2 where CHAT_NUM = #{chatNum}")
	int updateByPrimaryKeySelective(Integer chatNum);

	

}
