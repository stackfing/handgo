package com.stackfing.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:35 18-1-27
 */

@Controller
@RequestMapping("/person")
public class PersonController {



	@GetMapping("/safety")
	public String safety() {
		return "person/safety";
	}

}
