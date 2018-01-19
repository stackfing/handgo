package com.stackfing.admin.service;

import com.stackfing.common.utils.HandgoResult;
import com.stackfing.pojo.Product;

public interface ProductService {
	HandgoResult getProductList(Integer page, Integer limit);

	HandgoResult getProductById(Long id);

	HandgoResult updateProductById(Long id, Product product);

	HandgoResult addProduct(Product product);

	HandgoResult deleteById(Long id);
}