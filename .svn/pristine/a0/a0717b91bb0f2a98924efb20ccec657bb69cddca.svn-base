/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ScannerDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: 下午3:48:30
*/
package com.chinasofti.day24.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws Exception {
		scanInput();
	}

	private static void scanInput() {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			String line = scan.next();
			System.out.println(line);
		}
	}

	private static void scanFile() throws FileNotFoundException {
		// D:/zf/stream/123.txt 绝对路径
		// 123.txt 相对路径
		File f = new File("abc.txt");
		// 1.创建Scanner对象
		Scanner scan = new Scanner(f);
		// 判断是否存在下一行
		while (scan.hasNextLine()) {// 判断是否存在下一行
			String data = scan.nextLine();// 取出当前行的数据
			System.out.println(data);
		}
	}

}
