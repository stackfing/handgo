package com.stackfing.admin.controller;

import com.stackfing.admin.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:16 19-6-7
 */

public abstract class BaseController<T, R> {

	@Autowired
	private BaseService<T, R> baseService;

	@GetMapping("")
	public Object get() {
		return baseService.list();
	}
}
