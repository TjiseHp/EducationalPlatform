package com.hp.dao;

import com.hp.bean.Credit;
import com.hp.bean.CreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditMapper {
    long countByExample(CreditExample example);

    int deleteByExample(CreditExample example);

    int deleteByPrimaryKey(Integer creditNum);

    int insert(Credit record);

    int insertSelective(Credit credit);

    List<Credit> selectByExample(CreditExample example);

    Credit selectByPrimaryKey(Integer creditNum);

    int updateByExampleSelective(@Param("record") Credit record, @Param("example") CreditExample example);

    int updateByExample(@Param("record") Credit record, @Param("example") CreditExample example);

    int updateByPrimaryKeySelective(Credit record);

    int updateByPrimaryKey(Credit record);
}