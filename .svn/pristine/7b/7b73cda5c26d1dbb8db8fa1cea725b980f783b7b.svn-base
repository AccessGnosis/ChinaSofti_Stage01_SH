/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StreamCopyDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: 下午1:52:26
*/
package com.chinasofti.day24.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//验证使用字节流完成文件的复制操作
public class StreamCopyDemo {

	public static void main(String[] args) throws Exception {
		copyFile();
	}

	private static void copyFile() throws FileNotFoundException, IOException {
		// 1.创建源和目标文件
		File srcFile = new File("C:/temp/stream/a.txt");
		File destFile = new File("C:/temp/stream/a_123.txt");
		// 2.创建输入输出流对象
		InputStream in = new FileInputStream(srcFile);
		OutputStream out = new FileOutputStream(destFile);

		// 3.具体的读写操作
		byte[] bytes = new byte[1024];// 创建缓冲区，用来存储已经读取到的数据。
		int len = -1;// 返回-1表示文件读取完毕
		while ((len = in.read(bytes)) != -1) {
			System.out.println(new String(bytes));
			out.write(bytes, 0, len);
		}

		// 4.关闭流
		out.close();
		in.close();
	}

	private static void copyFile1() {
		// 1.创建源和目标文件
		File srcFile = new File("C:/temp/stream/a.txt");
		File destFile = new File("C:/temp/stream/a_123.txt");
		// try(需要自动关闭的资源)
		try (InputStream in = new FileInputStream(srcFile); OutputStream out = new FileOutputStream(destFile);) {
			// 3.具体的读写操作
			byte[] bytes = new byte[1024];// 创建缓冲区，用来存储已经读取到的数据。
			int len = -1;// 返回-1表示文件读取完毕
			while ((len = in.read(bytes)) != -1) {
				System.out.println(new String(bytes));
				out.write(bytes, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
