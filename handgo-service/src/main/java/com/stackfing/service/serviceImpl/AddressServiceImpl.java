package com.stackfing.service.serviceImpl;

import com.stackfing.common.enums.AddressEnum;
import com.stackfing.service.dao.AddressDao;
import com.stackfing.service.AddressService;
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
		return addressDao.findByCustomerIdAndIsPrimary(id, AddressEnum.IS_PRIMARY.getCode());
	}

	@Override
	public List<Address> findAll(Long id) {
		return addressDao.findByCustomerId(id);
	}

}
