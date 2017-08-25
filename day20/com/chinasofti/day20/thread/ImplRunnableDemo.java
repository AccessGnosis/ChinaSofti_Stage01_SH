/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ImplRunnableDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: 上午11:27:32
*/
package com.chinasofti.day20.thread;

/**
 * 演示实现Runnable接口创建对象
 * 需求：一边打游戏，一边听音乐
 * @author Administrator
 *
 */
public class ImplRunnableDemo {

	public static void main(String[] args) {
		Runnable m = new Music1();// 创建一个Music类型的对象
		Thread t = new Thread(m);// 创建一个线程对象
		t.start();
		for (int i = 0; i < 200; ++i) {
			System.out.println("我在玩游戏");
		}
	}

}

class Music1 implements java.lang.Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println("我在听音乐");
		}
	}

}