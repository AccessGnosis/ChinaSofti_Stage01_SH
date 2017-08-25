/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_02_Birthday.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: 下午7:33:36
*/
package com.chinasofti.test.exam.di_04.program;

import java.util.Calendar;

public class Di_02_Birthday {

	public static void main(String[] args) {
		Birthday b = new Birthday(1996, 8, 11);
		b.toString();
		System.out.println(b.calcAge());
	}

}

class Birthday {
	private int year;
	private int month;
	private int day;

	public Birthday(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int calcAge() {
		int age = -1;
		Calendar calender = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.set(Calendar.YEAR, this.year);
		birth.set(Calendar.MONTH, this.month - 1);
		birth.set(Calendar.DAY_OF_MONTH, this.day);

		int nowyear = calender.get(Calendar.YEAR);
		int nowmonth = calender.get(Calendar.MONTH);
		int nowdate = calender.get(Calendar.DAY_OF_MONTH);

		if (nowmonth < birth.get(Calendar.MONTH)) {
			age = nowyear - this.year - 1;
		} else if(nowmonth > birth.get(Calendar.MONTH)){
			age = nowyear - this.year;
		}else{
			if(nowdate > birth.get(Calendar.DAY_OF_MONTH)){
				age = nowyear - this.year - 1;
			}else{
				age = nowyear - this.year;
			}
		}

		return age;
	}

	@Override
	public String toString() {
		return "生日是：" + year + "年" + month + "月" + day + "日";
	}

}