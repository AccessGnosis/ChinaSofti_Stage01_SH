/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InputStreamDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: 上午11:07:19
*/
package com.chinasofti.day24.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamDemo {

	public static void main(String[] args) throws Exception {
		// 1.创建源对象（挖井）
		File file = new File("C:/temp/stream/a.txt");
		// 2.创建文件字节输入流对象，并接在源上
		InputStream fis = new FileInputStream(file);
		// 3.具体的读取操作
		/*
		 * int read()				从此输入流中读取一个数据字节
		 * int read(byte[] b)		从此输入流中将最多b.length个字节的数据读入一个byte数组中
		 * int read(byte[] b, int off, int len)	从此输入流中将最多len个字节的数据读入一个byte的数组中
		 */
		// int data = fis.read();
		// System.out.println(data);
		// System.out.println((char) data);

		// byte[] bytes = new byte[1024];
		// int data = fis.read(bytes);// 返回读取到缓存区的字节数
		/*
		 * 缓存区：
		 * 	缓冲流 int read(byte[] bytes)方法：
		 * 		实际上缓冲流会让其处理的流一次性读取一组字节回来，并存入到自身提供的字节数组中（缓存区），然后将第一个字节返回，
		 * 	这样的好处：当我们再次调用该方法读取第二个字节时，缓冲流会直接将字节数组中的第二个字节返回，而不是再去读取，所以提高了读取效率，减少了读取的次数。
		 */
		// System.out.println(Arrays.toString(bytes));// 输出数组
		// System.out.println(new String(bytes));// 把数组转变为字符串对象
		// System.out.println(data);// 返回读取到缓存区的字节数

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

		// 4.关闭流
		fis.close();
	}

}
