/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CharStreamToByteStream.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: 下午5:12:01
*/
package com.chinasofti.day24.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamToByteStream {

	public static void main(String[] args) throws Exception {
		File srcFile = new File("C:/temp/stream/a.txt");
		File destFile = new File("C:/temp/stream/a_a.txt");
		// 准备字节输入输出流对象
		InputStream in = new FileInputStream(srcFile);
		OutputStream out = new FileOutputStream(destFile);
		// 字符输入输出流对象
		Reader reader = new InputStreamReader(in);
		Writer writer = new OutputStreamWriter(out);
		// 具体的读写操作
		char[] buffer = new char[2];
		int len = -1;
		while ((len = reader.read(buffer)) != -1) {
			System.out.println(new String(buffer, 0, len));
//			writer.write(new String(buffer, 0, len));
			writer.write(buffer, 0, len);
			writer.flush();
		}

		in.close();
		out.close();
		// reader.close();
		// writer.close();
	}

}
