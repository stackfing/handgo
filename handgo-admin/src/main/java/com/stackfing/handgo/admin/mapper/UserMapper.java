package com.stackfing.handgo.admin.mapper;


import com.stackfing.handgo.admin.entity.User;
import org.apache.ibatis.annotations.Param;
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

	List<User> selectAllUserByPage(@Param("offSize") Long offSize, @Param("length") Long length);

	List<User> selectAllDeletedUserByPage(@Param("offSize") Long offSize, @Param("length") Long length);
}
