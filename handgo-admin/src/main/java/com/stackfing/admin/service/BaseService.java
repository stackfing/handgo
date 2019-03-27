package com.stackfing.admin.service;

import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:59 19-3-27
 */

public interface BaseService<T, R> {

	T findOneById(R id);

	List<T> findAll();

	Page<T> findAllByPage(int page, int size);

	void delete(R id);

	void update(T model);

	T save(T model);
}
