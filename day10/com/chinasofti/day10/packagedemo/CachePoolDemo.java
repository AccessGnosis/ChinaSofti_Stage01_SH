/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CachePoolDemo.java
* Copyright 2017-07-28 By Gnosis. Allright reserved.
* Time: 下午3:41:25
*/
package com.chinasofti.day10.packagedemo;

public class CachePoolDemo {

	public static void main(String[] args) {
		Integer num1 = 123;
		Integer num2 = 123;

		System.out.println(num1 == num2);// 比较的是内存地址

		Integer num3 = 1290;
		Integer num4 = 1290;
		System.out.println(num3 == num4);
		System.out.println(num3.equals(num4));// 比较的是对象中的数据

		System.out.println("==========================");

		Integer num5 = new Integer(123);
		Integer num6 = new Integer(123);
		System.out.println(num5 == num6);
		System.out.println(num5.equals(num6));
	}

}
