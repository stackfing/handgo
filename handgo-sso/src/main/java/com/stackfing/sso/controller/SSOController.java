package com.stackfing.sso.controller;

import com.stackfing.common.utils.HandgoResult;
import com.stackfing.sso.pojo.User;
import com.stackfing.sso.service.serviceImpl.SSOServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;
import java.io.IOException;

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
	public String toLogin(String redirect, Model model, HttpServletRequest request, HttpServletResponse response) {
		if (request.getCookies() != null) {
			Cookie[] cookies = request.getCookies();
			for (Cookie cookie :
					cookies) {
				if (cookie.getName().equals("token")) {
					if (ssoService.isAlive(cookie.getValue())) {
						if (redirect == null) {
							return "redirect:http://localhost:8888";
						} else {
							return "redirect:" + redirect;
						}
					}
				}
			}
		}
		model.addAttribute("redirect", redirect);
		return "login";
	}

	@GetMapping("/register")
	public String toRegister() {
		return "register";
	}

	@PostMapping("/login")
	@ResponseBody
	public HandgoResult doLogin(@RequestBody User user, String redirect, HttpServletResponse response, Model model) {
		System.out.println(redirect);
		if (user.getAccount() == null) {
			return HandgoResult.error("账号不错为空");
		}
		if (user.getPassword() == null) {
			return HandgoResult.error("密码不能为空");
		}
		if (redirect == null) {
			redirect = "";
		}
		model.addAttribute("redirect", redirect);
		return ssoService.login(user.getAccount(), user.getPassword(), response);
//		return new HandgoResult().ok("ok");
	}

	@GetMapping("/logout")
	@ResponseBody
	public HandgoResult logout(String token, HttpServletResponse response) throws IOException {
		if (token == null) {
			return HandgoResult.error("token 为空");
		}
		response.sendRedirect("http://localhost:8888");
		return ssoService.logout(token);
	}


	/**
	 * 验证token，返回用户信息
	 *
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
		if (ssoService.isAlive(token)) {
			return "userInfo('" + account + "')";
		} else {
			return null;
		}
//		return "userInfo('" + account + "')";
	}

	@GetMapping("/session")
	@ResponseBody
	public String se(HttpServletRequest request) {
		System.out.println(request.getSession().getAttribute("abc"));
		return (String) request.getSession().getAttribute("abc");
	}
}
