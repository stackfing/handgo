package com.stackfing.admin.repository;

import com.stackfing.admin.entity.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午7:53 19-3-27
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findBySellerId(Long id);

	List<Product> findBySellerIdIn(List<Long> ids);

	List<Product> isDeleted(Boolean isDelete, Pageable pageable);

}
