package com.stackfing.admin.repository;

import com.stackfing.admin.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午7:53 19-3-27
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
