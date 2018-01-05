package com.stackfing.sso.pojo;

import com.stackfing.common.utils.HandgoResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午7:46 18-1-5
 */

@Getter
@Setter
@ToString
public class RedirectUrl extends HandgoResult {

	private String url;
}
