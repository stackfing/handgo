package com.stackfing.handgo.admin.service;

import com.stackfing.handgo.admin.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByTypeId(Long typeId);

}
