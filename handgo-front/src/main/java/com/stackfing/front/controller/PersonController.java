package com.stackfing.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:35 18-1-27
 */

@Controller
@RequestMapping("/person")
public class PersonController {

	@GetMapping("/information")
	public String information() {
		return "person/information";
	}

	@GetMapping("/safety")
	public String safety() {
		return "person/safety";
	}

}
