package com.stackfing.admin.mapper;

import com.stackfing.pojo.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {

    List<Product> findByProductType_TypeId(Long typeId);

    List<Product> findAll();

}
