package com.stackfing.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:34 18-1-26
 */

@Controller
@RequestMapping("/category")
public class CategoryController {

	@GetMapping("")
	public String category() {
		return "category";
	}
}
