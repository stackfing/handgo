package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.Product;
import com.stackfing.handgo.mapper.ProductMapper;
import com.stackfing.handgo.service.ProductService;
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
