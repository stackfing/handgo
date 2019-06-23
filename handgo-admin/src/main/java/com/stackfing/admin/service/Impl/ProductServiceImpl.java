package com.stackfing.admin.service.Impl;

import com.stackfing.admin.entity.Product;
import com.stackfing.admin.repository.ProductRepository;
import com.stackfing.admin.repository.UserRepository;
import com.stackfing.admin.service.ProductService;
import com.stackfing.admin.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:45 19-6-7
 */
@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, Long> implements ProductService {


	/**
	 * 数组中第一个索引
	 */
	private static final int FIRST_ID = 0;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserRepository userRepository;

	/**
	 * 批量查询商家的产品
	 * @param ids 商家 ID
	 * @return
	 */
	@Override
	public List<Product> selectAllProductByBatchSellerId(List<Long> ids) {

		List<Product> result = new ArrayList<>();

		if (ids.size() == 0) {
			//没有传 ID 过来
			return result;
		}

		//确认商家 ID 是否正确
		for (Long id : ids) {
			checkEntityIsPresent(id);
			result = productRepository.findBySellerIdIn(ids);
		}

		return result;
	}

	@Override
	public void delete(Long id) {
		checkEntityIsPresent(id);
	}


	@Override
	public void deleteById(Long id) {
		Product product = productRepository.getOne(id);
		product.setIsDeleted(false);
		productRepository.save(product);
	}

	//	@Override
	public void deleteById0(Long id) {
		Optional<Product> byId = productRepository.findById(id);
		checkEntityIsPresent(id);
		Product product = productRepository.findById(id).get();
//		product.setIsDeleted(true);
		save(product);
	}

	@Override
	public List<Product> selectAllByDeleteTag(boolean tag ,int page, int size) {
		return productRepository.isDeleted(tag, PageRequest.of(page - 1 ,size));
	}

}
