/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringDemo06.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: 下午2:52:21
*/
package com.chinasofti.day13.string;

public class StringDemo06 {

	public static void main(String[] args) {
		String str = "HelloWorld";
		// 将当前字符串中的所有大写字母转换为小写字母
		System.out.println(str.toLowerCase());
		// 将当前字符串中的所有小写字母转换为大写字母
		System.out.println(str.toUpperCase());
		// 以上方法常被用来忽略大小写的字符串验证上
		
		System.out.println(str.equalsIgnoreCase("helloworld"));
		
		//判断当前字符串是否是以给定的字符串开始的
		System.out.println(str.startsWith("H"));
		System.out.println(str.startsWith("He"));
		//判断当前字符串是否是以给定的字符串结束的
		System.out.println(str.endsWith("d"));
		System.out.println(str.endsWith("orld"));
		
		System.out.println(String.valueOf(3.14).getClass().getSimpleName());
		System.out.println((3.14 + "").getClass().getSimpleName());
	}

}
