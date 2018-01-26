package com.stackfing.common.service;

import com.stackfing.common.vo.ProductVo;
import com.stackfing.pojo.Product;

import java.util.List;

public interface ProductService {

	//获得产品列表（分页）
	List<Product> getProductList(Integer page, Integer limit);

	//获得产品列表 (不分页)
	List<Product> getProductList();

	//根据产品ID查询产品
	Product getProductById(Long id);

	//根据ID更新产品
	Product updateProductById(Long id, ProductVo vo);

	//创建产品
	Product createProduct(Product product);

	Product createProduct(ProductVo vo);

	Product createProduct(ProductVo vo, String description);

	int deleteById(Long id);

	List<Product> getHotProduct();

	List<Product> getProductByCategoryId(Integer id);
}