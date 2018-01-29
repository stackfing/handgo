package com.stackfing.common.service.serviceImpl;

import com.stackfing.common.dao.AddressDao;
import com.stackfing.common.service.AddressService;
import com.stackfing.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:20 18-1-29
 */
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDao addressDao;

	@Override
	public Address findById(Integer id) {
		return addressDao.findOne(id);
	}

	@Override
	public Address findPrimaryByCustomerId(Long id) {
		return null;
	}

	@Override
	public List<Address> findAll(Long id) {
		return addressDao.findByCustomerId(id);
	}
}
