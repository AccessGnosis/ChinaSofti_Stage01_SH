/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: YielEEemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: ����5:07:16
*/
package com.chinasofti.day22.thread;

//���ã�Ч��������
public class YieldDemo {

	public static void main(String[] args) {
		EE d1 = new EE("�����ȼ�");
		EE d2 = new EE("�����ȼ�");
		d2.setPriority(Thread.MAX_PRIORITY);
		d1.setPriority(Thread.MIN_PRIORITY);
		d1.start();
		d2.start();
	}

}

class EE extends Thread {
	public EE(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println(this.getName() + "----" + i);
			if (i == 30) {
				Thread.yield();
			}
		}
	}
}
