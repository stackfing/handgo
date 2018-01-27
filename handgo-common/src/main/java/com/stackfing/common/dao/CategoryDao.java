package com.stackfing.common.dao;

import com.stackfing.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午3:39 18-1-19
 */
public interface CategoryDao extends JpaRepository<Category, Long> {

	List<Category> findAllByRootTag(Integer tag);

	List<Category> findAllByParentIsNull(PageRequest pageRequest);

	List<Category> findAllByParent(Long id);

	@Transactional
	@Modifying
	@Query("DELETE FROM Category WHERE id = :id")
	int deleteById(@Param("id") Long id);
}
