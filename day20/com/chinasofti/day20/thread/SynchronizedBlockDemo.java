/**
* Describe: 需求：有100个苹果，叫三个同学来拿，每次只能拿一个 
* 	因为三个同学可以同时吃苹果，此时，需要使用多线程技术来实现。
* Keyword: 
* Hint: 
* Filename: ImplementsRunnableDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: 下午2:19:27
*/
package com.chinasofti.day20.thread;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		Apple a = new Apple();
		new Thread(a, "小龙").start();
		new Thread(a, "小丽").start();
		new Thread(a, "小楠").start();
	}

}

class Apple implements Runnable {
	private Integer num = 100;

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 100; ++i) {
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() + " 在吃第 " + num-- + " 个苹果");
			}
		}
	}
}