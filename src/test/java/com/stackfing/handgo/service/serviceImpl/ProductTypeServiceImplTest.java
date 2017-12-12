package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.service.ProductTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTypeServiceImplTest {

    @Autowired
    private ProductTypeService productTypeService;

    @Test
    public void findAllType() throws Exception {
        List<ProductType> list = productTypeService.findAllType();
        for (ProductType p : list) {
            System.out.println(p);
        }
    }

}