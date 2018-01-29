package com.stackfing.home.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午9:13 18-1-27
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		return super.preHandle(request, response, handler);
//		System.out.println(request.getSession().getAttribute("id"));
//		if (request.getSession().getAttribute("id") == null) {
//			StringBuffer requestURL = request.getRequestURL();
//			System.out.println(request.getRequestURL());
//			response.sendRedirect("http://sso.stackfing.com/login?redirect=" + requestURL);
//			return false;
//		}
		return true;
	}
}
