package com.stackfing.admin.service.Impl;

import com.stackfing.admin.entity.Store;
import com.stackfing.admin.repository.StoreRepository;
import com.stackfing.admin.service.StoreService;
import com.stackfing.admin.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:24 19-6-7
 */
@Service
public class StoreServiceImpl extends BaseServiceImpl<Store, Long> implements StoreService {
	@Autowired
	private StoreRepository repository;

	@Override
	public void deleteById(Long id) {

	}

	@Override
	public List<Store> selectAllByDeleteTag(boolean tag, int page, int size) {
		return null;
	}
}
