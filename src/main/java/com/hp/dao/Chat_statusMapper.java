package com.hp.dao;

import com.hp.bean.Chat_status;
import com.hp.bean.Chat_statusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Chat_statusMapper {
    long countByExample(Chat_statusExample example);

    int deleteByExample(Chat_statusExample example);

    int deleteByPrimaryKey(Integer cSNum);

    int insert(Chat_status record);

    int insertSelective(Chat_status record);

    List<Chat_status> selectByExample(Chat_statusExample example);

    Chat_status selectByPrimaryKey(Integer cSNum);

    int updateByExampleSelective(@Param("record") Chat_status record, @Param("example") Chat_statusExample example);

    int updateByExample(@Param("record") Chat_status record, @Param("example") Chat_statusExample example);

    int updateByPrimaryKeySelective(Chat_status record);

    int updateByPrimaryKey(Chat_status record);
}