/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CalendarDemo04.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: 下午4:52:01
*/
package com.chinasofti.day14.datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo04 {

	public static void main(String[] args) {
		// void add(int field, int value):对给定的时间分量累加给定值
		// 查看三个月之后的今天
		Calendar cld1 = Calendar.getInstance();
		cld1.set(Calendar.MONTH, cld1.get(Calendar.MONTH) + 3);
		Date date = new Date();
		date = cld1.getTime();
		System.out.println(date.toLocaleString());

		//查看25天后的今天
		Calendar cld2 = Calendar.getInstance();
		cld2.set(Calendar.DAY_OF_YEAR, cld2.get(Calendar.DAY_OF_YEAR) + 25);
		System.out.println(cld2.getTime());

		//查看1年前的今天
		Calendar cld3 = Calendar.getInstance();
		cld3.set(Calendar.YEAR, cld3.get(Calendar.YEAR) - 1);
		System.out.println(cld3.getTime());
		
		//查看今年一共有多少天
		int days = cld1.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(days);
	}

}
