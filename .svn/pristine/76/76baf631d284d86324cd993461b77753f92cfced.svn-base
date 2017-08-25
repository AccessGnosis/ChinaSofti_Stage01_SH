/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ThreadStateDemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: 下午1:59:30
*/
package com.chinasofti.day22.thread;

import java.io.IOException;

public class ThreadStateDemo {

	public static void main(String[] args) throws Exception {
		AA aa = new AA();// 创建一个线程对象，此对象目前处于新建状态
		aa.start();// 此时该线程处于可运行状态
		System.out.println(aa.isAlive());
		Thread.sleep(1000);
		System.out.println("线程运行结束...线程终止了...");
		System.out.println(aa.isAlive());
		/*
		if(!aa.isAlive()){
		 aa.start();	//IllegalThreadStateException此时线程已死
		 //抛异常，已经无法启动线程
		}
		*/

		// AA aa = new AA();// 创建一个线程对象，此对象目前处于新建状态
		// for (int i = 0; i < 50; ++i) {
		// System.out.println("main----" + i);
		// if (i == 10) {
		// aa.start();
		// }
		// }

		// System.out.println("开始运行...");
		// System.in.read();// 进入阻塞状态---->运行状态
		// System.out.println("结束运行...");
	}

}

class AA extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; ++i) {
			System.out.println("AA --- " + i);
		}
	}
}