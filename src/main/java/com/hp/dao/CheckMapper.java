package com.hp.dao;

import com.hp.bean.CheckExample;
import com.hp.bean.CheckKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckMapper {
    long countByExample(CheckExample example);

    int deleteByExample(CheckExample example);

    int deleteByPrimaryKey(CheckKey key);

    int insert(CheckKey record);

    int insertSelective(CheckKey record);

    List<CheckKey> selectByExample(CheckExample example);

    int updateByExampleSelective(@Param("record") CheckKey record, @Param("example") CheckExample example);

    int updateByExample(@Param("record") CheckKey record, @Param("example") CheckExample example);
}