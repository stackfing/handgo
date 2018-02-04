package com.stackfing.common.dao;


import com.stackfing.pojo.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:23 18-1-31
 */
public interface OrderMasterDao extends JpaRepository<OrderMaster, Long> {
}
