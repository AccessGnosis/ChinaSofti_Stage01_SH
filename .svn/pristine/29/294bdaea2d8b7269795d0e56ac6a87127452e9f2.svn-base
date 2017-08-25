/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: URLDemo.java
* Copyright 2017-08-17 By Gnosis. Allright reserved.
* Time: 上午10:43:39
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
		// 创建一个URL对象（协议：ip：端口：文件）
		URL url = new URL("http", "localhost", 8080, "/index.jsp");
		System.out.println(url);
		// 创建URLConnection对象，打开url连接对象
		URLConnection conn = url.openConnection();
		System.out.println(conn);
		// String getContextType 获取资源文件的MIME类型(文件的类型)
		System.out.println(conn.getContentType());
		//网络中数据的传递-->输入-->程序中
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
