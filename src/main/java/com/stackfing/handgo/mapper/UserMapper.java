package com.stackfing.handgo.mapper;


import com.stackfing.handgo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    //通过用户名查询用户
    User selectUserByAccount(String account);

    List<User> findAll();

    User selectUserById(Long uid);

	int insertUser(User user);

	int deleteUserById(Long uid);

	List<User> findAllUserByPage(Long page);

}
