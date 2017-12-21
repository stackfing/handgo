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
    public List<User> selectUserByStatusIs(int status) {
//        return userRepository.findUserByStatusIs(1);
        return null;
    }

//    @Override
//    public UserLocate findParmiry(Long uid) {
////        return userLocateRepository.findUserLocateByIsPrimary(uid);
//        return null;
//    }

	@Override
	public List<User> selectAllUser() {
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
		userMapper.deleteUserById(uid);
	}

	@Override
	public List<User> selectAllUserByPage(Long page) {
    	Long length = 10L;
    	List<User> list = null;
    	if (page == 1) {
			list = userMapper.findAllUserByPage(0L, length);
		} else {
			list = userMapper.findAllUserByPage((length * page) - (length - 1), length);
		}
		return list;
	}

}
