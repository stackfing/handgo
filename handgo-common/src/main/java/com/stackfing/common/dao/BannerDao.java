package com.stackfing.common.dao;

import com.stackfing.pojo.Banner;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:14 18-2-4
 */
public interface BannerDao extends JpaRepository<Banner, Integer> {

	@Transactional
	@Modifying
	@Query("DELETE FROM Banner WHERE id = :id")
	int deleteById(@Param("id")  int id);

}
