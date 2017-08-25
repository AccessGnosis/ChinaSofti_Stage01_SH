/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InputStreamDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: ����11:07:19
*/
package com.chinasofti.day24.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamDemo {

	public static void main(String[] args) throws Exception {
		// 1.����Դ�����ھ���
		File file = new File("C:/temp/stream/a.txt");
		// 2.�����ļ��ֽ����������󣬲�����Դ��
		InputStream fis = new FileInputStream(file);
		// 3.����Ķ�ȡ����
		/*
		 * int read()				�Ӵ��������ж�ȡһ�������ֽ�
		 * int read(byte[] b)		�Ӵ��������н����b.length���ֽڵ����ݶ���һ��byte������
		 * int read(byte[] b, int off, int len)	�Ӵ��������н����len���ֽڵ����ݶ���һ��byte��������
		 */
		// int data = fis.read();
		// System.out.println(data);
		// System.out.println((char) data);

		// byte[] bytes = new byte[1024];
		// int data = fis.read(bytes);// ���ض�ȡ�����������ֽ���
		/*
		 * ��������
		 * 	������ int read(byte[] bytes)������
		 * 		ʵ���ϻ����������䴦�����һ���Զ�ȡһ���ֽڻ����������뵽�����ṩ���ֽ������У�����������Ȼ�󽫵�һ���ֽڷ��أ�
		 * 	�����ĺô����������ٴε��ø÷�����ȡ�ڶ����ֽ�ʱ����������ֱ�ӽ��ֽ������еĵڶ����ֽڷ��أ���������ȥ��ȡ����������˶�ȡЧ�ʣ������˶�ȡ�Ĵ�����
		 */
		// System.out.println(Arrays.toString(bytes));// �������
		// System.out.println(new String(bytes));// ������ת��Ϊ�ַ�������
		// System.out.println(data);// ���ض�ȡ�����������ֽ���

		// byte[] bytes = new byte[1024];
		// System.out.println(new String(bytes));
		// System.out.println(new String(bytes, 0, 5));
		//
		// int len = fis.read(bytes, 0, 5);
		// System.out.println();

		byte[] bytes = new byte[1024];
		int len = -1;
		while ((len = fis.read(bytes)) != -1) {
			System.out.println(new String(bytes, 0, len));
		}

		// 4.�ر���
		fis.close();
	}

}
