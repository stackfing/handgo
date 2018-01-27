package com.stackfing.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:39 18-1-27
 */

@Controller
public class IndexController {

	@GetMapping("/home")
	public String home() {
		return "person/index";
	}

}
