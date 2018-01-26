package com.stackfing.admin.service.serviceImpl;

import com.stackfing.common.service.ProductDescriptionService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DescriptionServiceImplTest {

	@Autowired
	ProductDescriptionService productDescriptionService;

	@Test
	public void create() {
		System.out.println((productDescriptionService.create(1L, "tesat")));
	}

	@Test
	public void update() {
		System.out.println((productDescriptionService.update(1L, "123123")));
	}
}
