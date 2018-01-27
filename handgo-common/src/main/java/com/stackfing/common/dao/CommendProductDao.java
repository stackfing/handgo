package com.stackfing.common.dao;

import com.stackfing.pojo.CommendProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:31 18-1-27
 */
public interface CommendProductDao extends JpaRepository<CommendProduct, Long> {

	List<CommendProduct> findAllByCategoryId(Long id);

}
