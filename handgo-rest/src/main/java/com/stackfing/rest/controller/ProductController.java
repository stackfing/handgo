package com.stackfing.rest.controller;

import com.stackfing.common.utils.HandgoResult;
import com.stackfing.common.utils.ObjectUtil;
import com.stackfing.rest.dao.ProductDao;
import com.stackfing.common.utils.Result;
import com.stackfing.pojo.Product;
import com.stackfing.rest.service.ProductService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:23 18-1-16
 */

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@ApiOperation("产品列表")
	@GetMapping("")
	public HandgoResult getProductList(@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer limit) {
		if (ObjectUtil.validate(page) || ObjectUtil.validate(limit)) {
			return productService.getProductList(page, limit);
		}
		return HandgoResult.error("参数错误，请重试");
	}

	@ApiOperation("根据产品ID查询产品信息")
	@GetMapping("{id}")
	public HandgoResult getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	@ApiOperation("添加产品")
	@PostMapping("/")
	public HandgoResult addProduct(@RequestBody(required = false) Product product) {
		if (ObjectUtil.validate(product)) {
			return productService.addProduct(product);
		}
		return HandgoResult.error("参数错误");
	}

	@ApiOperation("更新产品")
	@PostMapping("/{id}")
	public HandgoResult updateProduct(@RequestBody(required = false) @Validated Product product, BindingResult  bindingResult
			, @PathVariable Long id) {
		if (bindingResult.hasErrors()) {
			return HandgoResult.error("参数不足");
		}
		if (ObjectUtil.validate(product)) {
			return productService.updateProductById(id, product);
		}
		return HandgoResult.error("参数错误");
	}

}
