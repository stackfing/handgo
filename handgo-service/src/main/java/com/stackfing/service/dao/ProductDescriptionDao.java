package com.stackfing.service.dao;

import com.stackfing.pojo.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:54 18-1-21
 */
public interface ProductDescriptionDao extends JpaRepository<Description, Long> {

	Description findByProductId(Long id);

	@Transactional
	@Modifying
	@Query("DELETE FROM Description WHERE productId = :id")
	int deleteByProductId(@Param("id") Long id);

}
