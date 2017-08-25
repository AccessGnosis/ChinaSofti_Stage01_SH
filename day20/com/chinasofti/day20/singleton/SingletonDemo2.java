/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SingletonDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: 下午5:07:52
*/
package com.chinasofti.day20.singleton;

//演示单例模式——懒汉式单例

public class SingletonDemo2 {

	public static void main(String[] args) {
		ArrayUtil2 au = ArrayUtil2.getInstance();
		au.doWork();
	}

}

// 单例模式
class ArrayUtil2 {
	private static ArrayUtil2 instance = new ArrayUtil2();

	private ArrayUtil2() {
	}

	public static ArrayUtil2 getInstance() {
		if (instance == null) {
			synchronized (ArrayUtil2.class) {
				if (instance == null)
					instance = new ArrayUtil2();
			}
		}
		return instance;
	}

	public void doWork() {
		System.out.println("懒汉式单例模式");
	}
}