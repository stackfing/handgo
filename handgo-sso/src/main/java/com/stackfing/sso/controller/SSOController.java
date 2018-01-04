package com.stackfing.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:30 18-1-3
 */
@Controller
public class SSOController {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@GetMapping("/hi")
	@ResponseBody
	public String hi() {
		ValueOperations<String, String> stringStringValueOperations = redisTemplate.opsForValue();
		System.out.println(stringStringValueOperations.get("a"));
		return "hi";
	}

	@GetMapping("/login")
	public String toLogin(String redirect) {
		System.out.println(redirect);
		return "login";
	}

	@GetMapping("/register")
	public String toRegister() {
		return "register";
	}
}
