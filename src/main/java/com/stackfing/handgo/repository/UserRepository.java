package com.stackfing.handgo.repository;


import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.entity.UserDetail;
import com.stackfing.handgo.entity.UserLocate;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //通过用户名查询用户
    User findByAccountEquals(String account);

}
