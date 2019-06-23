package com.stackfing.admin.service.base;

import com.stackfing.admin.Exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

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
		checkEntityIsPresent(id);

	}

//	public abstract void deleteById0(R id);

	@Override
	public Boolean checkEntityIsPresent(R id) {
		Boolean bl = false;
		Optional<T> entity = repository.findById(id);
		if (!entity.isPresent()) {

			throw new UserNotFoundException("用户不存在");
		}
		bl = true;
		return bl;
	}

//	private void checkUserIsPresent(R id) {
//		Optional<T> entity = repository.findById(id);
//		if (!entity.isPresent()) {
//			throw new UserNotFoundException("用户不存在");
//		}
//	}

	@Override
	public List<T> list() {
		return repository.findAll();
	}

	@Override
	public List<T> list(int size, int page) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	@Override
	public Optional<T> findOneById(R id) {
		checkEntityIsPresent(id);
		return repository.findById(id);
	}

	@Override
	public T save(T model) {
		return repository.save(model);
	}
}
