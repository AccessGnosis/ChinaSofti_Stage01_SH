/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ThreadStateDemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: ����1:59:30
*/
package com.chinasofti.day22.thread;

import java.io.IOException;

public class ThreadStateDemo {

	public static void main(String[] args) throws Exception {
		AA aa = new AA();// ����һ���̶߳��󣬴˶���Ŀǰ�����½�״̬
		aa.start();// ��ʱ���̴߳��ڿ�����״̬
		System.out.println(aa.isAlive());
		Thread.sleep(1000);
		System.out.println("�߳����н���...�߳���ֹ��...");
		System.out.println(aa.isAlive());
		/*
		if(!aa.isAlive()){
		 aa.start();	//IllegalThreadStateException��ʱ�߳�����
		 //���쳣���Ѿ��޷������߳�
		}
		*/

		// AA aa = new AA();// ����һ���̶߳��󣬴˶���Ŀǰ�����½�״̬
		// for (int i = 0; i < 50; ++i) {
		// System.out.println("main----" + i);
		// if (i == 10) {
		// aa.start();
		// }
		// }

		// System.out.println("��ʼ����...");
		// System.in.read();// ��������״̬---->����״̬
		// System.out.println("��������...");
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