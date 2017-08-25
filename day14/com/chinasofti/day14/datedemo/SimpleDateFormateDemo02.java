/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SimpleDateFormateDemo02.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: ����5:33:48
*/
package com.chinasofti.day14.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo02 {

	public static void main(String[] args) throws ParseException {
		string2DateTimeFormat();
	}

	private static void string2DateTimeFormat() throws ParseException {
		// ��Stringת��ΪDate����
		String str = "2008��08��08��20��08��08��";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HH��mm��ss��");
		/*
		 * String ---> Date
		 * SimpleDateFormat�ṩ��һ��������
		 * 	Date parse(String str):�÷������Խ��������ַ������մ���SimpleDateFormat
		 * 			��ʱ��ָ���ĸ�ʽ���н������ض�Ӧ��Date����
		 */
		Date date = sdf.parse(str);
		System.out.println(date.toLocaleString());
	}

}
