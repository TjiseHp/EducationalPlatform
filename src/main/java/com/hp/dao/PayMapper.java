package com.hp.dao;

import com.hp.bean.Pay;
import com.hp.bean.PayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayMapper {
    long countByExample(PayExample example);

    int deleteByExample(PayExample example);

    int deleteByPrimaryKey(String payNum);

    int insert(Pay record);

    int insertSelective(Pay record);

    List<Pay> selectByExample(PayExample example);

    Pay selectByPrimaryKey(String payNum);

    int updateByExampleSelective(@Param("record") Pay record, @Param("example") PayExample example);

    int updateByExample(@Param("record") Pay record, @Param("example") PayExample example);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);
}