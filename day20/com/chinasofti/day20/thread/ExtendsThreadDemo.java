/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExtendsThreadDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: 上午11:07:26
*/
package com.chinasofti.day20.thread;

//演示继承Thread创建线程
/**
 * 需求：一边打游戏，一边听音乐
 * @author Administrator
 *
 */
public class ExtendsThreadDemo {

	// 主线程，jvm自动调取，运行游戏
	public static void main(String[] args) {
		Music m = new Music();// 创建新线程对象，未启动
		m.start(); // 启动线程
		for (int i = 0; i < 100; ++i) {
			System.out.println("我在玩游戏");
		}
	}

}

class Music extends java.lang.Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println("我在听音乐...");
		}
	}
}