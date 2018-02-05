package com.stackfing.service.serviceImpl;

import com.stackfing.service.dao.CommendCategoryDao;
import com.stackfing.service.dao.CommendProductDao;
import com.stackfing.service.CategoryService;
import com.stackfing.service.FrontCommendService;
import com.stackfing.pojo.Category;
import com.stackfing.pojo.CommendCategory;
import com.stackfing.pojo.CommendProduct;
import com.stackfing.pojo.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:12 18-1-27
 */

@Service
public class FrontCommendServiceImpl implements FrontCommendService {

	@Autowired
	private CommendProductDao commendProductDao;

	@Autowired
	private CommendCategoryDao commendCategoryDao;

	@Autowired
	private ProductServiceImpl productService;

	@Autowired
	private CategoryService categoryService;

	@Override
	public List<Category> getFrontCategory() {
		List<CommendCategory> all = commendCategoryDao.findAllByRootTag(true);
		List list = new ArrayList();
		for (CommendCategory commendCategory: all) {
			Category category = new Category();
			BeanUtils.copyProperties(commendCategory, category);
			list.add(category);
		}
		return list;
	}

	@Override
	public List<Category> subCommendCategory(Long id) {
		List list = new ArrayList();
		List<CommendCategory> all = commendCategoryDao.findAllByCategoryId(id);
		for (CommendCategory commendCategory : all) {
			Category category = categoryService.findById(commendCategory.getId());
			BeanUtils.copyProperties(commendCategory, category);
			list.add(category);
		}
		return list;
	}

	@Override
	public List<Product> starProduct(Long id) {
		List<CommendProduct> list = commendProductDao.findAllByCategoryId(id);
		List result = new ArrayList();
		for (CommendProduct product : list) {
			Product p = productService.getProductById(product.getId());
			BeanUtils.copyProperties(product, p);
			result.add(p);
		}
		return result;
	}
}
