package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.mapper.ProductTypeMapper;
import com.stackfing.handgo.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
