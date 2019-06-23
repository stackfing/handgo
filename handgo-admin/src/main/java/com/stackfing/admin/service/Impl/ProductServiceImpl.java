package com.stackfing.admin.service.Impl;

import com.stackfing.admin.entity.Product;
import com.stackfing.admin.repository.ProductRepository;
import com.stackfing.admin.repository.UserRepository;
import com.stackfing.admin.service.ProductService;
import com.stackfing.admin.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
	public List<Product> selectAllProductByBatchSellerId(Long... ids) {

		List<Product> result = new ArrayList<>();

		if (ids.length == 0) {
			//没有传 ID 过来
			return result;
		}

		//确认商家 ID 是否正确
		checkUserIsPresent(ids);

		return result;
	}

	/**
	 * 确认商家 ID 是否已存在数据库
	 * @param ids
	 */
	private void checkUserIsPresent(Long... ids) {
		for (Long id : ids) {
			checkUserIsPresent(id);
		}
//		for (Long id : ids) {
//			Optional<User> user = userRepository.findById(id);
//			//商家存在
//			if (user.isPresent()) {
//				//判断是否为商家
//				continue;
//			}
//			throw new UserNotFoundException("商家 ID: " + id + " 找不到");
//		}
	}

//	@Override
	public void deleteById0(Long id) {
		Optional<Product> byId = productRepository.findById(id);
		checkUserIsPresent(id);
		Product product = productRepository.findById(id).get();
//		product.setIsDeleted(true);
		save(product);
	}
}
