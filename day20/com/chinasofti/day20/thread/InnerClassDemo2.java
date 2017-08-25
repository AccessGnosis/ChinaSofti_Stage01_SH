/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InnerClassDemo2.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: 下午1:46:22
*/
package com.chinasofti.day20.thread;

/**
 * Thread
 * @author Administrator
 *
 */
public class InnerClassDemo2 {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; ++i) {
					System.out.println("我在听音乐...");
				}
			};
		}.start();
		for (int i = 0; i < 100; ++i) {
			System.out.println("我在玩游戏");
		}
	}

}