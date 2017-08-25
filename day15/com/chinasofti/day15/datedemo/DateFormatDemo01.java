/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DateFormatDemo01.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: 上午9:10:45
*/
package com.chinasofti.day15.datedemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo01 {

	public static void main(String[] args) throws ParseException {
		// 日期转变为字符串
		// 演示DateFormat类
		Date date = new Date();
		System.out.println(date);
		// 格式操作 Date---->String
		DateFormat df = DateFormat.getDateInstance();// 只输出年月日
		String time = df.format(date);
		System.out.println(time);

		System.out.println(DateFormat.getTimeInstance().format(date));// 输出时分秒
		System.out.println(DateFormat.getDateTimeInstance().format(date));// 输出年月日时分秒
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(date));

		System.out.println("=================字符串转变为日期====================");
		
		//字符串转变为日期
		String time1 = DateFormat.getDateTimeInstance().format(date);
		Date date1 =  DateFormat.getDateTimeInstance().parse(time1);
		System.out.println(date1);
		
	}

}
