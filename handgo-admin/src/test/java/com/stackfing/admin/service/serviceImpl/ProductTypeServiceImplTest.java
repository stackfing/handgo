package com.stackfing.admin.service.serviceImpl;

import com.stackfing.pojo.ProductType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ProductTypeServiceImplTest {

	@Autowired
	private ProductTypeServiceImpl productService;

	@Test
	public void updateTypeById() {
		ProductType productType = new ProductType();
		productType.setId(1L);
		productType.setAvaliable(1);
		productType.setIsRoot(1);
		productService.updateTypeById(productType);
	}
}