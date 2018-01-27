package com.stackfing.common.service;

import com.stackfing.common.vo.CategoryVo;
import com.stackfing.pojo.Category;

import java.util.List;

/**
 * @Author: fing
 * @Description: 产品分类接口
 * @Date: 下午3:38 18-1-19
 * @see com.stackfing.common.service.serviceImpl.CategoryServiceImpl
 */
public interface CategoryService {

	Category update(Long id, CategoryVo vo);

	List<Category> getCategoryList(Integer page, Integer limit);

	List<Category> getCategoryList();

	List<Category> getCategoryParent();

	Category save(CategoryVo vo);

	List<Category> getSubCategoryById(Long id);

	int deleteById(Long id);

	Category getCategoryById(Long id);

}
