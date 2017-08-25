/**
* Describe: ������100��ƻ����������ͬѧ���ã�ÿ��ֻ����һ�� 
* 	��Ϊ����ͬѧ����ͬʱ��ƻ������ʱ����Ҫʹ�ö��̼߳�����ʵ�֡�
* Keyword: 
* Hint: 
* Filename: ImplementsRunnableDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: ����2:19:27
*/
package com.chinasofti.day20.thread;

public class ImplementsRunnableDemo {

	public static void main(String[] args) {
		Apple1 a = new Apple1();
		new Thread(a, "С��").start();
		new Thread(a, "С��").start();
		new Thread(a, "С�").start();
	}

}

class Apple1 implements Runnable {
	private Integer num = 100;

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 100; ++i) {
			synchronized (num) {
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() + " �ڳԵ� " + num-- + " ��ƻ��");
				}
			}
		}
	}
}