/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StreamCopyDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: ����1:52:26
*/
package com.chinasofti.day24.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//��֤ʹ���ֽ�������ļ��ĸ��Ʋ���
public class StreamCopyDemo {

	public static void main(String[] args) throws Exception {
		copyFile();
	}

	private static void copyFile() throws FileNotFoundException, IOException {
		// 1.����Դ��Ŀ���ļ�
		File srcFile = new File("C:/temp/stream/a.txt");
		File destFile = new File("C:/temp/stream/a_123.txt");
		// 2.�����������������
		InputStream in = new FileInputStream(srcFile);
		OutputStream out = new FileOutputStream(destFile);

		// 3.����Ķ�д����
		byte[] bytes = new byte[1024];// �����������������洢�Ѿ���ȡ�������ݡ�
		int len = -1;// ����-1��ʾ�ļ���ȡ���
		while ((len = in.read(bytes)) != -1) {
			System.out.println(new String(bytes));
			out.write(bytes, 0, len);
		}

		// 4.�ر���
		out.close();
		in.close();
	}

	private static void copyFile1() {
		// 1.����Դ��Ŀ���ļ�
		File srcFile = new File("C:/temp/stream/a.txt");
		File destFile = new File("C:/temp/stream/a_123.txt");
		// try(��Ҫ�Զ��رյ���Դ)
		try (InputStream in = new FileInputStream(srcFile); OutputStream out = new FileOutputStream(destFile);) {
			// 3.����Ķ�д����
			byte[] bytes = new byte[1024];// �����������������洢�Ѿ���ȡ�������ݡ�
			int len = -1;// ����-1��ʾ�ļ���ȡ���
			while ((len = in.read(bytes)) != -1) {
				System.out.println(new String(bytes));
				out.write(bytes, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
