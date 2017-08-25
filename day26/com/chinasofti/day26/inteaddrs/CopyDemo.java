/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CopyDemo.java
* Copyright 2017-08-17 By Gnosis. Allright reserved.
* Time: 上午11:04:52
*/
package com.chinasofti.day26.inteaddrs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyDemo {

	public static void main(String[] args) throws Exception {
		// test1();
		InputStream in = new FileInputStream("ch.txt");
		URI uri = new File("cchh.txt").toURI();
		Path path = Paths.get(uri);// Paths:路径的获取
		Files.copy(in, path);
	}

	private static void test1() throws FileNotFoundException, IOException {
		String src = "ch.txt";
		String dest = "chh.txt";

		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);

		byte[] b = new byte[5];
		int len = -1;
		while ((len = in.read(b)) != -1) {
			out.write(b);
		}
		in.close();
		out.close();
	}

}
