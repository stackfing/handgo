package com.stackfing.admin.controller.restController;

import com.stackfing.common.service.CategoryService;
import com.stackfing.common.utils.Result;
import com.stackfing.common.vo.LayuiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:37 18-1-26
 */
@RestController
@RequestMapping("/v1/category")
public class CategoryRestController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("")
	public LayuiVo getCategoryList(@RequestParam(required = false) Integer page
		, @RequestParam(required = false)  Integer limit) {
		if (null == page || limit == null) {
			return (LayuiVo) LayuiVo.success(categoryService.getCategoryList());
		}
		return LayuiVo.success(categoryService.getCategoryList(page, limit), 100);
	}

	@GetMapping("/{id}")
	public Result getCategoryById(@PathVariable Integer id) {
		return Result.success(categoryService.getSubCategoryById(id));
	}

}
