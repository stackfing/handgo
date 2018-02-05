package com.stackfing.service.dao;

import com.stackfing.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:24 18-1-31
 */
public interface OrderDetailDao extends JpaRepository<OrderDetail, Long>{
}
