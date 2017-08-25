/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: PriorityDemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: 下午4:28:14
*/
package com.chinasofti.day22.thread;

public class PriorityDemo {

	public static void main(String[] args) {
		// System.out.println(Thread.currentThread().getPriority());
		// Thread.currentThread().setPriority(10);
		// System.out.println(Thread.currentThread().getPriority());

		DD d1 = new DD("高优先级");
		d1.setPriority(Thread.MAX_PRIORITY);
		DD d2 = new DD("低优先级");
		d2.setPriority(Thread.MIN_PRIORITY);
		d1.start();
		d2.start();
	}

}

class DD extends Thread {
	public DD(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println(this.getName() + "----" + i);
		}
	}
}