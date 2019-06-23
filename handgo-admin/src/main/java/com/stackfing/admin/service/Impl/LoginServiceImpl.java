package com.stackfing.admin.service.Impl;

import com.stackfing.admin.Exception.UserNotFoundException;
import com.stackfing.admin.entity.User;
import com.stackfing.admin.enums.ResultCode;
import com.stackfing.admin.repository.UserRepository;
import com.stackfing.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: fing
 * @Description:	用户服务具体实现
 * @Date: 下午1:21 19-6-23
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public int login(User user) {
		User temp = userRepository.getOne(user.getId());
		if (null == temp) {
			throw new UserNotFoundException("用户不存在");
		}
		//鉴定密码是否相等
		if (checkPassword("", "")) {
			return ResultCode.LOGIN_SUCCESS.getCode();
		}
		return ResultCode.PASSWORD_NOT_EQUALS.getCode();
	}

	/**
	 * 判断密码是否相等
	 * @param pass	用户输入密码
	 * @param actPass	真实密码
	 * @return
	 */
	private boolean checkPassword(String pass, String actPass) {
		return pass.equals(actPass);
	}

	@Override
	public int logout(User user) {
		return 0;
	}
}
