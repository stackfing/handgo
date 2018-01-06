package com.stackfing.common.utils;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:05 18-1-6
 */
public class CookieUtil {

	public static void addCookie(Cookie[] cookies, HttpServletResponse response) {
		for (Cookie cookie : cookies) {
			cookie.setPath("/");
//			cookie.setDomain(".stackfing.com");
			cookie.setMaxAge(1*60);
			response.addCookie(cookie);
		}
	}

}
