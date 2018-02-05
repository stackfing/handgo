package com.stackfing.service;

import com.stackfing.pojo.Notice;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:24 18-1-26
 * @see
 */
public interface NoticeService {

	List<Notice> getNoticeList();

	List<Notice> getNoticeList(Integer page, Integer limit);

	Notice save(Notice notice);

	Notice save(Integer id, Notice notice);

	int delete(Integer id);

}
