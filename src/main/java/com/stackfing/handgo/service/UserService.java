package com.stackfing.handgo.service;

import com.stackfing.handgo.entity.User;

import java.util.List;

public interface UserService {
    //查询没有设置头像用户
    List<User> findUserByHeadPhotoNull();
    //用户登录
    List<User> findUserByStatusIs(int status);
}
