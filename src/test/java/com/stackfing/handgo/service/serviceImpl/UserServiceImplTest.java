package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.entity.UserLocate;
import com.stackfing.handgo.mapper.UserLocateMapper;
import com.stackfing.handgo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserLocateMapper userLocateRepository;

    @Autowired
    private UserMapper userRepository;

    @Test
    public void findusers () {
        List<User> list  = userRepository.findAll();
		for (User u : list) {
			System.out.println(u);
		}
	}

    @Test
    public void findUserByStatusIs() throws Exception {
    }

    @Test
    public void findUserDetailsByUserDetailIdIs() throws Exception {
        UserLocate userLocate = userLocateRepository.findByIsPrimaryIs(1);

        System.out.println(userLocate);
    }

    @Test
    public void findParmiry() throws Exception {

    }

}