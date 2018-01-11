package com.stackfing.admin.service;

import com.stackfing.admin.pojo.TreeRoot;
import com.stackfing.pojo.ProductType;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> findAllType();

    List<ProductType> selectAllRoot();

    List<ProductType> selectAllChildrenByParentId(Long id);

	ProductType selectTypeById(Long id);

	List<TreeRoot> getTypesTree();
}
