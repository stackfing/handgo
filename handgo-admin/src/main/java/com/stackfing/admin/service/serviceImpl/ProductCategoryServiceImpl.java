package com.stackfing.admin.service.serviceImpl;

import com.stackfing.admin.dao.ProductCategoryDao;
import com.stackfing.admin.service.ProductCategoryService;
import com.stackfing.common.utils.HandgoResult;
import com.stackfing.common.utils.ObjectUtil;
import com.stackfing.pojo.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午3:38 18-1-19
 */

@Slf4j
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {


	@Autowired
	private ProductCategoryDao productCategoryDao;

	@Override
	@Transactional
	public HandgoResult addCategory(ProductCategory productCategory) {
		if (!ObjectUtil.validate(productCategory.getId())) {
			ProductCategory save = productCategoryDao.save(productCategory);
			save.setCreateTime(new Date());
			if (ObjectUtil.validate(save)) {
				log.info("【 分类 】 添加成功");
				return HandgoResult.success("添加成功!");
			}
			log.info("【 分类 】 添加失败");
			return HandgoResult.error("添加失败");
		}
		log.info("【 分类 】 分类  ID 已经存在");
		return HandgoResult.error("分类 ID 已存在");
	}

	@Override
	public HandgoResult getCategory(Integer page, Integer limit) {
		List list = productCategoryDao.findAllByParentIsNull(new PageRequest(page - 1, limit));
		return HandgoResult.success("查询成功", list, productCategoryDao.count());
	}

	@Override
	@Transactional
	public HandgoResult updateCategory(Long id, ProductCategory productCategory) {
		if (id == productCategory.getId()) {
			productCategory.setUpdateTime(new Date());
			ProductCategory save = productCategoryDao.save(productCategory);
			if (ObjectUtil.validate(save)) {
				return HandgoResult.success("更新成功");
			}
			return HandgoResult.error("更新失败");
		}
		return HandgoResult.error("分类 ID 不存在");
	}

	@Override
	public HandgoResult getCategory() {
		return HandgoResult.success(productCategoryDao.findAllByParentIsNull());
	}

	@Override
	public HandgoResult getSubCategoryById(Long id) {
		return HandgoResult.success(productCategoryDao.findAllByParent(id));
	}
}

