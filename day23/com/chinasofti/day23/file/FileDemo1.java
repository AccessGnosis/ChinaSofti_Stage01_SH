/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileDemo01.java
* Copyright 2017-08-12 By Gnosis. Allright reserved.
* Time: ����10:58:09
*/
package com.chinasofti.day23.file;

import java.io.File;
import java.io.InputStream;

import javafx.stage.FileChooserBuilder;

public class FileDemo1 {

	public static void main(String[] args) {
		// ��ȡ���Էָ���
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		// ��ȡ·���ָ���
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);

		File file1 = new File("C:" + File.separator + "a.cpp");
		File file2 = new File("C:\\a.cpp");
		File file3 = new File("C:/a.cpp");
		System.out.println(file1);
		System.out.println(file2);
		System.out.println(file3);
	}
}
