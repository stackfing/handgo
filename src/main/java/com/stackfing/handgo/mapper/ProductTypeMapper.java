package com.stackfing.handgo.mapper;

import com.stackfing.handgo.entity.ProductType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductTypeMapper {

	List<ProductType> findAll();

}
