/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileDemo2.java
* Copyright 2017-08-12 By Gnosis. Allright reserved.
* Time: 上午11:28:48
*/
package com.chinasofti.day23.file;

import java.io.File;

//文件的创建
public class FileDemo2 {

	public static void main(String[] args) {
		/*
		 * 在文件路径中：
		 * 在Windows下，默认情况下是不区分大小写的
		 * 在Unix下，严格区分大小写
		 */
		// File类是对文件系统的映射，并不是在硬盘上真实的文件，
		// 所以new File(XXX)只是在内存上创建了File的映射对象，而并不会在磁盘上创建文件，
		// 如果需要创建，就需要先判断该文件在内存中的映射是否存在，
		// file.exist()为true，存在，为false，说明该文件在磁盘中不存在，如不存在就可以创建该文件
		File f1 = new File("C:temp/b.cpp");
		System.out.println(f1);
		File f2 = new File("C:/temp", "b.cpp");
		System.out.println(f2);
		
		String uri = "C:/temp/";
		uri.replace("/", File.separator);
		File f3 = new File(uri, "b.cpp");
		System.out.println(f3);
	}

}
