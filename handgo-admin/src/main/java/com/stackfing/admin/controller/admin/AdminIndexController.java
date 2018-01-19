package com.stackfing.admin.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AdminIndexController {

	@GetMapping("")
	public String index() {
		return "index";
	}

	@GetMapping("/productPage")
	public String pro() {
		return "product";
	}

	@GetMapping("/productEdit")
	public String productEdit() {
		return "product-edit";
	}

}
