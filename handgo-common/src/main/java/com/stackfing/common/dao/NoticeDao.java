package com.stackfing.common.dao;

import com.stackfing.pojo.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:27 18-1-26
 */
public interface NoticeDao extends JpaRepository<Notice, Integer> {
}
