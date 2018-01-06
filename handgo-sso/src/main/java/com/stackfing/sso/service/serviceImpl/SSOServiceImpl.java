package com.stackfing.sso.service.serviceImpl;

import com.stackfing.common.utils.HandgoResult;
import com.stackfing.sso.service.SSOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @Author: fing
 * @Description: 单点登录
 * @Date: 下午2:04 18-1-3
 */
@Service
public class SSOServiceImpl implements SSOService{

	@Autowired
	private RedisTemplate<String, String> redisTemplate;


	/**
	 * 验证用户信息
	 * @param type
	 * @param content
	 * @return
	 */
	@Override
	public HandgoResult checkData(Integer type, String content) {
		HandgoResult handgoResult = null;
		if (type == 1) {
			//用户名
			handgoResult = new HandgoResult().Build(200).ok("ok");
		}

		if (type == 2) {
			//密码
		}

		if (type == 3) {
			//邮箱
		}

		return handgoResult;
	}

	/**
	 * 用户登录
	 * @param account
	 * @param password
	 * @param response
	 * @return
	 */
	@Override
	public HandgoResult login(String account, String password, HttpServletResponse response) {
		HandgoResult handgoResult = null;
		if (account.equals("a") && password.equals("a")) {
			handgoResult = new HandgoResult();
			handgoResult.ok("ok").Build(200);
			ValueOperations<String, String> stringStringValueOperations = redisTemplate.opsForValue();
			String uuid = UUID.randomUUID().toString();
//			stringStringValueOperations.set(uuid, account);
			Cookie cookie = new Cookie("token", uuid);
//			cookie.setDomain("localhost");
			cookie.setPath("/");
			response.addCookie(cookie);
			handgoResult.setData(null);
		}
		if (handgoResult == null) {
			handgoResult = new HandgoResult().faild("登录失败！");
		}
		System.out.println(handgoResult);
		return handgoResult;
	}

	/**
	 * 	用户是否在线
	 * @param token
	 * @return
	 */
	@Override
	public boolean isAlive(String token) {
		return false;
	}
}
