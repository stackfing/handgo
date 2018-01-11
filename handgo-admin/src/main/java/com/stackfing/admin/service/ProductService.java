package com.stackfing.admin.service;

import com.stackfing.pojo.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByTypeId(Long typeId);

}
