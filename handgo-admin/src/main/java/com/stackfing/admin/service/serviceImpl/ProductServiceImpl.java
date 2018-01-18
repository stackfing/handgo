//package com.stackfing.admin.service.serviceImpl;
//
//import com.stackfing.rest.dao.ProductDao;
//import com.stackfing.admin.service.ProductService;
//import com.stackfing.common.utils.HandgoResult;
//import com.stackfing.common.utils.ObjectUtil;
//import com.stackfing.pojo.Product;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Slf4j
//@Service
//public class ProductServiceImpl implements ProductService {
//
//	@Autowired
//	private ProductDao productDao;
//
//	@Override
//	public HandgoResult findProductListByPage(Integer page, Integer limit) {
//		List<Product> content = productDao.findAll(new PageRequest(page - 1, limit, null)).getContent();
//		if (ObjectUtil.validate(content)) {
//			return HandgoResult.success(content);
//		} else {
//			log.info("产品列表为空");
//			return HandgoResult.success(content);
//		}
//	}
//
//	@Override
//	public HandgoResult findById(Long id) {
//		Product product = productDao.findOne(id);
//		if (ObjectUtil.validate(product)) {
//			return HandgoResult.success(product);
//		} else {
//			log.info("找不到产品");
//			return HandgoResult.error("找不到产品");
//		}
//	}
//}
