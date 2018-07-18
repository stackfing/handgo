package com.stackfing.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:29 18-3-8
 */
@Controller
public class CartController {

	@GetMapping("/shopcart")
	public String shopCart(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("cart_list")) {
				System.out.println(cookie.getValue());
			}
		}
		return "home/shopcart";
	}

}
