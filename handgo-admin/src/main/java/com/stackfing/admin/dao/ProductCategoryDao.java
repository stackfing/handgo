package com.stackfing.admin.dao;

import com.stackfing.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:15 18-1-18
 */
@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {
}
