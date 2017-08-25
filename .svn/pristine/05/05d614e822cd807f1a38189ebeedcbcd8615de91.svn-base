/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_05_ThreadPrintTime.java
* Copyright 2017-08-12 By Gnosis. Allright reserved.
* Time: ионГ8:31:17
*/
package com.chinasofti.day22.task;

import java.util.Date;

public class Di_05_ThreadPrintTime {

	public static void main(String[] args) throws Exception {
		Thread t = new ThreadDemo();
		for (int i = 0; i < 5; ++i) {
			t.run();
			Thread.sleep(5000);
		}

	}
}

class ThreadDemo extends Thread {
	@Override
	public void run() {
		System.out.println(new Date().toLocaleString());
	}
}