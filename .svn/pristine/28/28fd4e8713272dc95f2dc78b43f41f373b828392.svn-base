/**
* Describe:正则表达式：是一串特定的字符，组成的一个“规则字符串”，这个规则的字符串是描述文本规则的工具。
* 		实质就是记录文本规则的代码。
* 比如：
* 	正则表达式："[a-z]"表示a到z中的任意一个字符
* 			"[a-z]+"表示由一个或多个a-z字符组成的字符串
* Keyword: 
* Hint: 
* Filename: RegexDemo01.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: 上午9:54:25
*/
package com.chinasofti.day15.regex;

import java.util.Arrays;
import java.util.Date;

public class RegexDemo01 {

	public static void main(String[] args) {
		/*
		 * 注意：想去表示任意一个字符
		 * 	[abc]			:表示a, b, c中任意一个字符
		 * 	[abc]+			:表示a, b, c中任意一个或多个字符
		 * 	[^abc]			:除了a, b, c的任意字符
		 * 	[a-zA-Z0-9]		:表示a~z, A~Z, 0~9中的任意一个字符
		 * 	[a-z&&[^bc]]	:a~z中除了bc之外的任意一个字符，&&是与（且）的意思
		 * 
		 * .	:任意一个字符
		 * \d	:任意一个数字字符，相当于[0-9]
		 * \w	:单词字符，相当于[a-zA-z0-9_]
		 * \s	:空白字符，相当于[\t\n\r]
		 * \D	:非数字字符
		 * \W	:非单词字符
		 * \S	:非空白字符
		 * 
		 * X?		:表示0个或1个X
		 * X*		:表示0个或任意多个X
		 * X+		:表示1个或任意多个X
		 * X{n}		:表示n个X
		 * X{n,}	:表示n个或任意多个X（大于等于n）
		 * X{n,m}	:表示n到m个X
		 */
		String regex1 = "[a-z]";
		String regex2 = "[^a-z]";
		String regex3 = "\\d";
		String regex4 = "\\D";

		System.out.println("a".matches(regex1));
		System.out.println("a".matches(regex2));
		System.out.println("1".matches(regex3));
		System.out.println("1".matches(regex4));

		// 需求：检索邮政编码
		/*
		 * 六位数字：
		 * 		[0-9][0-9][0-9][0-9][0-9][0-9]
		 * 		\d\d\d\d\d\d
		 * 		\d{6}
		 * 		[0-9]{6}
		 */

		String regex5 = "[a-z]*";
		System.out.println("abcdefg".matches(regex5));
		String regex6 = "[0-9]{6}";
		System.out.println("723000".matches(regex6));
		System.out.println("7230000".matches(regex6));

		String regex7 = "\\w+\\.jar";
		System.out.println("jar.jar".matches(regex7));
		System.out.println("java.jar.jar".matches(regex7));
		System.out.println("java_jar.jar".matches(regex7));

		String regex8 = "\\d?[a-z]";
		System.out.println("1a".matches(regex8));
		System.out.println("12a".matches(regex8));
		System.out.println("1ca".matches(regex8));
		System.out.println("a".matches(regex8));
		System.out.println("".matches(regex8));
		System.out.println(" ".matches(regex8));

		/*
		 * 检索：手机号码：+86 17629262609
		 * 	(\+86)?\s*\d{11}
		 * 
		 * 分组：（）
		 * 代表()里面的内容可有可无，但是要有都有，要没有都没有
		 */
		String regex9 = "(\\+86)?\\s*\\d{11}";
		System.out.println("+86 17629262609".matches(regex9));
		System.out.println("+8617629262609".matches(regex9));
		System.out.println("17629262609".matches(regex9));
		System.out.println("  17629262609".matches(regex9));
		System.out.println("  17629262609  ".matches(regex9));

		/*
		 * "^"和"$"	:边界分配
		 * "^"		:代表字符串的开始
		 * "$"		:代表字符串的结束
		 * 
		 * 需求：用户的命名规则，从头到尾连续8-10个单词字符
		 * 		\w{8,10}
		 */
		String regex10 = "\\w{8,10}";
		String regex11 = "^\\w{8,10}$";
		System.out.println("abc123_abc".matches(regex10));
		System.out.println("abc123_abc".matches(regex11));

		// boolean flag = "Regexstr".matches(regex表达式);
		// String[] strs = "Regexstr".split(regex表达式);
		// String str = "Regexstr".replaceAll(String regex, String str);
		// 将当前字符串中满足正则表达式的部分替换为给定的字符串

		// 需求：给图片重新命名
		String str1 = "123.jpg";
		String regex12 = "";
		String[] str1s = str1.split("\\.");
		System.out.println(Arrays.toString(str1s));
		str1 = "zhangsan_" + new Date().toLocaleString() + "." + str1s[str1s.length - 1];
		System.out.println(str1);

		String str2 = "fdafdaljfkdsl;jf3k21jr3ioj1rio32j1rio32j1iroj32i1orj3i21r321hrui32b1ri3b21urib321uirb32ui1br3ui21bui32b432i1b4ui32b14ib32i14b3iu2";
		String regex13 = "\\d+";
		str2 = str2.replaceAll(regex13, "*");
		System.out.println(str2);
		
		String regex14 = "(wqnmlgdsb|djb|sb)";
		String message1 = "wqnmlgdsb,你个大sb";
		message1 = message1.replaceAll(regex14, "***");
		System.out.println(message1);
		
	}
}