package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.repository.ProductTypeRepository;
import com.stackfing.handgo.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public List<ProductType> findAllType() {
        return productTypeRepository.findAll();
    }
}
