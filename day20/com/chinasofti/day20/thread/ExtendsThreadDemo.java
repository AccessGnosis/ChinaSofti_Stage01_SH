/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExtendsThreadDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: ����11:07:26
*/
package com.chinasofti.day20.thread;

//��ʾ�̳�Thread�����߳�
/**
 * ����һ�ߴ���Ϸ��һ��������
 * @author Administrator
 *
 */
public class ExtendsThreadDemo {

	// ���̣߳�jvm�Զ���ȡ��������Ϸ
	public static void main(String[] args) {
		Music m = new Music();// �������̶߳���δ����
		m.start(); // �����߳�
		for (int i = 0; i < 100; ++i) {
			System.out.println("��������Ϸ");
		}
	}

}

class Music extends java.lang.Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println("����������...");
		}
	}
}