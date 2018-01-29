package com.stackfing.common.service;

import com.stackfing.pojo.Address;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:19 18-1-29
 */
public interface AddressService {

	Address findById(Integer id);

	Address findPrimaryByCustomerId(Long id);

	List<Address> findAll(Long id);

}
