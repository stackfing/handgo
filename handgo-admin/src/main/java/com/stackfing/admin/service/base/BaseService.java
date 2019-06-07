package com.stackfing.admin.service.base;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:16 19-6-7
 */
public interface BaseService<T, R> {

	void deleteById(R id);

	List<T> list();

	List<T> list(int size, int page);

	void save(T model);

}
