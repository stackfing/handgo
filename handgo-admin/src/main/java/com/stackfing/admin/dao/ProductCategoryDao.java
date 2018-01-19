package com.stackfing.admin.dao;

import com.stackfing.pojo.ProductCategory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午3:39 18-1-19
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Long> {

	List<ProductCategory> findAllByRootTag(Integer tag);

	List<ProductCategory> findAllByParentIsNull(PageRequest pageRequest);

	List<ProductCategory> findAllByParentEquals(Long id);

}
