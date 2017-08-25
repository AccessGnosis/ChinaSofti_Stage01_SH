/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: EncodingDemo.java
* Copyright 2017-08-17 By Gnosis. Allright reserved.
* Time: 上午11:25:38
*/
package com.chinasofti.day27.coder;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingDemo {

	public static void main(String[] args) throws Exception {
		String a = "旭东问：";
		String b = "小龙你有女朋友嘛？"+"1.94 _ love you";
		String str = a + URLEncoder.encode(b, "utf-8");
		System.out.println(str);
		String destr = URLDecoder.decode(str, "utf-8");
		System.out.println(destr);
		String destr2 = URLDecoder.decode(str, "gbk");
		System.out.println(destr2);
		// 平台默认的字符集是gbk
		String destr3 = URLDecoder.decode(str);
		System.out.println(destr3);
	}

}
