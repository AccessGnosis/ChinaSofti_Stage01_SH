/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SerializationDemo.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: 下午4:22:10
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
		writeObject(file);// 序列化
		User user = readerObject(file);// 反序列化
		System.out.println(user);
	}

	// 反序列化，二进制---->对象
	// 反序列化操作：把磁盘文件中的对象数据或者网络节点上的对象数据，恢复成java对象的过程
	private static User readerObject(File file) throws IOException, ClassNotFoundException {
		InputStream is = new FileInputStream(file);
		ObjectInput in = new ObjectInputStream(is);
		User user = (User) in.readObject();

		in.close();
		is.close();

		return user;
	}

	// 对象的序列化
	// 序列化操作，把JVM堆内存中的java对象数据，通过某种方式把对象存储到磁盘文件中
	// 或者，传递给其他网络节点
	private static void writeObject(File file) throws IOException {
		OutputStream os = new FileOutputStream(file);
		ObjectOutput out = new ObjectOutputStream(os);
		out.writeObject(new User("小龙", "123456", 18));
		out.close();
		os.close();
	}

}
