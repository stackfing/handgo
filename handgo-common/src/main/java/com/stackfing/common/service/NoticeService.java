package com.stackfing.common.service;

import com.stackfing.common.vo.NoticeVo;
import com.stackfing.pojo.Notice;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:24 18-1-26
 * @see com.stackfing.common.service.serviceImpl.NoticeServiceImpl
 */
public interface NoticeService {

	List<Notice> getNoticeList();

	List<Notice> getNoticeList(Integer page, Integer limit);

	Notice save(Notice notice);

	Notice save(Integer id, NoticeVo vo);

	int delete(Integer id);

}
