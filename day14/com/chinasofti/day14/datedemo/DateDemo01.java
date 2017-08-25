/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DateDemo01.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: 下午2:20:15
*/
package com.chinasofti.day14.datedemo;

import java.util.Date;

public class DateDemo01 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toLocaleString());
		System.out.println(d.getTime());
		System.out.println(System.currentTimeMillis());
		
		int year = d.getYear();
		int month = d.getMonth();
		int day = d.getDate();
		System.out.println((year+1900)+"年"+(month+1)+"月"+(day+1)+"日");
		
		d.setTime(d.getTime()+(24L*60*60*1000));
		System.out.println(d.toLocaleString());
	}

}
