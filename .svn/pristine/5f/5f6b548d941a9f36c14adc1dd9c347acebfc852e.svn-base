/**
* Describe: int length();//返回当前字符串的长度
* 			int indexof([参数..]);//
* Keyword: 
* Hint: 
* Filename: StringDemo04.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: 上午11:32:24
*/
package com.chinasofti.day13.string;

public class StringDemo04 {

	public static void main(String[] args) {
		String str = "你好，2017，hehe";
		int len = str.length();
		System.out.println(len);

		String str1 = "wawawa";
		System.out.println(str1.length());
		System.out.println("你".length());
		System.out.println(",".length());
		System.out.println("，".length());
		System.out.println(" ".length());

		//			   0123456789012345
		String str2 = "thinking in java";
		int index = str2.indexOf("java");
		System.out.println(index);
		//重载：从给定的位置查看给定字符串在当前字符串中的位置
		System.out.println(str2.indexOf("in", 3));
		//查看给定字符串在当前字符串中最后一次出现的位置
		//java api中通常如果由2个数字表示的范围，都是含头不含尾
		System.out.println(str2.lastIndexOf("in"));
		//从给定的位置到给定结束的位置
		System.out.println(str2.substring(4, 8));
		//从给定的位置一直到字符串的末尾
		System.out.println(str2.substring(9));
	}

}
