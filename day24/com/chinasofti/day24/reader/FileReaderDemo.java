/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileReader.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: ÏÂÎç4:33:16
*/
package com.chinasofti.day24.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/temp/stream/a.txt");
		Reader reader = new FileReader(file);
		int len = -1;
		char[] cbuf = new char[1024];
		while ((len = reader.read(cbuf)) != -1) {
			System.out.print(new String(cbuf, 0, len));
		}
		reader.close();
	}

}
