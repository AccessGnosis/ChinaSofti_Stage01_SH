/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringDemo06.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: ����2:52:21
*/
package com.chinasofti.day13.string;

public class StringDemo06 {

	public static void main(String[] args) {
		String str = "HelloWorld";
		// ����ǰ�ַ����е����д�д��ĸת��ΪСд��ĸ
		System.out.println(str.toLowerCase());
		// ����ǰ�ַ����е�����Сд��ĸת��Ϊ��д��ĸ
		System.out.println(str.toUpperCase());
		// ���Ϸ��������������Դ�Сд���ַ�����֤��
		
		System.out.println(str.equalsIgnoreCase("helloworld"));
		
		//�жϵ�ǰ�ַ����Ƿ����Ը������ַ�����ʼ��
		System.out.println(str.startsWith("H"));
		System.out.println(str.startsWith("He"));
		//�жϵ�ǰ�ַ����Ƿ����Ը������ַ���������
		System.out.println(str.endsWith("d"));
		System.out.println(str.endsWith("orld"));
		
		System.out.println(String.valueOf(3.14).getClass().getSimpleName());
		System.out.println((3.14 + "").getClass().getSimpleName());
	}

}
