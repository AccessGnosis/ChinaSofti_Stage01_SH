/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: JoinDemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: 下午3:34:14
*/
package com.chinasofti.day22.thread;

public class JoinDemo {

	public static void main(String[] args) {
		System.out.println("begin");
		BB b = new BB();
		for (int i = 0; i < 30; ++i) {
			System.out.println("main ---- 主线程 " + i);
			if (i == 10) {
				b.start();
				System.out.println(b.isDaemon());
			}
			if (i == 20) {
				try {
					b.join();//并入联合线程，强制执行该线程，直到结束后才会运行另一个线程
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

class BB extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 2000; ++i) {
			System.out.println("BB ----- 线程对象 " + i);
		}
	}
}