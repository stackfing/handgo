package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.entity.UserDetail;
import com.stackfing.handgo.repository.UserDetailRepository;
import com.stackfing.handgo.repository.UserRepository;
import com.stackfing.handgo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public List<User> findUserByStatusIs(int status) {
        return userRepository.findUserByStatusIs(1);
    }

    @Override
    public List<UserDetail> findUserDetailsByUserDetailIdIs(Long uid) {
        return userDetailRepository.findUserDetailsByUserDetailIdIs(uid);
    }

}
