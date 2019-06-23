package com.stackfing.admin.controller;

import com.stackfing.admin.entity.User;
import com.stackfing.admin.enums.ResultCode;
import com.stackfing.admin.service.LoginService;
import com.stackfing.admin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fing
 * @Description:	用户登录接口
 * @Date: 下午1:16 19-6-23
 */

@RestController
@RequestMapping("/user/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("")
	public Result userLogin(@RequestBody User user) {
		String token = "123";
		if (loginService.login(user) == ResultCode.LOGIN_SUCCESS.getCode()) {
			return Result.ok("登录成功",token);
		}
		return Result.error(ResultCode.LOGIN_FAILD);
	}

}
