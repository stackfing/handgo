package com.stackfing.handgo.admin.service.serviceImpl;

import com.stackfing.handgo.admin.entity.Product;
import com.stackfing.handgo.admin.mapper.ProductMapper;
import com.stackfing.handgo.admin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<Product> getProductByTypeId(Long typeId) {
        return productMapper.findByProductType_TypeId(typeId);
    }
}
