package com.stackfing.admin.service.impl;

import com.stackfing.admin.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午7:00 19-3-27
 */
@Service
public abstract class BaseServiceImpl<T, R extends Serializable> implements BaseService<T, R> {

	@Autowired
	private JpaRepository<T, R> repository;

	@Override
	public T findOneById(R id) {
		return repository.findOne(id);
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(R id) {

	}

	@Override
	public void update(T model) {

	}

	@Override
	public T save(T model) {
		return null;
	}

	@Override
	public Page<T> findAllByPage(int page, int size) {
		return repository.findAll(new PageRequest(page, size));
	}

}
