package com.stackfing.service;

import com.stackfing.pojo.Category;

import java.util.List;

/**
 * @Author: fing
 * @Description: 产品分类接口
 * @Date: 下午3:38 18-1-19
 * @see com.stackfing.service.serviceImpl.CategoryServiceImpl
 */
public interface CategoryService {

//	Category update(Long id, CategoryVo vo);

	List<Category> findAll(Integer page, Integer limit);

	List<Category> findAll();

	List<Category> findAllParent();

//	Category save(CategoryVo vo);

	List<Category> findAllSubCategoryById(Long id);

	int deleteById(Long id);

	Category findById(Long id);

}
