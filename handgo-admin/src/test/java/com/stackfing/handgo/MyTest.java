package com.stackfing.handgo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:34 17-12-27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

	@Test
	public void send() {
		Assert.assertEquals('a', 1);
	}
}
