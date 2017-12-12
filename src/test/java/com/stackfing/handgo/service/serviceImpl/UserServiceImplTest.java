package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    public void findUserByHeadPhotoNull() throws Exception {
        List<User> userList = userService.findUserByHeadPhotoNull();
        for (User u : userList) {
            System.out.println(u);
        }
    }

    @Test
    public void findUserByStatusIs() throws Exception {
        List<User> users = userService.findUserByStatusIs(21);
        for (User u : users) {
            System.out.println(u);
        }
    }

}