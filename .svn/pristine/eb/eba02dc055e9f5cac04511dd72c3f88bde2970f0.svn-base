/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileBufferCopy.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: ÉÏÎç10:13:24
*/
package com.chinasofti.day25.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileBufferCopy {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader(new File("C:/temp/stream/a.txt"));
		Writer writer = new FileWriter(new File("C:/temp/stream/dddd_dddd.txt"));

		BufferedReader br = new BufferedReader(reader);
		BufferedWriter bw = new BufferedWriter(writer);

		String len = null;
		while ((len = br.readLine()) != null) {
			bw.write(len);
			bw.flush();
		}
		
		bw.close();
		br.close();

	}

}
