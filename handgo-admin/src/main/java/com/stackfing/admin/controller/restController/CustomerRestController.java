package com.stackfing.admin.controller.restController;

import com.stackfing.common.utils.Result;
import com.stackfing.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:19 18-3-16
 */

@RestController
@RequestMapping("/v1/customer")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("")
	public Result findAll() {
		return Result.success(customerService.findAll());
	}
}
