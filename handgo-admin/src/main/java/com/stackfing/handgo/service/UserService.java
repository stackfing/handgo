package com.stackfing.handgo.service;

import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.entity.UserLocate;

import java.util.List;

public interface UserService {

    //用户登录
    List<User> selectUserByStatusIs(int status);
	//根据
    //UserLocate findParmiry(Long uid);
	//查询所有用户
    List<User> selectAllUser();
	//根据id查询用户
	User selectUserById(Long uid);
	//保存用户
	void saveUser(User user);
	//删除用户
	int deleteUserById(Long uid);
	//分页查询用户数据
	List<User> selectAllUserByPage(Long page);

	List<User> selectAllDeletedUserByPage(Long page);
}
