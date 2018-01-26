package com.stackfing.common.service.serviceImpl;

import com.stackfing.common.dao.KillProductDao;
import com.stackfing.common.service.KillProductService;
import com.stackfing.pojo.KillProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:30 18-1-26
 */
@Service
public class KillProductServiceImpl implements KillProductService {

	@Autowired
	private KillProductDao killProductDao;

	@Override
	public List<KillProduct> productList() {
		List list = killProductDao.findAll();
		if (list.size() >= 4) {
			list = list.subList(list.size() - 4, list.size());
		}
		return list;
	}
}
