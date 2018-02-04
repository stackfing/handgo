package com.stackfing.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
	@GetMapping("")
	public String index() {
		return "a";
	}

//	@GetMapping("/session")
//	@ResponseBody
//	public String set(HttpServletRequest request) {
//		if (request.getSession().getAttribute("abc") == null) {
//			System.out.println("session 为空");
//		}
//		request.getSession().setAttribute("abc", "asdfsadfsadf");
//		System.out.println(request.getSession().getAttribute("abc"));
//		return "ok";
//	}
}
