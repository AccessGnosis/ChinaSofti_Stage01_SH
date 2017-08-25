/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ScannerDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: ����3:48:30
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
		// D:/zf/stream/123.txt ����·��
		// 123.txt ���·��
		File f = new File("abc.txt");
		// 1.����Scanner����
		Scanner scan = new Scanner(f);
		// �ж��Ƿ������һ��
		while (scan.hasNextLine()) {// �ж��Ƿ������һ��
			String data = scan.nextLine();// ȡ����ǰ�е�����
			System.out.println(data);
		}
	}

}
