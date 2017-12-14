package com.stackfing.handgo.repository;


import com.stackfing.handgo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //通过用户名查询用户
    User findByAccountEquals(String account);

}
