package com.stackfing.service.dao;

import com.stackfing.pojo.ProductPhotos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午7:42 18-1-27
 */
public interface ProductPhotosDao extends JpaRepository<ProductPhotos, Long> {

	//TODO 小图中图大图
	List<ProductPhotos> findByProductId(Long id);

}
