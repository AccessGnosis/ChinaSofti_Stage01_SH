/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: OutputStreamDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: ����10:02:52
*/
package com.chinasofti.day24.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

//��֤���������д��
public class OutputStreamDemo {

	public static void main(String[] args) throws Exception {
		String data = "Hello, С��";

		// 1.�����ļ���Ҫ�������ݵ��ļ���
		File file = new File("C:/temp/stream/a.txt");
		// 2.�����ļ��ֽ���������󣨹ܵ���
		// FileOutputStream(file, true/false)
		// ���ڶ���������дĬ�ϵڶ�����Ϊfalse����Ϊ���ǣ����ڶ�������Ϊtrue����Ϊ׷��
		OutputStream fos = new FileOutputStream(file);
		/*
		 * void write(byte[] b)						��b�����е������ֽ�д�뵽�ļ���
		 * void write(byte[] b, int off, int len)	��ָ��byte�����д�ƫ����off��ʼ��len���ֽ�д���������
		 * abstract void write(int b)				��һ���ֽ�д���ļ���
		 */
		// 3.�����д������
		// fos.write(65);
		// byte[] bytes = {65, 66, 67, 68, 69, 97, 98, 99};
		// fos.write(bytes);
		String str = "Hello, С��";
		// String�ַ�������һ������getBytes()�ܽ��ַ���ת��Ϊbyte[]
		// fos.write("Hello, С��".getBytes());
		fos.write(str.getBytes(), 0, 5);
		// 4.�ͷ���Դ
		fos.close();

	}

}
