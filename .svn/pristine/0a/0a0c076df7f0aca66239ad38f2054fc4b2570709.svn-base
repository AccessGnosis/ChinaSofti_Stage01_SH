/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SimpleDateFormateDemo02.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: 下午5:33:48
*/
package com.chinasofti.day14.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo02 {

	public static void main(String[] args) throws ParseException {
		string2DateTimeFormat();
	}

	private static void string2DateTimeFormat() throws ParseException {
		// 将String转换为Date类型
		String str = "2008年08月08日20点08分08秒";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
		/*
		 * String ---> Date
		 * SimpleDateFormat提供了一个方法：
		 * 	Date parse(String str):该方法可以将给定的字符串按照创建SimpleDateFormat
		 * 			的时候指定的格式进行解析返回对应的Date对象
		 */
		Date date = sdf.parse(str);
		System.out.println(date.toLocaleString());
	}

}
