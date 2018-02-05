package com.stackfing.service.serviceImpl;

import com.stackfing.common.exception.HandgoException;
import com.stackfing.pojo.Product;
import com.stackfing.service.ProductService;
import com.stackfing.service.dao.CategoryDao;
import com.stackfing.service.dao.ProductDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Product> getProductList(Integer page, Integer limit) {
		if (page == null || limit == null) {
			log.error("参数不完整，page = " + page + "，limit = " + limit);
			throw new HandgoException("参数不完整");
		}
		List list = productDao.findAll(new PageRequest(page - 1, limit)).getContent();
		return list;
	}

	@Override
	public List<Product> getProductList() {
		return productDao.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return productDao.findOne(id);
	}

	@Override
	public Product updateProductById(Long id, Product vo) {
		//合法性检查
		if (id == null) {
			throw new HandgoException("产品 ID 为空");
		}
		//查出相应的产品
		Product productById = getProductById(id);
		if (productById == null) {
			throw new HandgoException("找不到相应的产品");
		}
		if (productById.getId() != vo.getId()) {
			throw new HandgoException("ID 不一致");
		}
		productById.setUpdateTime(new Date());
		return productDao.save(productById);
	}

	@Override
	public Product createProduct(Product product) {
		return null;
	}

	@Override
	public int deleteById(Long id) {
		return productDao.deleteById(id);
	}

	private void setCreateAndUpdateTime(Product product) {
		product.setCreateTime(new Date());
		product.setUpdateTime(new Date());
	}

	@Override
	public List<Product> getHotProduct() {
		return null;
	}

	@Override
	public List<Product> getProductByCategoryId(Integer id) {
		return null;
	}
}