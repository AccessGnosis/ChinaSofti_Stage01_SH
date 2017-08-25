/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SystemIODemo.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: ����11:03:44
*/
package com.chinasofti.day25.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//��ʾ��׼���������
public class SystemIODemo {

	public static void main(String[] args) throws Exception {
		// InputStream input = System.in;
		// int data = input.read();
		// System.out.println(data);
		// System.err.println(data);// ��׼������Ϣ�����

		// ���¶����׼������
		System.setIn(new FileInputStream("C:/temp/stream/a.txt"));
		// ���¶����׼�����
		System.setOut(new PrintStream(new FileOutputStream("C:/temp/stream/a_aa.txt")));
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = System.in.read(buffer))!=-1){
			System.out.println(new String(buffer, 0, len));
		}

	}

}
