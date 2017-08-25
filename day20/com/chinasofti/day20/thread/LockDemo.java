/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LockDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: ����4:20:41
*/
package com.chinasofti.day20.thread;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
		Apple3 a = new Apple3();
		new Thread(a, "С��").start();
		new Thread(a, "С��").start();
		new Thread(a, "С�").start();
	}

}
//������Դ����
class Apple3 implements Runnable{
	private Integer num = 100;
	//������
	private final ReentrantLock lock = new ReentrantLock();
	
	@Override
	public void run() {
		for(int i = 0; i< 100; ++i){
			takeAway();
		}
	}
	//��Ҫ��ͬ���ķ���
	public void takeAway(){
		lock.lock();//��ȡ�����󣬼���
		try {//��Ҫͬ���Ĵ���
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() + "���˱��Ϊ " + num-- + " ƻ��");
			} 
		} finally {
			lock.unlock();//�ͷ���
		}
	}
}