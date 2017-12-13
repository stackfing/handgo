package com.stackfing.handgo.repository;

import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {

    //查询用户个人信息
    List<UserDetail> findByUser_Uid(Long uid);

}
