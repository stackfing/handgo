package com.stackfing.rest.controller;

import com.stackfing.common.utils.Result;
import com.stackfing.pojo.Product;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
	@GetMapping("/")
	public List<Product> getProductList() {
		return null;
	}

	@ApiOperation("根据产品ID查询产品信息")
	@GetMapping("{id}")
	public Product getProductById(@PathVariable Long id) {
		return null;
	}

	@ApiOperation("添加产品")
	@PostMapping("/")
	public Result addProduct(@RequestParam Product product) {
		return null;
	}

	@ApiOperation("更新产品")
	@PostMapping("/{id}")
	public Result updateProduct(@RequestParam Product product, @PathVariable Long id) {
		return null;
	}

	@ApiOperation("查询热销商品")
	@GetMapping("/hot")
	public List<Product> getHotProduct() {
		return null;
	}

}
