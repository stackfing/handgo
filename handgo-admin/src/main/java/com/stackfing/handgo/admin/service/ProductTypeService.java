package com.stackfing.handgo.admin.service;

import com.stackfing.handgo.admin.entity.ProductType;
import com.stackfing.handgo.admin.pojo.TreeRoot;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> findAllType();

    List<ProductType> selectAllRoot();

    List<ProductType> selectAllChildrenByParentId(Long id);

	ProductType selectTypeById(Long id);

	List<TreeRoot> getTypesTree();
}
