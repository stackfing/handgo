package com.stackfing.rest.controller;

import com.stackfing.pojo.Product;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:23 18-1-16
 */

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

	@ApiOperation("产品列表")
	@GetMapping("")
	public List<Product> getProductList() {
		return null;
	}

	@ApiOperation("产品信息")
	@GetMapping("{id}")
	public Product getProductById(@PathVariable Long id) {
		return null;
	}


}
