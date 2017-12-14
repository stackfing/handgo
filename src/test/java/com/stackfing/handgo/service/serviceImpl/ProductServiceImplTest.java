package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.Product;
import com.stackfing.handgo.service.ProductService;
import junit.textui.TestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Temporal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;
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