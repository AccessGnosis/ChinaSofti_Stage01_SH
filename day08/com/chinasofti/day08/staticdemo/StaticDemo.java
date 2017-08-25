/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StaticDemo.java
* Copyright 2017-07-24 By Gnosis. Allright reserved.
* Time: ����1:46:29
*/
package com.chinasofti.day08.staticdemo;

public class StaticDemo {
	String msg = "�Ǿ�̬��Ա����";
	static String staticMsg = "��̬��Ա����";

	void doWork() {
		System.out.println("���ǷǾ�̬�ĳ�Ա����");
		System.out.println(staticMsg);
		System.out.println(msg);
	}

	static void staticDoWork() {
		System.out.println("���Ǿ�̬�ĳ�Ա����");
	}

	void putIn(String msg) {
		System.out.println(msg);
	}

	void putFinalIn(final String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// System.out.println(msg); //�����޷���ȡ�Ǿ�̬
		System.out.println(staticMsg);
		// doWork();//�����޷����÷Ǿ�̬����
		staticDoWork();
		System.out.println("============================================");
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.msg);
		sd.doWork();
		System.out.println("============================================");
		sd.putIn(staticMsg);
		System.out.println("============================================");
		staticMsg = "��̬123";
		sd.putFinalIn(staticMsg);
	}

}
