/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: PrintDemo.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: 上午11:24:56
*/
package com.chinasofti.day25.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

//演示打印流
public class PrintDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:/temp/stream/xiqi.txt");
		OutputStream out = new FileOutputStream(f);
		PrintStream ps = new PrintStream(out);
		
		ps.print(true);
		ps.print("aaa");
		ps.println("bbb");
		ps.println("bbb");
		ps.println("123");
		ps.println("123");
		ps.println("123");
		ps.println("123");
		ps.flush();
		ps.close();
	}

}
