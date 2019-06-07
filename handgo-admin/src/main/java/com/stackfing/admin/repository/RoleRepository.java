package com.stackfing.admin.repository;

import com.stackfing.admin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:20 19-6-7
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
