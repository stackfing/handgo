package com.stackfing.handgo.repository;

import com.stackfing.handgo.entity.UserLocate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLocateRepository extends JpaRepository<UserLocate, Integer> {

    //查询用户所有收货地址
    List<UserLocate> findByUser_Uid(Long uid);

    //查询用户默认收货地址
    UserLocate findByIsPrimaryIs(Integer is);

}
