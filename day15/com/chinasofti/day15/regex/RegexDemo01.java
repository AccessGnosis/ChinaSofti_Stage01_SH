/**
* Describe:������ʽ����һ���ض����ַ�����ɵ�һ���������ַ����������������ַ����������ı�����Ĺ��ߡ�
* 		ʵ�ʾ��Ǽ�¼�ı�����Ĵ��롣
* ���磺
* 	������ʽ��"[a-z]"��ʾa��z�е�����һ���ַ�
* 			"[a-z]+"��ʾ��һ������a-z�ַ���ɵ��ַ���
* Keyword: 
* Hint: 
* Filename: RegexDemo01.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: ����9:54:25
*/
package com.chinasofti.day15.regex;

import java.util.Arrays;
import java.util.Date;

public class RegexDemo01 {

	public static void main(String[] args) {
		/*
		 * ע�⣺��ȥ��ʾ����һ���ַ�
		 * 	[abc]			:��ʾa, b, c������һ���ַ�
		 * 	[abc]+			:��ʾa, b, c������һ�������ַ�
		 * 	[^abc]			:����a, b, c�������ַ�
		 * 	[a-zA-Z0-9]		:��ʾa~z, A~Z, 0~9�е�����һ���ַ�
		 * 	[a-z&&[^bc]]	:a~z�г���bc֮�������һ���ַ���&&���루�ң�����˼
		 * 
		 * .	:����һ���ַ�
		 * \d	:����һ�������ַ����൱��[0-9]
		 * \w	:�����ַ����൱��[a-zA-z0-9_]
		 * \s	:�հ��ַ����൱��[\t\n\r]
		 * \D	:�������ַ�
		 * \W	:�ǵ����ַ�
		 * \S	:�ǿհ��ַ�
		 * 
		 * X?		:��ʾ0����1��X
		 * X*		:��ʾ0����������X
		 * X+		:��ʾ1����������X
		 * X{n}		:��ʾn��X
		 * X{n,}	:��ʾn����������X�����ڵ���n��
		 * X{n,m}	:��ʾn��m��X
		 */
		String regex1 = "[a-z]";
		String regex2 = "[^a-z]";
		String regex3 = "\\d";
		String regex4 = "\\D";

		System.out.println("a".matches(regex1));
		System.out.println("a".matches(regex2));
		System.out.println("1".matches(regex3));
		System.out.println("1".matches(regex4));

		// ���󣺼�����������
		/*
		 * ��λ���֣�
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
		 * �������ֻ����룺+86 17629262609
		 * 	(\+86)?\s*\d{11}
		 * 
		 * ���飺����
		 * ����()��������ݿ��п��ޣ�����Ҫ�ж��У�Ҫû�ж�û��
		 */
		String regex9 = "(\\+86)?\\s*\\d{11}";
		System.out.println("+86 17629262609".matches(regex9));
		System.out.println("+8617629262609".matches(regex9));
		System.out.println("17629262609".matches(regex9));
		System.out.println("  17629262609".matches(regex9));
		System.out.println("  17629262609  ".matches(regex9));

		/*
		 * "^"��"$"	:�߽����
		 * "^"		:�����ַ����Ŀ�ʼ
		 * "$"		:�����ַ����Ľ���
		 * 
		 * �����û����������򣬴�ͷ��β����8-10�������ַ�
		 * 		\w{8,10}
		 */
		String regex10 = "\\w{8,10}";
		String regex11 = "^\\w{8,10}$";
		System.out.println("abc123_abc".matches(regex10));
		System.out.println("abc123_abc".matches(regex11));

		// boolean flag = "Regexstr".matches(regex���ʽ);
		// String[] strs = "Regexstr".split(regex���ʽ);
		// String str = "Regexstr".replaceAll(String regex, String str);
		// ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�������ַ���

		// ���󣺸�ͼƬ��������
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
		String message1 = "wqnmlgdsb,�����sb";
		message1 = message1.replaceAll(regex14, "***");
		System.out.println(message1);
		
	}
}