package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.entity.UserLocate;
import com.stackfing.handgo.repository.UserLocateRepository;
import com.stackfing.handgo.repository.UserRepository;
import com.stackfing.handgo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserLocateRepository userLocateRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findusers () {
        User user = userRepository.findByAccountEquals("1");
        System.out.println(user);
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