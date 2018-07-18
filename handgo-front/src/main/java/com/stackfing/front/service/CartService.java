package com.stackfing.front.service;

import javax.servlet.http.HttpServletResponse;

public interface CartService {

	boolean addItem(Long pid, HttpServletResponse response);

}
