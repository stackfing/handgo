package com.stackfing.common.vo;

import com.stackfing.common.enums.ResultCode;
import com.stackfing.common.utils.Result;
import lombok.Data;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:10 18-1-26
 */
@Data
public class LayuiVo extends Result {
	int total;

	public static LayuiVo success(Object object, Integer total) {
		LayuiVo layuiVo = new LayuiVo();
		layuiVo.setCode(ResultCode.SUCCESS);
		layuiVo.setData(object);
		layuiVo.setTotal(total);
		return layuiVo;
	}
}
