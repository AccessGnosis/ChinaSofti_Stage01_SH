/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: BackstageThreadDemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: 下午3:49:54
*/
package com.chinasofti.day22.thread;

import java.util.Iterator;
import java.util.Map;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		// 判断是否是守护线程/后台线程
		boolean isDaemon = Thread.currentThread().isDaemon();
		System.out.println(isDaemon);
		// Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		// Iterator<Thread> imap = map.keySet().iterator();
		// while (imap.hasNext()) {
		// Thread t = imap.next();
		// System.out.println(t + " -- " + map.get(t));
		// }
		CC c = new CC();
		System.out.println(c.isDaemon());
		// Thread.currentThread().setDaemon(true);
		// main方法为主线程，JVM自动启动，而setDaemon()方法必须在调用start()之前设置
		// System.out.println(Thread.currentThread().isDaemon());
		c.start();
		for(int i = 0; i < 10; ++i){
			System.out.println("main ... ");
		}
		System.out.println(c.isDaemon());
	}

}

class CC extends Thread {
	public CC() {
		// 设置线程为后台线程
		this.setDaemon(true);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println("是否是后台线程" + this.isDaemon());
		}
	}
}