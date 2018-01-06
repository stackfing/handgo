package com.stackfing.sso.service;

import com.stackfing.common.utils.HandgoResult;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fing
 * @Description: 单点登录服务
 * @Date: 下午1:44 18-1-3
 */
public interface SSOService {

	HandgoResult checkData(Integer type, String data);

	HandgoResult login(String account, String password, HttpServletResponse response);

	HandgoResult logout(String token);

	boolean isAlive(String token);

}
