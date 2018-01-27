package com.stackfing.common.dao;

import com.stackfing.pojo.CommendCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:35 18-1-27
 */

public interface CommendCategoryDao extends JpaRepository<CommendCategory, Long> {

	List<CommendCategory> findAllByCategoryId(Long id);

	List<CommendCategory> findAllByRootTag(boolean isRoot);

}
