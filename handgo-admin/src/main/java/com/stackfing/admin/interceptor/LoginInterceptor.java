package com.stackfing.admin.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:50 17-12-27
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		Cookie[] cookies = null;
		if (request.getCookies() != null) {
			cookies = request.getCookies();
			String uid = null;
			String token = null;
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("uid")) {
					uid = cookie.getValue();
				}

				if (cookie.getName().equals("token")) {
					token = cookie.getValue();
				}
			}

			if (null != token) {
//			if (stringStringValueOperations.get(token).equals(uid)) {
//				return true;
//			}
				return true;
			}
		}
//		response.sendRedirect("http://localhost:8889/login?redirect=" + request.getRequestURL());
		return true;
	}
}
