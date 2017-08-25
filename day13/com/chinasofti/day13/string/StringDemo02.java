/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringDemo02.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: 上午10:10:50
*/
package com.chinasofti.day13.string;

public class StringDemo02 {

	public static void main(String[] args) {
		// 面试题
		String str1 = "ABCD";
		String str2 = "A" + "B" + "C" + "D";
		String str3 = "AB" + "CD";
		String str4 = "AB";
		String str5 = str4 + "CD";
		String str6 = str4 + getString();
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		/*
		 * "=="：只能比较内存地址
		 * "equals()"：比较的是内容
		 */
	}
	static String getString(){
		return "CD";
	}
}
