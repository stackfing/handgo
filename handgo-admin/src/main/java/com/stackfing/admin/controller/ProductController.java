package com.stackfing.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:05 18-1-26
 */

@Controller
public class ProductController {

	@GetMapping("/product")
	public String toProduct() {
		return "product";
	}

	@GetMapping("/productEdit")
	public String toProductEdit() {
		return "product-edit";
	}

}
