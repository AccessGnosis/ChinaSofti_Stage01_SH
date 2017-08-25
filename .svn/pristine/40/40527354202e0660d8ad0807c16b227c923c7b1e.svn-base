/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileBufferStreamDemo.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: 上午9:08:57
*/
package com.chinasofti.day25.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileBufferStreamDemo {

	public static void main(String[] args) throws Exception {
//		buferopStream();
		File file = new File("C:/temp/stream/c.txt");
		InputStream in = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(in);
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = bis.read(buffer))!=-1){
			System.out.print(new String(buffer, 0, len));
		}
		bis.close();
		
	}

	private static void buferopStream() throws FileNotFoundException, IOException {
		// 创建源文件
		File file = new File("C:/temp/stream/c.txt");
		// 创建流对象
		OutputStream out = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		// 具体的写操作
		bos.write("abcd".getBytes());

		bos.close();
	}

}
