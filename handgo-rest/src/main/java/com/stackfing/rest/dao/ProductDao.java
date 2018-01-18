package com.stackfing.rest.dao;

import com.stackfing.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:14 18-1-18
 */

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
}
