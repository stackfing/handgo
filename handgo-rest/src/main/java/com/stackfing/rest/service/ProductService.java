//package com.stackfing.rest.service;
//
//import com.stackfing.pojo.ProductCategory;
//import com.stackfing.rest.dao.ProductCategoryDao;
//import com.stackfing.common.utils.HandgoResult;
//import com.stackfing.common.utils.ObjectUtil;
//import com.stackfing.pojo.Product;
//import com.stackfing.rest.dao.ProductDao;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Date;
//import java.util.List;
//
///**
// * @Author: fing
// * @Description:
// * @Date: 下午9:02 18-1-18
// */
//
//@Slf4j
//@Service
//public class ProductService {
//
//	@Autowired
//	private ProductDao productDao;
//
//	@Autowired
//	private ProductCategoryDao productCategoryDao;
//
//	public HandgoResult getProductList(Integer page, Integer limit) {
//		List list = productDao.findAll(new PageRequest(page - 1, limit)).getContent();
//		return HandgoResult.success("查询成功", list, productDao.count());
//	}
//
//	public HandgoResult getProductById(Long id) {
//		Product one = productDao.findOne(id);
//		if (ObjectUtil.validate(one)) {
//			return HandgoResult.success(one);
//		} else {
//			log.error("找不到ID");
//			return HandgoResult.error("找不到响应的 ID");
//		}
//	}
//
//	@Transactional
//	public HandgoResult updateProductById(Long id, Product product) {
//		if (id != product.getId()) {
//			log.info("更新产品失败，ID 不一致");
//			return HandgoResult.error("更新产品失败，ID 不一致");
//		}
//		product.setUpdateTime(new Date());
//		Product save = productDao.save(product);
//		if (save.equals(product)) {
//			log.info("更新成功");
//			return HandgoResult.success("更新成功");
//		}
//		log.info("更新失败");
//		return HandgoResult.error("更新失败");
//	}
//
//	@Transactional
//	public HandgoResult addProduct(Product product) {
//		if (validateCategory(product)) {
//			product.setCreateTime(new Date());
//			Product save = productDao.save(product);
//			if (ObjectUtil.validate(save)) {
//				return HandgoResult.success("添加成功");
//			}
//			return HandgoResult.error("添加失败，产品已存在！");
//		}
//		return HandgoResult.error("添加失败，产品分类不存在！");
//	}
//
//	public HandgoResult deleteById(Long id) {
//		if (1 == productDao.deleteById(id)) {
//			return HandgoResult.success("删除成功");
//		} else {
//			return HandgoResult.error("删除失败！");
//		}
//	}
//
//
//	private boolean validateCategory(Product product) {
//		ProductCategory category = productCategoryDao.findOne(product.getProductCategoryId());
//		if (!ObjectUtil.validate(category)) {
//			log.info("【 添加产品 】 产品分类不存在");
//			return false;
//		}
//		return true;
//	}
//}
