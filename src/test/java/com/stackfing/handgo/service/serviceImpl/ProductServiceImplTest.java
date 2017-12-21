package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.Product;
import com.stackfing.handgo.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductService productService;

    @Test
    public void getProductByTypeId() throws Exception {
        List<Product> list = productService.getProductByTypeId(1L);
        for (Product p : list) {
            System.out.println(p);
        }
    }

}