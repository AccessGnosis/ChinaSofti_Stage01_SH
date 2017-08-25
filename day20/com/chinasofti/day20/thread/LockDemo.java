/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LockDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: 下午4:20:41
*/
package com.chinasofti.day20.thread;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
		Apple3 a = new Apple3();
		new Thread(a, "小龙").start();
		new Thread(a, "小丽").start();
		new Thread(a, "小楠").start();
	}

}
//共享资源对象
class Apple3 implements Runnable{
	private Integer num = 100;
	//创建锁
	private final ReentrantLock lock = new ReentrantLock();
	
	@Override
	public void run() {
		for(int i = 0; i< 100; ++i){
			takeAway();
		}
	}
	//需要做同步的方法
	public void takeAway(){
		lock.lock();//获取锁对象，加锁
		try {//需要同步的代码
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() + "吃了编号为 " + num-- + " 苹果");
			} 
		} finally {
			lock.unlock();//释放锁
		}
	}
}