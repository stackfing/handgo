package com.stackfing.admin.service.serviceImpl;

import com.stackfing.admin.mapper.ProductTypeMapper;
import com.stackfing.admin.pojo.TreeRoot;
import com.stackfing.admin.service.ProductTypeService;
import com.stackfing.pojo.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductType> findAllType() {
        return productTypeMapper.findAll();
    }

	@Override
	public List<ProductType> selectAllRoot() {
		return productTypeMapper.selectAllRoot();
	}

	@Override
	public List<ProductType> selectAllChildrenByParentId(Long id) {
		return productTypeMapper.selectAllChildrenByParentId(id);
	}

	@Override
	public ProductType selectTypeById(Long id) {
		return productTypeMapper.selectTypeById(id);
	}

	@Override
	public List<TreeRoot> getTypesTree() {

		List<TreeRoot> treeRoot = new ArrayList<TreeRoot>();

		List<ProductType> list = selectAllRoot();

		for (ProductType root :
				list) {

			TreeRoot t = new TreeRoot();

			t.setName(root.getName());

			t.setId(root.getId());

			List<ProductType> productType = selectAllChildrenByParentId(root.getId());

			t.setChildren(productType);

			treeRoot.add(t);
		}
		return treeRoot;
	}
}
