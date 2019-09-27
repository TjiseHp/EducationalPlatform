package com.hp.dao;

import com.hp.bean.Role;
import com.hp.bean.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer roNo);

    int insert(Integer roNo);

    int insertSelective(Role role);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer roNo);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role role);

    int updateByPrimaryKey(Integer roNo);
}