/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: PropertiesDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ����5:23:50
*/
package com.chinasofti.day19.generic;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("��һ", "���һ");
		p.setProperty("�ܶ�", "��ݶ�");
		p.setProperty("����", "�����");
		p.setProperty("����", "�����");
		p.setProperty("����", "�����");
		p.setProperty("����", "�����");
		p.setProperty("����", "�����");
		System.out.println(p);
		System.out.println(p.getProperty("��һ"));
		p.setProperty("����", "�����");
		System.out.println(p);
		
	}

}
