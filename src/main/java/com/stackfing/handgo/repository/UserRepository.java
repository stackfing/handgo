package com.stackfing.handgo.repository;


import com.stackfing.handgo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
@Component
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findUserByHeadPhotoNull();

    List<User> findUserByStatusIs(int status);

}
