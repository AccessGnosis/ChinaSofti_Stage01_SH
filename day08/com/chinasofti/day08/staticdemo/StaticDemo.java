/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StaticDemo.java
* Copyright 2017-07-24 By Gnosis. Allright reserved.
* Time: 下午1:46:29
*/
package com.chinasofti.day08.staticdemo;

public class StaticDemo {
	String msg = "非静态成员变量";
	static String staticMsg = "静态成员变量";

	void doWork() {
		System.out.println("我是非静态的成员方法");
		System.out.println(staticMsg);
		System.out.println(msg);
	}

	static void staticDoWork() {
		System.out.println("我是静态的成员方法");
	}

	void putIn(String msg) {
		System.out.println(msg);
	}

	void putFinalIn(final String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// System.out.println(msg); //错误，无法获取非静态
		System.out.println(staticMsg);
		// doWork();//错误，无法调用非静态方法
		staticDoWork();
		System.out.println("============================================");
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.msg);
		sd.doWork();
		System.out.println("============================================");
		sd.putIn(staticMsg);
		System.out.println("============================================");
		staticMsg = "静态123";
		sd.putFinalIn(staticMsg);
	}

}
