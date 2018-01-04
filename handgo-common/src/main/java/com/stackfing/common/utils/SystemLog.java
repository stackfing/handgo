package com.stackfing.common.utils;

import lombok.ToString;

import java.util.Date;

@ToString
public class SystemLog {

		/*
		用于后置通知，用于controller操作
		日志标题
		类型
		url
		请求方式
		请求参数
		用户
		ip
		开始时间
		耗时
		 */

	private Long id;

	private String name;

	private Integer type;

	private String url;

	private String requestType;

	private String requestParam;

	private String user;

	private String ip;

	private String ipInfo;

	private Date time;

	private Date createDate;

	public SystemLog setId(Long id) {
		this.id = id;
		return this;
	}

	public SystemLog setName(String name) {
		this.name = name;
		return this;
	}

	public SystemLog setType(Integer type) {
		this.type = type;
		return this;
	}

	public SystemLog setUrl(String url) {
		this.url = url;
		return this;
	}

	public SystemLog setrequestParam(String requestParam) {
		this.requestParam = requestParam;
		return this;
	}

	public SystemLog setRequestType(String requestType) {
		this.requestType = requestType;
		return this;
	}

	public SystemLog setUser(String user) {
		this.user = user;
		return this;
	}

	public SystemLog setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public SystemLog setIpInfo(String ipInfo) {
		this.ipInfo = ipInfo;
		return this;
	}

	public SystemLog setTime(Date time) {
		this.time = time;
		return this;
	}

	public SystemLog setCreateDate(Date createDate) {
		this.createDate = createDate;
		return this;
	}

	public String commit() {
		return this.toString();
	}

}
