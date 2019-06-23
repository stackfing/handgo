package com.stackfing.admin.controller;

import com.stackfing.admin.entity.Product;
import com.stackfing.admin.service.ProductService;
import com.stackfing.admin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:43 19-6-7
 */

@RestController
@RequestMapping("product")
public class ProductController extends BaseController<Product, Long> {

	@Autowired
	private ProductService productService;

	@PostMapping("selectBatchSellerIdIn")
	public Result selectBatchSellerIdIn(@RequestBody List<Long> ids) {
		return Result.ok(productService.selectAllProductByBatchSellerId(ids));
	}
}
