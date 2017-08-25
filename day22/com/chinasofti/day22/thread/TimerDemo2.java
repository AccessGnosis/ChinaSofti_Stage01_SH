/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TimerDemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: ÏÂÎç5:17:24
*/
package com.chinasofti.day22.thread;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo2 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Date time = new Date(System.currentTimeMillis() + 3000);

		timer.schedule(new TimerTask() {
			int count = 0;
			@Override
			public void run() {
				if(count++ == 3){
					timer.cancel();
				}
				System.out.println(new Date().toLocaleString());
			} 
		}, 0, 1000);
	}

}
