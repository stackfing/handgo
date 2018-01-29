package com.stackfing.common.dao;

import com.stackfing.pojo.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:17 18-1-29
 */
public interface AddressDao extends JpaRepository<Address, Integer> {

	List<Address> findByCustomerId(Long id);

}
