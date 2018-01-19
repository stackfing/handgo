package com.stackfing.admin.dao;

import com.stackfing.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:14 18-1-18
 */

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

	@Transactional
	@Modifying
	@Query("DELETE FROM Product WHERE id = :id")
	int deleteById(@Param("id") Long id);

}
