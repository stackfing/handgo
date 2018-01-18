package com.stackfing.rest.service;

import com.stackfing.common.utils.HandgoResult;
import com.stackfing.common.utils.ObjectUtil;
import com.stackfing.pojo.Product;
import com.stackfing.rest.dao.ProductDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午9:02 18-1-18
 */

@Slf4j
@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public HandgoResult getProductList(Integer page, Integer limit) {
		List list = productDao.findAll(new PageRequest(page - 1, limit)).getContent();
		return HandgoResult.success("查询成功", list, productDao.count());
	}

	public HandgoResult getProductById(Long id) {
		Product one = productDao.findOne(id);
		if (ObjectUtil.validate(one)) {
			return HandgoResult.success(one);
		} else {
			log.error("找不到ID");
			return HandgoResult.error("找不到响应的 ID");
		}
	}

	public HandgoResult updateProductById(Long id, Product product) {
		Product save = productDao.save(product);
		if (id != product.getId()) {
			log.info("更新失败，ID 不一致");
			return HandgoResult.error("更新失败");
		}
		if (save.equals(product)) {
			log.info("更新成功");
			return HandgoResult.success("更新成功");
		}
		log.info("更新失败");
		return HandgoResult.error("更新失败");
	}


	@Transactional
	public HandgoResult addProduct(Product product) {
		Product one = productDao.findOne(product.getId());
		if ( !ObjectUtil.validate(one) ) {
			if ( null !=  productDao.save(product)) {
				return HandgoResult.success("添加成功");
			}
		}
		return HandgoResult.error("添加失败，产品已存在！");
	}
}
