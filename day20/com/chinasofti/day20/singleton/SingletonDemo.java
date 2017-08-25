/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SingletonDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: ����5:07:52
*/
package com.chinasofti.day20.singleton;

//��ʾ����ģʽ��������ʽ����

public class SingletonDemo {

	public static void main(String[] args) {
		ArrayUtil au = ArrayUtil.getInstance();
		au.doWork();
	}

}

// ����ģʽ
class ArrayUtil {
	private final static ArrayUtil instance = new ArrayUtil();

	private ArrayUtil() {
	}

	public static ArrayUtil getInstance() {
		return instance;
	}
	
	public void doWork(){
		System.out.println("����ʽ����ģʽ");
	}
}