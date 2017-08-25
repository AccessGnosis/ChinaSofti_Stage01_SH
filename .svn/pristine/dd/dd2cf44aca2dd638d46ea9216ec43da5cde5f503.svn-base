/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileWriterDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: 下午4:26:51
*/
package com.chinasofti.day24.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//演示文件字符输出流
public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		//1.创建目标文件
		File f = new File("C:/temp/stream/a.txt");
		//2.创建字符输出流的对象（输出管道）
		Writer out = new FileWriter(f);
		//3.具体的字符操作
		out.write("大龙耳聋", 0, 3);
		
		out.close();
	}

}
