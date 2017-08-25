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
 * 演示实现匿名内部类创建线程
 * 需求：一边打游戏，一边听音乐
 * @author Administrator
 * 格式：
 * new 父类的构造器([实参]){
 * 	//匿名内部类的方法体
 * }
 * 注意：匿名内部类必须继承一个父类或者实现一个接口，但最多只能有一个父类或实现一个接口
 */
public class InnerClassDemo1 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; ++i) {
					System.out.println("我在听音乐");
				}
			}
		}).start();// 创建一个线程对象
		for (int i = 0; i < 200; ++i) {
			System.out.println("我在玩游戏");
		}
	}

}
