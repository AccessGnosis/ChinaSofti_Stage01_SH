/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: 上午9:37:28
*/
package com.chinasofti.day21.consprod;

public class MainClass {

	public static void main(String[] args) {
		// 创建生产者和消费者的共同对象
		ShareResource resource = new ShareResource();
		// 启动生产者线程
		new Thread(new Producer(resource)).start();
		// 启动消费者线程
		new Thread(new Consumer(resource)).start();
	}

}
