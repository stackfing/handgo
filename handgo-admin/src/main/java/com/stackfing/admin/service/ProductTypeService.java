package com.stackfing.admin.service;

import com.stackfing.admin.entity.ProductType;
import com.stackfing.admin.pojo.TreeRoot;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> findAllType();

    List<ProductType> selectAllRoot();

    List<ProductType> selectAllChildrenByParentId(Long id);

	ProductType selectTypeById(Long id);

	List<TreeRoot> getTypesTree();
}
