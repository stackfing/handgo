package com.stackfing.admin.controller;

import com.stackfing.admin.entity.Store;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:26 19-6-7
 */

@RestController
@RequestMapping("store")
public class StoreController extends BaseController<Store, Long> {
}
