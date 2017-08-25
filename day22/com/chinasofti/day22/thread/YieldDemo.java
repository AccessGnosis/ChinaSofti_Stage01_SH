/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: YielEEemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: 下午5:07:16
*/
package com.chinasofti.day22.thread;

//礼让：效果不明显
public class YieldDemo {

	public static void main(String[] args) {
		EE d1 = new EE("高优先级");
		EE d2 = new EE("低优先级");
		d2.setPriority(Thread.MAX_PRIORITY);
		d1.setPriority(Thread.MIN_PRIORITY);
		d1.start();
		d2.start();
	}

}

class EE extends Thread {
	public EE(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println(this.getName() + "----" + i);
			if (i == 30) {
				Thread.yield();
			}
		}
	}
}
