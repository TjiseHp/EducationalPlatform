package com.hp.dao;

import com.hp.bean.Check_list;
import com.hp.bean.Check_listExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Check_listMapper {
    long countByExample(Check_listExample example);

    int deleteByExample(Check_listExample example);

    int deleteByPrimaryKey(Integer listId);

    int insert(Check_list record);

    int insertSelective(Check_list record);

    List<Check_list> selectByExample(Check_listExample example);

    Check_list selectByPrimaryKey(Integer listId);

    int updateByExampleSelective(@Param("record") Check_list record, @Param("example") Check_listExample example);

    int updateByExample(@Param("record") Check_list record, @Param("example") Check_listExample example);

    int updateByPrimaryKeySelective(Check_list record);

    int updateByPrimaryKey(Check_list record);
}