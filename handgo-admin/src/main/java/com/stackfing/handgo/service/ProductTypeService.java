package com.stackfing.handgo.service;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.pojo.TreeRoot;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> findAllType();

    List<ProductType> selectAllRoot();

    List<ProductType> selectAllChildrenByParentId(Long id);

	ProductType selectTypeById(Long id);

	List<TreeRoot> getTypesTree();
}
