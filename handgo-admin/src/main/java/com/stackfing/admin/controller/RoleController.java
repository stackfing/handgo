package com.stackfing.admin.controller;

import com.stackfing.admin.entity.Role;
import com.stackfing.admin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:26 19-6-7
 */

@RestController
@RequestMapping("role")
public class RoleController extends BaseController<Role, Integer> {
}
