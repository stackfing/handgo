package com.stackfing.admin.interceptor;

import com.stackfing.common.exception.HandgoException;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:50 17-12-27
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

//	@Autowired
//	private RedisTemplate<String, String> redisTemplate;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//		String header = request.getHeader("token");
//		System.out.println(request.getHeader("token"));
//		if (header == null) {
//			throw new HandgoException("您还未登录");
//		}
//
//		if (header.equals("ok")) {
//			throw new HandgoException("看就看，你点什么");
//		}
//		System.out.println(header + "------------------------------------------------------------");

//		Cookie[] cookies = null;
//		if (request.getCookies() != null) {
//			cookies = request.getCookies();
//			String uid = null;
//			String token = null;
//			for (Cookie cookie : cookies) {
//				if (cookie.getName().equals("uid")) {
//					uid = cookie.getValue();
//				}
//
//				if (cookie.getName().equals("token")) {
//					token = cookie.getValue();
//				}
//			}
//
//			if (null != token) {
////			if (stringStringValueOperations.get(token).equals(uid)) {
////				return true;
////			}
//				return true;
//			}
//		}
//		response.sendRedirect("http://localhost:8889/login?redirect=" + request.getRequestURL());
		return true;
	}
}
