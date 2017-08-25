/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileDemo3.java
* Copyright 2017-08-12 By Gnosis. Allright reserved.
* Time: ����1:42:23
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

	// ���Ŀ¼�����е�.txt�ļ�
	private static void test8() {
		File dir7 = new File("C:/temp");
		File[] listFiles = dir7.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// �жϵ�ǰ���������ļ�����.txt��β
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

	// �޸��ļ���
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

	// ��ʾ�ļ����������ļ�
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

	// File���еķ�������Ŀ¼����
	private static void test4() {
		/*
		 * boolean isDirectory()		�ж��Ƿ�ΪĿ¼
		 * boolean delete()				ɾ���ļ�
		 * boolean mkdir()				������ǰĿ¼��ֻ�ܴ���һ��Ŀ¼��
		 * boolean mkdirs()				������ǰĿ¼�Լ��ϼ�Ŀ¼
		 * String[] list()				�г����е��ļ�����Ŀ¼���ļ���
		 * File[] listFiles()			�г�Ŀ¼�е��ļ�����Ŀ¼�е��ļ�����
		 * boolean renameTo(File dest)	�����޸�����
		 * static File[] listRoots()	�г�ϵͳ�̷�
		 */
		// File dir = new File("C:/temp");
		// File f4 = new File(dir, "b.cpp");
		// System.out.println(dir.isDirectory());
		// System.out.println(f4.isDirectory());// �ж��Ƿ�ΪĿ¼
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

	// File���еķ��������ļ�����
	private static void test3() throws IOException {
		/*
		 * boolean isFile()				�ж��Ƿ�Ϊ�ļ�
		 * boolean delete()				ɾ���ļ�
		 * boolean createNewFile()		�������ļ�
		 * boolean exists()				�ж��ļ��Ƿ����
		 * boolean renameTo(File dest)	�����޸�����
		 */
		File file1 = new File("C:/temp/a.cpp");
		System.out.println(file1.isFile());
		// System.out.println(file1.delete());
		if (file1.createNewFile()) {
			System.out.println("�ļ������ɹ�");
		}
		System.out.println(file1.exists());
		System.out.println(file1.renameTo(new File("C:/temp/c.cpp")));
	}

	// File״̬�ķ���
	private static void test2() {
		/*
		 * boolean canExecute()		�ж��Ƿ��ǿ�ִ���ļ�
		 * boolean canRead()		�ж��ļ��Ƿ�ɶ�
		 * boolean canWrite()		�ж��ļ��Ƿ��д
		 * boolean isHidden()		�ж��ļ��Ƿ�����
		 * long lastModified()		�����ļ�����޸�ʱ��
		 * long length()			��ȡ�ļ�����
		 */
		File file1 = new File("C:/temp/a.cpp");
		System.out.println(file1.canExecute());
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		System.out.println(file1.isHidden());
		System.out.println(new Date(file1.lastModified()).toLocaleString());
		System.out.println(file1.length());
	}

	// ����File��·��������
	private static void test1() {
		File file1 = new File("C:/temp/b.cpp");
		System.out.println(file1.getAbsoluteFile()); // ��ȡ����·��
		System.out.println(file1.getAbsolutePath()); // ��ȡ����·��
		System.out.println(file1.getPath()); // ��ȡ�ļ�·������
		System.out.println(file1.getName()); // ��ȡ�ļ���
		System.out.println(file1.getParentFile()); // ��ȡ�ļ��ϼ�Ŀ¼
		System.out.println(file1.getParent()); // ��ȡ�ļ���Ŀ¼��·����
	}

}
