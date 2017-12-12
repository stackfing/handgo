package com.stackfing.handgo.controller;

import com.stackfing.handgo.entity.UserDetail;
import com.stackfing.handgo.service.UserService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDetail> index() {
        return userService.findUserDetailsByUserDetailIdIs(1L);
    }

}
