package com.stackfing.sso.controller;

import com.stackfing.common.service.CustomerService;
import com.stackfing.common.service.serviceImpl.CustomerServiceImpl;
import com.stackfing.common.utils.HandgoResult;
import com.stackfing.pojo.Customer;
import com.stackfing.sso.pojo.User;
import com.stackfing.sso.service.serviceImpl.SSOServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private CustomerServiceImpl customerService;

	@GetMapping("")
	public String index() {
		return "login";
	}

	@GetMapping("/login")
	public String toLogin(String redirect, Model model, HttpServletRequest request, HttpServletResponse response) {
		if (request.getSession().getAttribute("id") != null) {
			return "redirect:http://i.stackfing.com/home";
		}
		return "login";
	}

	@GetMapping("/register")
	public String toRegister() {
		return "register";
	}

	@PostMapping("/login")
	public String doLogin(User user, String redirect, HttpServletResponse response, Model model, HttpServletRequest request) throws IOException {
		if (redirect == null) {
			redirect = "http://i.stackfing.com/home";
		}
		if (request.getSession().getAttribute("id") != null) {
			return "redirect:http://i.stackfing.com/home";
		}
		Customer customer = customerService.findByAccount(user.getAccount());
		request.getSession().setAttribute("id", customer.getId());
		System.out.println(request.getSession().getAttribute("id"));
		return "redirect:http://i.stackfing.com/home";
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
	}

	@GetMapping("/session")
	@ResponseBody
	public String se(HttpServletRequest request) {
		request.getSession().setAttribute("id", "123123");

		System.out.println(request.getSession().getAttribute("id"));
		return (String) request.getSession().getAttribute("id");
	}
}
