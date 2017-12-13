package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.Product;
import com.stackfing.handgo.repository.ProductRepository;
import com.stackfing.handgo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getProductByTypeId(Long typeId) {
        return productRepository.findByProductType_TypeId(typeId);
    }
}
