/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CalendarDemo02.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: 下午3:36:21
*/
package com.chinasofti.day14.datedemo;

import java.util.Calendar;

public class CalendarDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 需求：想显示2008-08-08 20:08:08
		Calendar cld = Calendar.getInstance();
		cld.set(2008, Calendar.AUGUST, 8, 20, 8, 8);
		cld.setFirstDayOfWeek(Calendar.MONDAY);
		System.out.println(cld.getTime().toLocaleString());
		System.out.println(cld.get(Calendar.DAY_OF_MONTH));
		System.out.println(cld.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cld.get(Calendar.DAY_OF_WEEK));
		// 需求：查看08年第165天？
		Calendar cld1 = Calendar.getInstance();
		cld1.set(Calendar.YEAR, 2008);
		cld1.set(Calendar.DAY_OF_YEAR, 165);
		System.out.println(cld1.getTime().toLocaleString());
	}

}
