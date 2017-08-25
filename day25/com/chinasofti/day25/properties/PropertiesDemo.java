/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: PropertiesDemo.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: ����3:40:48
*/
package com.chinasofti.day25.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

//��ʾProperties��
public class PropertiesDemo {

	/*
	 * ģ���������ݿ����
	 */
	public static void main(String[] args) throws Exception {
		File f = new File("day25/com/chinasofti/day25/properties/db.properties");
		InputStream in = new FileInputStream(f);
		Properties p = new Properties();
		p.load(in);
		System.out.println(p.get("username"));
		System.out.println("=======================================");
		Enumeration<String> strs = (Enumeration<String>) p.propertyNames();

		while(strs.hasMoreElements()){
			String str = strs.nextElement();
			System.out.println(str+" ==== "+p.getProperty(str));
		}

		in.close();
	}

}
