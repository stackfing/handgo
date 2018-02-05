package com.stackfing.service;

import com.stackfing.pojo.Banner;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:11 18-2-4
 * @see
 */
public interface BannerService {

	List<Banner> findAll();

	List<Banner> findAll(int page, int size);

	Banner update(Banner banner);

	int delete(int id);

	Banner save(Banner banner);

}
