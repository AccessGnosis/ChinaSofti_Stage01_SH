/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ImplRunnableDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: ����11:27:32
*/
package com.chinasofti.day20.thread;

/**
 * ��ʾʵ�������ڲ��ഴ���߳�
 * ����һ�ߴ���Ϸ��һ��������
 * @author Administrator
 * ��ʽ��
 * new ����Ĺ�����([ʵ��]){
 * 	//�����ڲ���ķ�����
 * }
 * ע�⣺�����ڲ������̳�һ���������ʵ��һ���ӿڣ������ֻ����һ�������ʵ��һ���ӿ�
 */
public class ImplRunnableDemo2AnonymousInnerClass {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; ++i) {
					System.out.println("����������");
				}
			}
		}).start();// ����һ���̶߳���
		for (int i = 0; i < 200; ++i) {
			System.out.println("��������Ϸ");
		}
	}

}
