package com.stackfing.service.dao;

import com.stackfing.pojo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午10:33 18-1-28
 */
public interface CustomerDao extends JpaRepository<Customer, Long> {

	Customer findByAccount(String account);

}
