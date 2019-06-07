package com.stackfing.admin.service.Impl;

import com.stackfing.admin.entity.Product;
import com.stackfing.admin.repository.ProductRepository;
import com.stackfing.admin.service.ProductService;
import com.stackfing.admin.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:45 19-6-7
 */
@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, Long> implements ProductService {

	@Autowired
	private ProductRepository repository;
}
