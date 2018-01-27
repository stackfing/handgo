package com.stackfing.common.service.serviceImpl;

import com.stackfing.common.service.FrontCommendService;
import com.stackfing.pojo.Category;
import com.stackfing.pojo.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:12 18-1-27
 */

@Service
public class FrontCommendServiceImpl implements FrontCommendService {
	@Override
	public List<Category> getFrontCategory() {
		List list = new ArrayList();
		Category category = new Category();
		category.setId(1L);
		category.setName("asdfsdafds");
		list.add(category);
		return list;
	}

	@Override
	public List<Category> subCommendCategory(Long id) {
		List list = new ArrayList();
		Category category = new Category();
		category.setId(id);
		category.setName("asdf");
		list.add(category);
		return list;
	}

	@Override
	public List<Product> starProduct(Long id) {
		List list = new ArrayList();
		Product product = new Product();

		product.setPrice(new BigDecimal(15.3));
		product.setName("asdfsdf");

		Product product1 = new Product();

		product1.setPrice(new BigDecimal(15.3));
		product1.setName("212123123123");
		list.add(product);
		list.add(product1);
		Product p2 = new Product();
		p2.setName("2");
		p2.setPrice(new BigDecimal(15.6));
		list.add(p2);

		Product p3 = new Product();
		p3.setName("4");
		p3.setPrice(new BigDecimal(15.6));
		list.add(p3);

		Product p4 = new Product();
		p4.setName("5");
		p4.setPrice(new BigDecimal(15.6));
		list.add(p4);

		Product p5 = new Product();
		p5.setName("6");
		p5.setPrice(new BigDecimal(15.6));
		list.add(p5);

		Product p6 = new Product();
		p6.setName("7");
		p6.setPrice(new BigDecimal(15.6));
		list.add(p6);

//		Product p2 = new Product();
//		p2.setName("2");
//		p2.setPrice(new BigDecimal(15.6));
//		list.add(p2);
//
//		Product p2 = new Product();
//		p2.setName("2");
//		p2.setPrice(new BigDecimal(15.6));
//		list.add(p2);

		return list;
	}
}
