/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: GoodsDetail.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: 下午3:17:18
*/
package com.chinasofti.day15.task03.di01.goodscalc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GoodsDetail {

	public static String getResultDay(String goodbirth, int goodalive) throws Exception {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(goodbirth);

		calendar.setTime(date);
		calendar.set(Calendar.DATE, goodalive - 14);

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int wednesday = Calendar.WEDNESDAY;

		if (dayOfWeek > wednesday) {
			int days = dayOfWeek - wednesday;
			calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - days);
		} else if (dayOfWeek < wednesday) {
			int days = wednesday - dayOfWeek;
			calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + days);
		}
		
		if(calendar.getTime().getTime() < date.getTime()){
			return "该产品不推荐促销";
		}

		return sdf.format(calendar.getTime());
	}

}
