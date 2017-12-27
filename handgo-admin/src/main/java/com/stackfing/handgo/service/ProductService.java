package com.stackfing.handgo.service;

import com.stackfing.handgo.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByTypeId(Long typeId);

}
