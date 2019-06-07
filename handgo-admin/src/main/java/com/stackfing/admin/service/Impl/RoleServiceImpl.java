package com.stackfing.admin.service.Impl;

import com.stackfing.admin.entity.Role;
import com.stackfing.admin.repository.RoleRepository;
import com.stackfing.admin.service.RoleService;
import com.stackfing.admin.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:25 19-6-7
 */

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Integer> implements RoleService {
	@Autowired
	private RoleRepository repository;
}
