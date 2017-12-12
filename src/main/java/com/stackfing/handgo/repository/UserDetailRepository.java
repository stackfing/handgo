package com.stackfing.handgo.repository;

import com.stackfing.handgo.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {

    List<UserDetail> findUserDetailsByUserDetailIdIs(Long uid);

}
