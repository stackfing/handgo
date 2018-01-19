package com.stackfing.common.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import com.stackfing.common.vo.DescriptionPhotoVo;

import java.io.InputStream;

public class QiNiuUtil {

	//构造一个带指定Zone对象的配置类
	static Configuration cfg = new Configuration(Zone.zone2());
	static UploadManager uploadManager = new UploadManager(cfg);
	//生成上传凭证，然后准备上传
	static String accessKey = "JqK1zlr4kLfUzDGyVp2Bj5G8eccirdr1SdRSShfC";
	static String secretKey = "syJOarSMbWIBIpTKa8PPJCNAt1VZPWzElnJL2QDg";
	//空间名
	static String bucket = "photos";
	static Auth auth = Auth.create(accessKey, secretKey);
	static String upToken = auth.uploadToken(bucket);
	//七牛云外链
	static String link = "http://ox6dv1vhi.bkt.clouddn.com/";

	public static HandgoResult uploadByStream(InputStream in) {
		return uploadByStream(in, null);
	}

	public static HandgoResult uploadByStream(InputStream in, String key) {
		String url = null;
		try {
			Response response = uploadManager.put(in, key, upToken, null, null);
			//解析上传成功的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
			url = link + putRet.key;
		} catch (QiniuException ex) {
			Response r = ex.response;
			System.err.println(r.toString());
			try {
				System.err.println(r.bodyString());
			} catch (QiniuException ex2) {

			}
		}
		System.out.println(url);
		return HandgoResult.success(0,new DescriptionPhotoVo(url, url.toString()));
	}

}
