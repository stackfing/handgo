package com.stackfing.service;

import com.stackfing.pojo.Address;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:19 18-1-29
 */
public interface AddressService {

	Address findById(Integer addressId);

	Address findPrimaryByCustomerId(Long id);

	List<Address> findAll(Long customerId);

}
