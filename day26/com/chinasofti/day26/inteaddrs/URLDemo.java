/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: URLDemo.java
* Copyright 2017-08-17 By Gnosis. Allright reserved.
* Time: ����10:43:39
*/
package com.chinasofti.day26.inteaddrs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class URLDemo {

	public static void main(String[] args) throws Exception {
		// ����һ��URL����Э�飺ip���˿ڣ��ļ���
		URL url = new URL("http", "localhost", 8080, "/index.jsp");
		System.out.println(url);
		// ����URLConnection���󣬴�url���Ӷ���
		URLConnection conn = url.openConnection();
		System.out.println(conn);
		// String getContextType ��ȡ��Դ�ļ���MIME����(�ļ�������)
		System.out.println(conn.getContentType());
		//���������ݵĴ���-->����-->������
		InputStream input = conn.getInputStream();
		File file = new File("C:/temp/index.jsp");
//		PrintWriter out = new PrintWriter(file);
		Scanner scan = new Scanner(input);
//		while(scan.hasNextLine()){
//			String nextLine = scan.nextLine();
//			System.out.println(nextLine);
//			out.print(nextLine);
//		}
//		out.close();
//		scan.close();
		
		Files.copy(input, Paths.get(new File("temp/index.jsp").toURI()));
		input.close();
		
	}

}
