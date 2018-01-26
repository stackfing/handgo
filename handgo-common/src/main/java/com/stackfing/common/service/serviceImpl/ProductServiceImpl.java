package com.stackfing.common.service.serviceImpl;

import com.stackfing.common.dao.CategoryDao;
import com.stackfing.common.dao.ProductDao;
import com.stackfing.common.exception.HandgoException;
import com.stackfing.common.service.ProductService;
import com.stackfing.common.vo.ProductVo;
import com.stackfing.pojo.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

//	@Autowired
//	private ProductDescriptionService productDescriptionService;

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
	public Product updateProductById(Long id, ProductVo vo) {
		//合法性检查
		if (id == null) {
			throw new HandgoException("产品 ID 为空");
		}
		//查出相应的产品
		Product productById = getProductById(id);
		if (productById == null) {
			throw new HandgoException("找不到相应的产品");
		}
		//将新的属性复制
		BeanUtils.copyProperties(vo, productById);
		productById.setUpdateTime(new Date());
		return productDao.save(productById);
	}

	@Override
	public Product createProduct(Product product) {
		return null;
	}

	@Override
	@Transactional
	public Product createProduct(ProductVo vo) {
		Product product = new Product();
		BeanUtils.copyProperties(vo, product);
		setCreateAndUpdateTime(product);
		//TODO 添加产品描述事务
		return productDao.save(product);
	}

	@Override
	@Transactional
	public Product createProduct(ProductVo vo, String description) {
		//TODO 有添加问题
		Product product = new Product();
		BeanUtils.copyProperties(vo, product);
		setCreateAndUpdateTime(product);
		//TODO 添加产品面搜狐事务
		return productDao.save(product);
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