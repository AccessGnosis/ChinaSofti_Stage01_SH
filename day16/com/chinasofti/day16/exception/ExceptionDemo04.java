/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExceptionDemo04.java
* Copyright 2017-08-03 By Gnosis. Allright reserved.
* Time: ����2:22:56
*/
package com.chinasofti.day16.exception;

public class ExceptionDemo04 {

	public static void main(String[] args) {
		test1();
		System.out.println("===============");
		System.out.println(test1()); // finally�������return��䣬��Զ���ص���finally�еĽ��
	}

	private static int test1() {
		try {
			System.out.println("hah, test1....");
			System.out.println("hah, test2....");
			return 5;
		} finally {
			System.out.println("jin666");
			return 666;
		}
	}

}
