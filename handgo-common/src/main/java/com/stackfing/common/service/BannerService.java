package com.stackfing.common.service;

import com.stackfing.pojo.Banner;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:11 18-2-4
 * @see com.stackfing.common.service.serviceImpl.BannerServiceImpl
 */
public interface BannerService {

	List<Banner> getBannerList();

	List<Banner> getBannerList(int page, int size);

	Banner update(Banner banner);

	int delete(int id);

	Banner save(Banner banner);

}
