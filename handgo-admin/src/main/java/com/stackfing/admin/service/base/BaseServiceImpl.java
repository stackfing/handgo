package com.stackfing.admin.service.base;

import com.stackfing.admin.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:16 19-6-7
 */

public abstract class BaseServiceImpl<T, R> implements BaseService<T, R> {
	@Autowired
	private JpaRepository<T, R> repository;

	@Override
	public void deleteById(R id) {
		repository.deleteById(id);
	}

	@Override
	public List<T> list() {
		return repository.findAll();
	}

	@Override
	public List<T> list(int size, int page) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	@Override
	public void save(T model) {
		repository.save(model);
	}
}
