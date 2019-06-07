package com.stackfing.admin.controller;

import com.stackfing.admin.service.base.BaseService;
import com.stackfing.admin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:16 19-6-7
 */

public abstract class BaseController<T, R> {

	@Autowired
	private BaseService<T, R> baseService;

	@GetMapping("")
	public Result get() {
		return Result.ok(baseService.list());
	}

	@GetMapping("/{id}")
	public Result findOneById(R id) {
		return Result.ok(baseService.findOneById(id));
	}

	@PostMapping("")
	public Result post(@RequestBody T model) {
		return Result.ok(baseService.save(model));
	}

	@PutMapping("/{id}")
	public Result put(@RequestBody T model, @PathVariable R id) {
		return Result.ok(baseService.save(model));
	}
}
