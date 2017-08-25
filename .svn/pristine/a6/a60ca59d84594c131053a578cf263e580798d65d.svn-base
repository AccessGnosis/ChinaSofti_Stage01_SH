/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringBufferDemo01.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: 下午4:30:34
*/
package com.chinasofti.day13.string;

public class StringBuilderDemo01 {

	public static void main(String[] args) {
		// 创建一个StringBuilder对象来修改字符串
		StringBuilder sb = new StringBuilder("diligent to study Java");
		System.out.println(sb.toString());
		sb.append(" !").append(" lalala");
		System.out.println(sb.toString());
		sb.replace(sb.indexOf("!"), sb.length(), "走上人生巅峰");
		System.out.println(sb.toString());
		System.out.println(sb.delete(0, 9));
		System.out.println(sb.insert(0, "活着，"));
		System.out.println(sb.reverse());

		// 判断回文
		StringBuilder sbf = new StringBuilder("1232121");
		StringBuilder sbfcp = new StringBuilder(sbf);
		StringBuilder sbfre = new StringBuilder(sbfcp.reverse());

		System.out.println(sbf);
		System.out.println(sbfre);

		if (sbf.equals(sbfre)) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}
		
		StringBuffer str1 = new StringBuffer("demo");
		StringBuffer str2 = new StringBuffer();
		str2 = str1.reverse();
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
