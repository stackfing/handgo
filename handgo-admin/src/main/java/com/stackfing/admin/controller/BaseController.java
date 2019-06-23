package com.stackfing.admin.controller;

import com.stackfing.admin.service.base.BaseService;
import com.stackfing.admin.utils.Result;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:16 19-6-7
 */

public abstract class BaseController<T, R> {

	private static final String DEFAULT_SIZE = "10";
	private static final String DEFAULT_PAGE = "1";


	@Autowired
	private BaseService<T, R> baseService;

	@GetMapping("")
	public Result get(@RequestParam(value = "page", defaultValue = DEFAULT_PAGE) int page
			, @RequestParam(value = "size", defaultValue = DEFAULT_SIZE) int size, @RequestParam(value = "desc", defaultValue = "false") Boolean desc) {
		return Result.ok(baseService.list(size, page));
	}

	@GetMapping("/{id}")
	public Result findOneById(@PathVariable(name = "id") R id) {
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

	@GetMapping("/deleteById/{id}")
	public Result deleteById(@PathVariable R id) {
		baseService.delete(id);
		return Result.ok();
	}
}
