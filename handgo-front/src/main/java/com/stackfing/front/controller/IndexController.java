package com.stackfing.front.controller;

import com.stackfing.common.service.KillProductService;
import com.stackfing.pojo.KillProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:46 18-1-26
 */

@Controller
public class IndexController {

	@Autowired
	private KillProductService killProductService;

	@GetMapping("")
	public String index(ModelMap modelMap, HttpServletRequest request) {
		String username = (String) request.getSession().getAttribute("username");
		modelMap.put("username", username);
		modelMap.put("killList", killProductService.productList());
		return "home/home2";
	}

	@GetMapping("/shopcart")
	public String shopCart() {
		return "home/shopcart";
	}
}
