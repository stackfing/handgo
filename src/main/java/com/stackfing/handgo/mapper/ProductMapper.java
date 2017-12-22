package com.stackfing.handgo.mapper;

import com.stackfing.handgo.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {

    List<Product> findByProductType_TypeId(Long typeId);

    List<Product> findAll();

}
