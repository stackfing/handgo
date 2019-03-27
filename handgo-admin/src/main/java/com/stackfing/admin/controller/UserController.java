package com.stackfing.admin.controller;

import com.stackfing.admin.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:51 19-3-27
 */

@RestController
@RequestMapping("user")
public class UserController extends BaseController<User, Integer> {

}
