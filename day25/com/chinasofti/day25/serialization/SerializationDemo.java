/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SerializationDemo.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: ����4:22:10
*/
package com.chinasofti.day25.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import com.sun.corba.se.pept.encoding.InputObject;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("C:/temp/serialization/object.tmp");
		writeObject(file);// ���л�
		User user = readerObject(file);// �����л�
		System.out.println(user);
	}

	// �����л���������---->����
	// �����л��������Ѵ����ļ��еĶ������ݻ�������ڵ��ϵĶ������ݣ��ָ���java����Ĺ���
	private static User readerObject(File file) throws IOException, ClassNotFoundException {
		InputStream is = new FileInputStream(file);
		ObjectInput in = new ObjectInputStream(is);
		User user = (User) in.readObject();

		in.close();
		is.close();

		return user;
	}

	// ��������л�
	// ���л���������JVM���ڴ��е�java�������ݣ�ͨ��ĳ�ַ�ʽ�Ѷ���洢�������ļ���
	// ���ߣ����ݸ���������ڵ�
	private static void writeObject(File file) throws IOException {
		OutputStream os = new FileOutputStream(file);
		ObjectOutput out = new ObjectOutputStream(os);
		out.writeObject(new User("С��", "123456", 18));
		out.close();
		os.close();
	}

}
