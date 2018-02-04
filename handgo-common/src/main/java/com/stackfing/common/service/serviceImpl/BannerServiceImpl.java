package com.stackfing.common.service.serviceImpl;

import com.stackfing.common.dao.BannerDao;
import com.stackfing.common.exception.HandgoException;
import com.stackfing.common.service.BannerService;
import com.stackfing.pojo.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:14 18-2-4
 */

@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerDao bannerDao;

	@Override
	public List<Banner> getBannerList() {
		return bannerDao.findAll();
	}

	@Override
	public List<Banner> getBannerList(int page, int size) {
		return bannerDao.findAll(new PageRequest(page - 1, size)).getContent();
	}

	@Override
	public Banner update(Banner banner) {
		Banner one = bannerDao.findOne(banner.getId());
		if (one == null) {
			throw new HandgoException("ID 不存在");
		}
		return bannerDao.save(banner);
	}

	@Override
	public int delete(int id) {
		return bannerDao.deleteById(id);
	}

	@Override
	public Banner save(Banner banner) {
		return bannerDao.save(banner);
	}
}
