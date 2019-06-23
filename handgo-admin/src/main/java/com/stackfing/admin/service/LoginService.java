package com.stackfing.admin.service;

import com.stackfing.admin.entity.User;

/**
 * @Author: fing
 * @Description:	用户登录服务
 * @Date: 下午1:19 19-6-23
 */
public interface LoginService {
	/**
	 * 用户是否登录成功
	 * @param user
	 * @return
	 */
	int login(User user);

	/**
	 * 用户退出
	 * @param user
	 * @return
	 */
	int logout(User user);
}
