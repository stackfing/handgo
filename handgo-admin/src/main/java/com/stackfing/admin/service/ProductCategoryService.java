package com.stackfing.admin.service;

import com.stackfing.common.utils.HandgoResult;
import com.stackfing.pojo.ProductCategory;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午3:38 18-1-19
 */
public interface ProductCategoryService {

	HandgoResult updateCategory(Long id, ProductCategory productCategory);

	HandgoResult getCategory(Integer page, Integer limit);

	HandgoResult addCategory(ProductCategory productCategory);

	HandgoResult getCategory();

	HandgoResult getSubCategoryById(Long id);

}
