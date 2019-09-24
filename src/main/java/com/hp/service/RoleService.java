package com.hp.service;
import java.util.List;
import com.hp.bean.Role;

public interface RoleService {

	Role queryAllRole(Integer rNum);

	List<Role> queryAllRole();

	Role queryRoleByrNum(Integer rNum);

}
