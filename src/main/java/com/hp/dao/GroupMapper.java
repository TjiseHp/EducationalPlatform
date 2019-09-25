package com.hp.dao;

import com.hp.bean.Group;
import com.hp.bean.GroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupMapper {
    long countByExample(GroupExample example);

    int deleteByExample(GroupExample example);

    int deleteByPrimaryKey(Integer gNum);

    int insert(Integer gNum);

    int insertSelective(Group group);

    List<Group> selectByExample(GroupExample example);

    Group selectByPrimaryKey(Integer gNum);

    int updateByExampleSelective(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByExample(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByPrimaryKeySelective(Group group);

    int updateByPrimaryKey(Integer gNum);
}