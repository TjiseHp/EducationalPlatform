package com.hp.dao;

import com.hp.bean.Main;
import com.hp.bean.MainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MainMapper {
    long countByExample(MainExample example);

    int deleteByExample(MainExample example);

    int deleteByPrimaryKey(Integer mNum);

    int insert(Main record);

    int insertSelective(Main record);

    List<Main> selectByExample(MainExample example);

    Main selectByPrimaryKey(Integer mNum);

    int updateByExampleSelective(@Param("record") Main record, @Param("example") MainExample example);

    int updateByExample(@Param("record") Main record, @Param("example") MainExample example);

    int updateByPrimaryKeySelective(Main record);

    int updateByPrimaryKey(Main record);
}