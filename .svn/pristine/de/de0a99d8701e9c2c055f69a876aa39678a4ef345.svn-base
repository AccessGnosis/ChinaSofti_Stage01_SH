/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExceptionDemo04.java
* Copyright 2017-08-03 By Gnosis. Allright reserved.
* Time: 下午2:22:56
*/
package com.chinasofti.day16.exception;

public class ExceptionDemo06 {

	public static void main(String[] args) {
		test1();
		System.out.println("===============");
		System.out.println(test1()); // finally中如果有return语句，永远返回的是finally中的结果
		System.out.println("===============");
		System.out.println(test2());
		System.out.println("===============");
		System.out.println(test3());
		System.out.println("===============");
		test4();
	}

	private static void test4() {
		try {
			System.out.println("begin...");
			int ret = 1 / 0;
//			int ret = 1 / 1;
			System.out.println("结果 = " + ret);
		} catch (ArithmeticException e) {
			System.out.println("嘿嘿，我出错了");
			System.exit(-1);//退出jvm虚拟机
		} finally {
			System.out.println("我的功能是关闭资源");
		}
		System.out.println("end....");
	}

	private static int test3() {
		int a = 1;

		try {
			return a;
		} finally {
			return ++a;
		}
	}

	private static int test2() {
		int a = 1;

		try {
			return a;
		} finally {
			return a++;
		}
	}

	private static int test1() {
		try {
			System.out.println("hah, test1....");
			System.out.println("hah, test2....");
			return 5;
		} finally {
			System.out.println("jin666");
		}
	}

}
