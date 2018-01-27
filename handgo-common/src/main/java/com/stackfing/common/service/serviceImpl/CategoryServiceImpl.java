package com.stackfing.common.service.serviceImpl;

import com.stackfing.common.dao.CategoryDao;
import com.stackfing.common.enums.ProductRootEnum;
import com.stackfing.common.exception.HandgoException;
import com.stackfing.common.service.CategoryService;
import com.stackfing.common.vo.CategoryVo;
import com.stackfing.pojo.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午3:38 18-1-19
 */

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {


	@Autowired
	private CategoryDao categoryDao;

	@Override
	public Category update(Long id, CategoryVo vo) {
		if (null == id) {
			throw new HandgoException("产品 ID 为空");
		}
		Category one = categoryDao.findOne(id);
		BeanUtils.copyProperties(vo, one);
		return one;
	}

	@Override
	public List<Category> getCategoryList(Integer page, Integer limit) {
		if (null == page || null == limit) {
			log.warn("参数不完整，page = " + page + "limit = " + limit);
			throw new HandgoException("参数不完整");
		}
		List<Category> content = categoryDao.findAll(new PageRequest(page - 1, limit)).getContent();
		return content;
	}

	@Override
	public List<Category> getCategoryList() {
		return categoryDao.findAll();
	}

	@Override
	public Category save(CategoryVo vo) {
		Category category = new Category();
		BeanUtils.copyProperties(vo, category);
		return categoryDao.save(category);
	}

	@Override
	public List<Category> getSubCategoryById(Long id) {
		return categoryDao.findAllByParent(id);
	}

	@Override
	public int deleteById(Long id) {
		if (null == id) {
			log.warn("参数不能为空");
			throw new HandgoException("参数不能为空");
		}
		return categoryDao.deleteById(id);
	}

	@Override
	public List<Category> getCategoryParent() {
		return categoryDao.findAllByRootTag(ProductRootEnum.ISROOT.getTag());
	}

	@Override
	public Category getCategoryById(Long id) {
		return categoryDao.findOne(id);
	}
}

