package com.stackfing.service.serviceImpl;

import com.stackfing.service.dao.CustomerDao;
import com.stackfing.common.exception.HandgoException;
import com.stackfing.service.CustomerService;
import com.stackfing.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午10:33 18-1-28
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer updateInformation(Long id, Customer customer) {
		Customer one = customerDao.findOne(id);
		if (null == one) {
			throw new HandgoException("ID 为空");
		}
		return customerDao.save(customer);
	}

	@Override
	public Customer findById(Long id) {
		Customer one = customerDao.findOne(id);
		if (one == null) {
			throw new HandgoException("找不到此用户");
		}
		return one;
	}

	@Override
	public Customer findByAccount(String account) {
		Customer one = customerDao.findByAccount(account);
		if (null == one) {
			throw new HandgoException("找不到这个用户");
		}
		return one;
	}
}
