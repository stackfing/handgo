package com.stackfing.admin.mapper;

import com.stackfing.admin.entity.ProductType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductTypeMapper {

	List<ProductType> findAll();

	List<ProductType> selectAllRoot();

	List<ProductType> selectAllChildrenByParentId(Long id);

	ProductType selectTypeById(Long id);

}
