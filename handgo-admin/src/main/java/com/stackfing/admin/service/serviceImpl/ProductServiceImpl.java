package com.stackfing.admin.service.serviceImpl;

import com.stackfing.admin.mapper.ProductMapper;
import com.stackfing.admin.service.ProductService;
import com.stackfing.pojo.Product;
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
