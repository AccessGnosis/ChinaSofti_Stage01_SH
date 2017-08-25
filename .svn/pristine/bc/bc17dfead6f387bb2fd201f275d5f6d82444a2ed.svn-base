/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SingletonDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: 下午5:07:52
*/
package com.chinasofti.day20.singleton;

//演示单例模式——饿汉式单例

public class SingletonDemo {

	public static void main(String[] args) {
		ArrayUtil au = ArrayUtil.getInstance();
		au.doWork();
	}

}

// 单例模式
class ArrayUtil {
	private final static ArrayUtil instance = new ArrayUtil();

	private ArrayUtil() {
	}

	public static ArrayUtil getInstance() {
		return instance;
	}
	
	public void doWork(){
		System.out.println("饿汉式单例模式");
	}
}