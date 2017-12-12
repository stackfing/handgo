package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.entity.UserDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    public void findUserByStatusIs() throws Exception {
        List<User> users = userService.findUserByStatusIs(21);
        for (User u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void getUserDetailById() {
        List<UserDetail> list = userService.findUserDetailsByUserDetailIdIs(1L);
        for (UserDetail u : list) {
            System.out.println(u.toString());
        }
    }

}