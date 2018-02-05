package com.stackfing.service.serviceImpl;

import com.stackfing.service.dao.ProductDescriptionDao;
import com.stackfing.common.exception.HandgoException;
import com.stackfing.service.ProductDescriptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:53 18-1-21
 */
@Service
@Slf4j
public class DescriptionServiceImpl implements ProductDescriptionService {

	@Autowired
	ProductDescriptionDao productDescriptionDao;

	@Override
	public int create(Long id, String descritpion) {
		return 0;
	}

	@Override
	public int update(Long id, String description) {
		return 0;
	}

	@Override
	public String getDescriptionById(Long id) {
		if (null == productDescriptionDao.findOne(id)) {
			log.error("产品 ID 不存在");
			throw new HandgoException(" ID 不存在");
		}
		return productDescriptionDao.findOne(id).getDescription();
	}

	@Override
	public int deleteByProductId(Long id) {
		if (null == productDescriptionDao.findByProductId(id)) {
			log.error("产品id不存在");
			throw new HandgoException("产品 ID 不存在");
		}
		return productDescriptionDao.deleteByProductId(id);
	}
}
