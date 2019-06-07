package com.stackfing.admin.controller;

import com.stackfing.admin.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:43 19-6-7
 */

@RestController
@RequestMapping("product")
public class ProductController extends BaseController<Product, Long> {
}
