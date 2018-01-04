package com.stackfing.sso.service;

import com.stackfing.common.utils.HandgoResult;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:44 18-1-3
 */
public interface SSOService {

	HandgoResult checkData(Integer type, String data);

}
