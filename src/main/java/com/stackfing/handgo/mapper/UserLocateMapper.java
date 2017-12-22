package com.stackfing.handgo.mapper;

import com.stackfing.handgo.entity.UserLocate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLocateMapper {

    //查询用户所有收货地址
    List<UserLocate> findByUser_Uid(Long uid);

    //查询用户默认收货地址
    UserLocate findByIsPrimaryIs(Integer is);

}
