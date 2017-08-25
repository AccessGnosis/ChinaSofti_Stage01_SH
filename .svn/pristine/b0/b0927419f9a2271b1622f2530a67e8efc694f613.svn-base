/**
* Describe: 获取Calendar中某个时间的分量对应的值
* Keyword: 
* Hint: 
* Filename: CalendarDemo03.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: 下午4:25:09
*/
package com.chinasofti.day14.datedemo;

import java.util.Calendar;

public class CalendarDemo03 {

	public static void main(String[] args) {
		Calendar cld = Calendar.getInstance();
		cld.setFirstDayOfWeek(Calendar.SUNDAY);
		int day = cld.get(Calendar.DAY_OF_YEAR);
		int year = cld.get(Calendar.YEAR);
		int month = cld.get(Calendar.MONTH);
		int day1 = cld.get(Calendar.DATE);
		int day2 = cld.get(Calendar.DAY_OF_MONTH);
		int day3 = cld.get(Calendar.DAY_OF_WEEK);

		System.out.println(year + "年" + month + "月" + day1 + "日");
		System.out.println("本周第" + day3 + "天");
		System.out.println("今天是"+getCharsDays(cld.get(Calendar.DAY_OF_WEEK)));;
	}
	private static String getCharsDays(int day){
		String dayname = null;
		switch (day) {
		case 1:
			dayname = "周天";
			break;
		case 2:
			dayname = "周一";
			break;
		case 3:
			dayname = "周二";
			break;
		case 4:
			dayname = "周三";
			break;
		case 5:
			dayname = "周四";
			break;
		case 6:
			dayname = "周五";
			break;
		case 7:
			dayname = "周六";
			break;
		default:
			System.out.println("输入有误");
			break;
		}
		return dayname;
	}

}
