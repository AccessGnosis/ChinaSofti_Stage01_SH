/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: RegExUtils.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: ����3:03:30
*/
package com.chinasofti.day15.task02.di01.regex;

public class RegExUtils {
	// �ṩ��̬����ʵ�ֶ����֤���롢�������롢�ֻ�����ĺϷ���У��
	public static boolean judgeIDNum(String id) {
		String regex = "[1-9]\\d{13,16}[a-zA-Z0-9]{1}";
		return id.matches(regex);
	}

	public static boolean judgeMailNum(String mailid) {
		String regex = "[1-9]\\d{5}";
		return mailid.matches(regex);
	}

	public static boolean judgePhoneNum(String phonenum) {
		String regex = "(\\+\\d+)?1[34578]\\d{9}$";
		return phonenum.matches(regex);
	}
}
