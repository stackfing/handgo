package com.stackfing.front.controller;

import com.stackfing.pojo.Product;
import com.stackfing.service.ProductPhotosService;
import com.stackfing.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:58 18-1-26
 */

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductPhotosService productPhotosService;

	@GetMapping("/item/{id}")
	public String productDetail(@PathVariable Long id, ModelMap map) {
		Product productById = productService.getProductById(id);
		map.put("product", productById);
		return "home/product-detail";
	}

}
