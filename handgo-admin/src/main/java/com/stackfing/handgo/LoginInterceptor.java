package com.stackfing.handgo;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:50 17-12-27
 */
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

	private String[] excludedUrls;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		return super.preHandle(request, response, handler);

		String requestUri = request.getRequestURI();
		excludedUrls = new String[]{"/admin"};
		for (String s : excludedUrls) {
			if (requestUri.endsWith(s)) {
				return true;
			}
		}

		return true;
	}

	public void setExcludedUrls(String[] excludedUrls) {
		this.excludedUrls = excludedUrls;
	}
}
