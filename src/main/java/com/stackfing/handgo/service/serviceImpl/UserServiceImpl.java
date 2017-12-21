package com.stackfing.handgo.service.serviceImpl;

import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.entity.UserLocate;
import com.stackfing.handgo.mapper.UserMapper;
import com.stackfing.handgo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserByStatusIs(int status) {
//        return userRepository.findUserByStatusIs(1);
        return null;
    }

    @Override
    public UserLocate findParmiry(Long uid) {
//        return userLocateRepository.findUserLocateByIsPrimary(uid);
        return null;
    }

	@Override
	public List<User> findAllUser() {
		return userMapper.findAll();
	}

	@Override
	public User selectUserById(Long uid) {
//		return userMapper.findOne(uid);
		return null;
    }

	@Override
	public void saveUser(User user) {
//		userMapper.save(user);
    }

	@Override
	public void deleteUserById(Long uid) {
//		userMapper.delete(uid);
	}

	@Override
	public List<User> findAllUserByPage(Long page) {
		return userMapper.findAllUserByPage(page);
	}
}
