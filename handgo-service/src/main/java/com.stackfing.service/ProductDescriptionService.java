package com.stackfing.service;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:48 18-1-21
 */
public interface ProductDescriptionService {

	int create(Long id, String descritpion);

	int update(Long id, String description);

	String getDescriptionById(Long id);

	int deleteByProductId(Long id);

}
