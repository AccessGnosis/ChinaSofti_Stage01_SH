/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileDemo3.java
* Copyright 2017-08-12 By Gnosis. Allright reserved.
* Time: 下午1:42:23
*/
package com.chinasofti.day23.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		// test1();
		// test2();
		// test3();
		// createMultiDir();
		// test4();
		// test5();
		// test6();
		// test7();
		// test8();
		// test9();
		test10();
	}

	private static void test10() {
		File dir8 = new File("C:/temp");
		String videoExts = "avi,mp4,rmvb";
		List<String> exts = Arrays.asList(videoExts.split(","));
		File[] fs = dir8.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				boolean tag = false;

				int index = name.lastIndexOf(".");

				String ext = name.substring(index + 1);
				return exts.contains(ext);
			}
		});
		for (File file : fs) {
			System.out.println(file.getName());

		}
	}

	private static void test9() {
		File dir7 = new File("C:/temp");
		File[] listFiles = dir7.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (new File(dir, name).isFile() && (name.endsWith(".mp4") | name.endsWith(".avi"))) {
					return true;
				} else {
					return false;
				}
			}
		});
		for (File file : listFiles) {
			System.out.println(file);

		}
	}

	// 输出目录下所有的.txt文件
	private static void test8() {
		File dir7 = new File("C:/temp");
		File[] listFiles = dir7.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// 判断当前对象是以文件且以.txt结尾
				if (new File(dir, name).isFile() && name.endsWith(".txt")) {
					return true;
				} else {
					return false;
				}
			}
		});
		for (File file : listFiles) {
			System.out.println(file);

		}

	}

	// 修改文件名
	private static void test7() {
		File dir6 = new File("C:/temp");
		File[] subs = dir6.listFiles();
		String str = "c";
		for (File sub : subs) {
			System.out.println(sub);
			if (sub.getName().contains(str)) {
				String newName = sub.getName().replace(str, "cc");
				sub.renameTo(new File(dir6, newName));
			}
		}
	}

	// 显示文件夹下所有文件
	private static void test6() {
		File dir5 = new File("C:/temp");
		listAllFiles(dir5);
	}

	private static void listAllFiles(File file) {
		System.out.println(file);
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File list : listFiles) {
				listAllFiles(list);
			}
		}
	}

	private static void test5() {
		File dir4 = new File("C:/temp");
		File[] listFiles = dir4.listFiles();
		System.out.println(Arrays.toString(listFiles));
		String[] list = dir4.list();
		System.out.println(Arrays.toString(list));
		File[] listRoots = File.listRoots();
		System.out.println(Arrays.toString(listRoots));
	}

	private static void createMultiDir() {
		File file = new File("C:/temp/a/b/c/d/e/f/g/h");
		file.mkdirs();
	}

	// File类中的方法——目录操作
	private static void test4() {
		/*
		 * boolean isDirectory()		判断是否为目录
		 * boolean delete()				删除文件
		 * boolean mkdir()				创建当前目录（只能创建一级目录）
		 * boolean mkdirs()				创建当前目录以及上级目录
		 * String[] list()				列出所有的文件名（目录和文件）
		 * File[] listFiles()			列出目录中的文件对象（目录中的文件名）
		 * boolean renameTo(File dest)	重新修改名称
		 * static File[] listRoots()	列出系统盘符
		 */
		// File dir = new File("C:/temp");
		// File f4 = new File(dir, "b.cpp");
		// System.out.println(dir.isDirectory());
		// System.out.println(f4.isDirectory());// 判断是否为目录
		// File dir1 = new File("C:/temp/demo");
		// System.out.println(dir1.mkdir());
		// File dir2 = new File("C:/temp/");
		// System.out.println(dir2.mkdirs());
		// System.out.println(dir1.delete());
		// System.out.println(new File("C:/temp/demo1").delete());
		File dir3 = new File("C:/temp/a");
		deleteAll(dir3);
	}

	private static void deleteAll(File file) {
		if (file.isDirectory()) {
			for (File file2 : file.listFiles()) {
				deleteAll(file2);
			}
		}
		file.delete();
	}

	// File类中的方法——文件操作
	private static void test3() throws IOException {
		/*
		 * boolean isFile()				判断是否为文件
		 * boolean delete()				删除文件
		 * boolean createNewFile()		创建新文件
		 * boolean exists()				判断文件是否存在
		 * boolean renameTo(File dest)	重新修改名称
		 */
		File file1 = new File("C:/temp/a.cpp");
		System.out.println(file1.isFile());
		// System.out.println(file1.delete());
		if (file1.createNewFile()) {
			System.out.println("文件创建成功");
		}
		System.out.println(file1.exists());
		System.out.println(file1.renameTo(new File("C:/temp/c.cpp")));
	}

	// File状态的方法
	private static void test2() {
		/*
		 * boolean canExecute()		判断是否是可执行文件
		 * boolean canRead()		判断文件是否可读
		 * boolean canWrite()		判断文件是否可写
		 * boolean isHidden()		判断文件是否隐藏
		 * long lastModified()		返回文件最后修改时间
		 * long length()			获取文件长度
		 */
		File file1 = new File("C:/temp/a.cpp");
		System.out.println(file1.canExecute());
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		System.out.println(file1.isHidden());
		System.out.println(new Date(file1.lastModified()).toLocaleString());
		System.out.println(file1.length());
	}

	// 操作File的路径和名称
	private static void test1() {
		File file1 = new File("C:/temp/b.cpp");
		System.out.println(file1.getAbsoluteFile()); // 获取绝对路径
		System.out.println(file1.getAbsolutePath()); // 获取绝对路径
		System.out.println(file1.getPath()); // 获取文件路径名称
		System.out.println(file1.getName()); // 获取文件名
		System.out.println(file1.getParentFile()); // 获取文件上级目录
		System.out.println(file1.getParent()); // 获取文件父目录的路径名
	}

}
