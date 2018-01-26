package com.stackfing.common.service;

import com.stackfing.common.vo.CategoryVo;
import com.stackfing.pojo.Category;

import java.util.List;

/**
 * @Author: fing
 * @Description: 产品分类接口
 * @Date: 下午3:38 18-1-19
 * @see
 */
public interface CategoryService {

	Category update(Integer id, CategoryVo vo);

	List<Category> getCategoryList(Integer page, Integer limit);

	List<Category> getCategoryList();

	Category save(CategoryVo vo);

	List<Category> getSubCategoryById(Integer id);

	int deleteById(Integer id);

}
