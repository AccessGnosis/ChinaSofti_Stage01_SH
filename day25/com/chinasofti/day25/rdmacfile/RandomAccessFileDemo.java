/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: RandomAccessFileDemo.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: 下午5:45:44
*/
package com.chinasofti.day25.rdmacfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws Exception {
		File f = new File("C:/temp/stream/bbzz.txt");
		write(f);
		read(f);
	}

	private static void read(File f) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		System.out.println(raf.readInt());
		System.out.println("文件指针的位置：" + raf.getFilePointer());
		System.out.println(raf.readChar());
		// System.out.println(raf.readUTF());
		raf.seek(0);// 设置文件指针为0
		raf.skipBytes(12);//设置跳过4个字节
		System.out.println("文件指针的位置：" + raf.getFilePointer());
		raf.close();
	}

	private static void write(File f) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		raf.writeByte(66);
		raf.writeChar(97);
		raf.writeInt(12);
		raf.writeUTF("北京天安门");
		raf.writeUTF("太阳升");
		raf.close();
	}

}
