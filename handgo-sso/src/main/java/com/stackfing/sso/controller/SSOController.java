package com.stackfing.sso.controller;

import com.stackfing.common.utils.HandgoResult;
import com.stackfing.sso.pojo.User;
import com.stackfing.sso.service.SSOService;
import com.stackfing.sso.service.serviceImpl.SSOServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:30 18-1-3
 */
@Controller
public class SSOController {

	@Autowired
	private SSOServiceImpl ssoService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String toLogin(String redirect, Model model) {
//		System.out.println(redirect);
		model.addAttribute("redirect", redirect);
		return "login";
	}

	@GetMapping("/register")
	public String toRegister() {
		return "register";
	}

	@PostMapping("/login")
	@ResponseBody
	public HandgoResult doLogin(@RequestBody User user, String redirect, HttpServletResponse response) {
		System.out.println(redirect);
		if (user.getAccount() == null) {
			return new HandgoResult().faild("账号不能为空");
		}
		if (user.getPassword() == null) {
			return new HandgoResult().faild("密码不能为空");
		}
		return ssoService.login(user.getAccount(), user.getPassword(), response);
//		return new HandgoResult().ok("ok");
	}

	/**
	 * 验证token，返回用户信息
	 * @return
	 */
	@GetMapping("/test")
	@ResponseBody
	public String tests(String token) {
		if (token.equals("null")) {
			return null;
		}
		System.out.println(token);
		String account = "accounts";
		return "userInfo('" + account + "')";
	}

}
