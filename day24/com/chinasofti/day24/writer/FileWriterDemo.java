/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileWriterDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: ����4:26:51
*/
package com.chinasofti.day24.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//��ʾ�ļ��ַ������
public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		//1.����Ŀ���ļ�
		File f = new File("C:/temp/stream/a.txt");
		//2.�����ַ�������Ķ�������ܵ���
		Writer out = new FileWriter(f);
		//3.������ַ�����
		out.write("��������", 0, 3);
		
		out.close();
	}

}
