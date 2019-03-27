package com.stackfing.admin.controller;

import com.stackfing.admin.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:51 19-3-27
 */
@RestController
public abstract class BaseController<T, R> {

	@Autowired
	private BaseService<T, R> baseService;

	@GetMapping("")
	public List<T> findAll() {
		return baseService.findAll();
	}

	@GetMapping("/{id}")
	public T findOneById(@PathVariable R id) {
		return baseService.findOneById(id);
	}

	@DeleteMapping("/{id}")
	public Object deleteById(@PathVariable R id) {
		baseService.delete(id);
		return "success";
	}

	@PutMapping("/{id}")
	public Object updateById(@PathVariable R id, @RequestBody T t) {
		baseService.update(t);
		return "success";
	}

	@PostMapping("")
	public T post(@RequestBody T t) {
		return baseService.save(t);
	}

}
