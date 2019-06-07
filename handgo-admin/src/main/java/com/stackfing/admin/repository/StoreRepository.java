package com.stackfing.admin.repository;

import com.stackfing.admin.entity.Store;
import com.stackfing.admin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:47 19-3-27
 */
public interface StoreRepository extends JpaRepository<Store, Long> {
}
