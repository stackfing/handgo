package com.stackfing.admin.controller;

import com.stackfing.admin.Exception.HandgoException;
import com.stackfing.admin.entity.User;
import com.stackfing.admin.enums.ResultCode;
import com.stackfing.admin.utils.Result;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:25 19-6-7
 */

@RestController
@RequestMapping("user")
public class UserController extends BaseController<User, Long> {

	@Override
	@PutMapping("/{id}")
	public Result put(@RequestBody User user, @PathVariable Long id) {

		if (user.getId() == id) {
			return super.put(user, id);
		}

		return Result.error(ResultCode.ID_NOT_EQUALS);
	}


}
