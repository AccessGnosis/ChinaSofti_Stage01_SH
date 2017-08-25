/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringDemo07.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: 下午3:13:54
*/
package com.chinasofti.day13.string;

public class StringDemo07 {

	public static void main(String[] args) {
		/*
		 * String[] split(String regex);
		 * 将当前字符串中满足正则表达式的地方进行拆分，保留剩下的部分
		 */
		String data = "123,147,2589,1369,4,5,68,154";
		String[] datas = data.split(",");
		for(String d : datas){
			System.out.print(d + " ");
		}
		System.out.println("\n============================");
		String url = "http://www.qingmukj.cn";
		String[] urisps = url.split("\\.");
		for(String u : urisps){
			System.out.print(u + "，");
		}
	}

}
