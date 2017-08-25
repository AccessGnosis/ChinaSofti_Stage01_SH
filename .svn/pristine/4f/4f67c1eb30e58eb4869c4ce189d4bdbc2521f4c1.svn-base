/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LocalInnerClass.java
* Copyright 2017-07-30 By Gnosis. Allright reserved.
* Time: 上午11:03:39
*/
package com.chinasofti.day12.innerclass;

//演示局部内部类
public class LocalInnerClass {

	static String name = "李四";
	String name1 = "王五";

	public static void main(String[] args) {
		double salary = 200.0;// 局部变量
		// 局部内部类
		// 不能使用各种修饰符修饰，除了final和abstract
		class Inner {
			// String name = "张三";//错误：内部类Inner中的静态声明非法
			int age = 20;// 局部变量
			final int age1 = 20;// 局部final变量

			void test() {
				System.out.println(name);
				System.out.println(age);
			}
		}

		new Inner().test();
	}

}
