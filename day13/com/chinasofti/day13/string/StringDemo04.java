/**
* Describe: int length();//���ص�ǰ�ַ����ĳ���
* 			int indexof([����..]);//
* Keyword: 
* Hint: 
* Filename: StringDemo04.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: ����11:32:24
*/
package com.chinasofti.day13.string;

public class StringDemo04 {

	public static void main(String[] args) {
		String str = "��ã�2017��hehe";
		int len = str.length();
		System.out.println(len);

		String str1 = "wawawa";
		System.out.println(str1.length());
		System.out.println("��".length());
		System.out.println(",".length());
		System.out.println("��".length());
		System.out.println(" ".length());

		//			   0123456789012345
		String str2 = "thinking in java";
		int index = str2.indexOf("java");
		System.out.println(index);
		//���أ��Ӹ�����λ�ò鿴�����ַ����ڵ�ǰ�ַ����е�λ��
		System.out.println(str2.indexOf("in", 3));
		//�鿴�����ַ����ڵ�ǰ�ַ��������һ�γ��ֵ�λ��
		//java api��ͨ�������2�����ֱ�ʾ�ķ�Χ�����Ǻ�ͷ����β
		System.out.println(str2.lastIndexOf("in"));
		//�Ӹ�����λ�õ�����������λ��
		System.out.println(str2.substring(4, 8));
		//�Ӹ�����λ��һֱ���ַ�����ĩβ
		System.out.println(str2.substring(9));
	}

}
