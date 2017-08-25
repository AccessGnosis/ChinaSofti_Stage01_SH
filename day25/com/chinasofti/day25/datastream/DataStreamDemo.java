/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DataStreamDemo.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: ����5:23:39
*/
package com.chinasofti.day25.datastream;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class DataStreamDemo {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/temp/stream/data.txt");
//		write(file);
		read(file);
	}

	private static void read(File file) throws Exception {
		InputStream is = new FileInputStream(file);
		DataInput in = new DataInputStream(is);
//		System.out.println(in.readByte());
//		System.out.println(in.readChar());
		System.out.println(in.readUTF());
	}

	private static void write(File file) throws Exception {
		OutputStream os = new FileOutputStream(file);
		DataOutputStream out = new DataOutputStream(os);

//		out.writeByte(66);// byte
//		out.write('��');// char
		out.writeUTF("�й�");// String��UTF-8��
		// UTF-8�����ʽ��String�ַ�����ʾ�ֽڶ��2��

		out.close();
	}

}
