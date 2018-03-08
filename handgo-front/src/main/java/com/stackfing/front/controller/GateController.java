package com.stackfing.front.controller;

import com.stackfing.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:11 18-3-8
 */

@Controller
public class GateController {

	@Autowired
	private ProductService productService;

	@GetMapping("/gate")
	public String gate(Long pid, Model model, HttpServletResponse response) {
		model.addAttribute("product", productService.getProductById(pid));
		Cookie cookie = new Cookie("cart_list", pid.toString());
		//TODO 多次访问添加cookie问题
		response.addCookie(cookie);
		return "/home/gate-success";
	}

}
