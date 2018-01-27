package com.stackfing.common.service.serviceImpl;

import com.stackfing.common.dao.ProductPhotosDao;
import com.stackfing.common.service.ProductPhotosService;
import com.stackfing.pojo.ProductPhotos;
import org.omg.PortableInterceptor.ServerRequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午8:09 18-1-27
 */
@Service
public class ProductPhotoServiceImpl implements ProductPhotosService {

	@Autowired
	private ProductPhotosDao productPhotosDao;

	@Override
	public List<String> getProductPhotos(Long id) {
		List<String> list = new ArrayList<>();
		for (ProductPhotos productPhotos : productPhotosDao.findByProductId(id)) {
			list.add(productPhotos.getUrl());
		}
		return list;
	}
}
