/**
* 字符串的常量池：主要是用来缓存通过缓存创建的字符串对象，并重用他们。
* Describe: 演示字符串的比较：
* 	1）单独使用“”引号创建的字符串都是直接量，编译期就已经确定并存储在常量池中。
* 	2）使用new String()创建的对象会存储到堆内存中，是运行期才创建的。
* 	3）使用只包含直接量的字符串连接符的如"Hello" + " World"创建的也是直接量存储在方法区常量池中，也是编译期确定的。
* 	4）使用包含String直接量的字符串（无final修饰）表达式（如：s1+"!"）创建的对象是在堆中，是运行期确定的。
* Keyword: 
* Hint: 
* Filename: StringDemo01.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: 上午9:18:48
*/
package com.chinasofti.day13.string;

public class StringDemo01 {

	public static void main(String[] args) {
		String str = "张三";
		System.out.println(str.hashCode());
		str += 20;
		System.out.println(str);
		System.out.println(str.hashCode());

		System.out.println("-----------------------------------------");

		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = "Hello World";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		s1 += "!";
		System.out.println("========================================");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println("-----------------------------------------");
		
		String s4 = "Hello World"; // 创建0个或1个对象
		String s5 = new String("Hello World"); // 创建1个或2个对象
		String s6 = new String("Hello World");

		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
	}

}
