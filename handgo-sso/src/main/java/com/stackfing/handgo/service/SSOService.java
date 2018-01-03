package com.stackfing.handgo.service;

import com.stackfing.handgo.common.HandgoResult;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:44 18-1-3
 */
public interface SSOService {

	HandgoResult checkData(Integer type, String data);

}
