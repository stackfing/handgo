package com.stackfing.service;

import com.stackfing.pojo.Category;
import com.stackfing.pojo.Product;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午3:50 18-1-27
 */
public interface FrontCommendService {

	List<Category> getFrontCategory();

	List<Category> subCommendCategory(Long id);

	List<Product> starProduct(Long id);
}
