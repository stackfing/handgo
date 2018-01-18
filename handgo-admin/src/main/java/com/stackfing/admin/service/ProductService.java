package com.stackfing.admin.service;

import com.stackfing.common.utils.HandgoResult;

public interface ProductService {

	HandgoResult findById(Long id);

	HandgoResult findProductListByPage(Integer page, Integer limit);

}
