/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileBufferCharDemo.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: 上午9:50:34
*/
package com.chinasofti.day25.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferCharDemo {

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/temp/stream/c.txt", true));
		bw.write("我爱北京天安门");
		bw.write("天安门上太阳升");
		bw.flush();
		bw.close();

		// 字符缓冲输入流
		BufferedReader br = new BufferedReader(new FileReader("C:/temp/stream/b.txt"), 1024);
		char[] ch = new char[1024];
		int len = -1;
		while ((len = br.read(ch)) != -1) {
			System.out.println(new String(ch, 0, len));
		}

		// readLine()：一次读取一行
		// BufferedReader br = new BufferedReader(new
		// FileReader("C:/temp/stream/b.txt"), 1024);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
