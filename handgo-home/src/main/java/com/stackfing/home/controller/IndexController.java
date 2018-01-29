package com.stackfing.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:39 18-1-27
 */

@Controller
public class IndexController {

	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		request.getSession().setAttribute("username", "admin");
		return "person/index";
	}

	@GetMapping("/session")
	@ResponseBody
	public String get(HttpServletRequest request) {
		String id = (String) request.getSession().getAttribute("id");
		return id;
	}
}
