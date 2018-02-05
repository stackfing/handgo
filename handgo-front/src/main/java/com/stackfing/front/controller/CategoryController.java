package com.stackfing.front.controller;

import com.stackfing.common.service.CategoryService;
import com.stackfing.common.service.ProductService;
import com.stackfing.common.utils.Result;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午11:42 18-2-5
 */

@Controller
public class CategoryController {

	@Autowired
	private ProductService productService;

	@GetMapping("/category/{id}")
	public String categoryDetail(@PathVariable Long id) {
		return "home/category";
	}

	@GetMapping("/category/page/{page}")
	@ResponseBody
	public Result categoryPage(@PathVariable Integer page) {
		return Result.success(productService.getProductList(page, 10));
	}

}
