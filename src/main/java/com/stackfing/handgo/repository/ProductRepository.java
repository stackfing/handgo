package com.stackfing.handgo.repository;

import com.stackfing.handgo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByProductType_TypeId(Long typeId);

}
