/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileReader.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: ÏÂÎç4:33:16
*/
package com.chinasofti.day24.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopyDemo {

	public static void main(String[] args) throws Exception {
		File srcFile = new File("C:/temp/stream/a.txt");
		File destFile = new File("C:/temp/stream/b.txt");
		Reader reader = new FileReader(srcFile);
		Writer writer = new FileWriter(destFile);

		int len = -1;
		char[] cbuf = new char[1024];
		while ((len = reader.read(cbuf)) != -1) {
			writer.write(new String(cbuf, 0, len), 0, len);
		}
		
		writer.close();
		reader.close();
	}

}
