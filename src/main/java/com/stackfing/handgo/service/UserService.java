package com.stackfing.handgo.service;

import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.entity.UserLocate;

import java.util.List;

public interface UserService {

    //用户登录
    List<User> findUserByStatusIs(int status);

    UserLocate findParmiry(Long uid);

}
