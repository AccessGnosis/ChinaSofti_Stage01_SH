/**
* Describe: 该类用来将Date日期与String之间按照给定的日期格式相应转换
* Keyword: 
* Hint: 
* Filename: SimpleDateFormateDemo01.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: 下午5:20:28
*/
package com.chinasofti.day14.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo01 {

	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		System.out.println(now);
		// 通常创建SimpleDateFormat对象的时候需要传入一个字符串，该字符串就是日期格式
		// 这样它就可以按照该格式在Date和String之间进行转换
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		String nowstr = sdf.format(now);
		System.out.println(nowstr);
	}

}
