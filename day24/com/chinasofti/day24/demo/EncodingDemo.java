/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: EncodingDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: ����5:26:15
*/
package com.chinasofti.day24.demo;

import java.util.Arrays;

public class EncodingDemo {

	public static void main(String[] args) throws Exception {
		String str = "�ܾúܾ���ǰ";
		byte[] bytes = str.getBytes("utf-8");//����
		System.out.println(Arrays.toString(bytes));
		String data = new String(bytes, "utf-8");//����byte[]--->String
		System.out.println(data);
		
	}

}
