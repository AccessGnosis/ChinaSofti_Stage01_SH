/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: OutputStreamDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: 上午10:02:52
*/
package com.chinasofti.day24.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

//验证输出流——写出
public class OutputStreamDemo {

	public static void main(String[] args) throws Exception {
		String data = "Hello, 小龙";

		// 1.创建文件（要保存数据的文件）
		File file = new File("C:/temp/stream/a.txt");
		// 2.创建文件字节输出流对象（管道）
		// FileOutputStream(file, true/false)
		// 若第二个参数不写默认第二参数为false，意为覆盖，若第二个参数为true，意为追加
		OutputStream fos = new FileOutputStream(file);
		/*
		 * void write(byte[] b)						把b数组中的所有字节写入到文件中
		 * void write(byte[] b, int off, int len)	将指定byte数组中从偏移量off开始的len个字节写入此输入流
		 * abstract void write(int b)				把一个字节写到文件中
		 */
		// 3.具体的写出操作
		// fos.write(65);
		// byte[] bytes = {65, 66, 67, 68, 69, 97, 98, 99};
		// fos.write(bytes);
		String str = "Hello, 小龙";
		// String字符串中有一个方法getBytes()能将字符串转变为byte[]
		// fos.write("Hello, 小龙".getBytes());
		fos.write(str.getBytes(), 0, 5);
		// 4.释放资源
		fos.close();

	}

}
