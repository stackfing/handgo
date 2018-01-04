package com.stackfing.sso.service.serviceImpl;

import com.stackfing.common.utils.HandgoResult;
import com.stackfing.sso.service.SSOService;
import org.springframework.stereotype.Service;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:04 18-1-3
 */
@Service
public class SSOServiceImpl implements SSOService{
	@Override
	public HandgoResult checkData(Integer type, String content) {
		HandgoResult handgoResult = null;



		if (type == 1) {
			//用户名
			handgoResult = new HandgoResult().Build(200).ok("ok");
		}

		if (type == 2) {
			//密码
		}

		if (type == 3) {
			//邮箱
		}

		return handgoResult;
	}
}
