/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringDemo05.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: 下午1:54:37
*/
package com.chinasofti.day13.string;

//获取网址的域名
public class StringDemo05 {

	public static void main(String[] args) {
		String url = "http://www.taobao.com";
		int start = url.indexOf(".") + 1;
		int end = url.indexOf(".", start);
		// 截取字符串
		String uri = url.substring(start, end);
		System.out.println(uri);
		System.out.println("============================");
		// 去除字符串两端的无用空格
		System.out.println(" www.baidu.com   ".trim());
		// char ch = charAt(int index);
		// 查看当前字符串中index指定的字符
		String str = "hello world";
		System.out.println(str.charAt(8));
		// 判断回文
		// String str1 = "上海自来水来自海上";
		String str1 = "123321";
		// 第一种判断算法
		int count = 0;
		for (int i = 0, j = str1.length() - 1; j > i; ++i, --j) {
			if (str1.charAt(i) != str1.charAt(j)) {
				break;
			}
			count++;
		}
		if (count == str1.length() / 2) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}
		// 第二种判断算法
		/*
		 * 开关的使用：
		 * 	1）假设
		 * 	2）修改
		 * 	3）判断
		 */
		boolean flag = true;// 假设默认为回文
		for (int i = 0; i < str1.length(); ++i) {
			if (str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}
	}

}
