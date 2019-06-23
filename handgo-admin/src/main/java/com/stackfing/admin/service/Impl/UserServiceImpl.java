package com.stackfing.admin.service.Impl;

import com.stackfing.admin.entity.User;
import com.stackfing.admin.repository.UserRepository;
import com.stackfing.admin.service.UserService;
import com.stackfing.admin.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:27 19-6-7
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public void deleteById(Long id) {

	}

	@Override
	public List<User> selectAllByDeleteTag(boolean tag, int page, int size) {
		return null;
	}
}

