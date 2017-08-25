/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TimerDemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: обнГ5:17:24
*/
package com.chinasofti.day22.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Date time = new Date(System.currentTimeMillis() + 3000);

		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("HelloWorld");
				timer.cancel();
			}
		}, time);
	}

}
