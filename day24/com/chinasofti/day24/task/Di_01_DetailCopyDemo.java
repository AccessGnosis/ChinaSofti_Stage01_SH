/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_01_DetailCopyDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: ����7:04:34
*/
package com.chinasofti.day24.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//��ҵ���ļ�����������������ָ��Ŀ¼��ָ���ļ���.java����ָ��Ŀ¼���ѿ�����ȥ�ļ�����չ����Ϊ.txt
public class Di_01_DetailCopyDemo {

	public static void main(String[] args) {
		File dir = new File("C:/temp/stream");
		File[] selectedFiles = selectFilesByExtension(dir, "java", false);
		File destDir = new File("C:/temp/dest_stream");
		if (copyFiles(selectedFiles, destDir)) {
			System.out.println("�ļ����Ƴɹ�");
		}
		if (refactorExName(destDir, "txt")) {
			System.out.println("�ļ��������ɹ�");
		}
	}

	/**
	 * ��ָ���ļ����µ��ļ���չ���� orgExname �޸�Ϊ newName
	 * @param destDir ָ���ļ���
	 * @param newName �޸ĺ�����չ��
	 * @return �ļ����Ƿ��޸ĳɹ�
	 */
	private static boolean refactorExName(File destDir, String newExname) {
		int count = 0;
		boolean tag = false;

		try {
			if (!destDir.isDirectory()) {
				return false;
			}

			File[] listFiles = destDir.listFiles();

			for (File file : listFiles) {
				String fileName = file.getName();
				String path = file.getPath();
				String newPath = path.substring(0, path.lastIndexOf(File.separator));
				String fileNameNoEx = fileName.substring(0, fileName.lastIndexOf(".") + 1);
				String fileNewName = fileNameNoEx + newExname;
				File newFile = new File(newPath, fileNewName);
				if (file.renameTo(newFile)) {
					count++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (count == destDir.listFiles().length) {
			tag = true;
		}

		return tag;
	}

	/**
	 * ��ѡ�����ļ������飩�����Ƶ�Ŀ���ļ�����
	 * @param selectedFiles ѡ�����ļ������飩
	 * @param destDir ���Ƶ�Ŀ���ļ�����
	 * @return ���Ƴɹ�����true�����򷵻�false
	 */
	private static boolean copyFiles(File[] files, File destDir) {
		boolean tag = false;
		// count�����ж��ļ��Ƿ�ȫ�����Ƴɹ�
		int count = 0;
		InputStream in = null;
		OutputStream out = null;

		// ���Ŀ¼�����ڣ��ȴ���
		if (!destDir.exists()) {
			destDir.mkdirs();
		}

		try {
			// ȡ���ļ������ļ�����·��
			for (int i = 0; i < files.length; ++i) {
				String fileName = files[i].getName();
				File destFile = new File(destDir, fileName);

				// ͨ���ֽ������и���
				in = new FileInputStream(files[i]);
				out = new FileOutputStream(destFile);

				int len = -1;
				byte[] buffer = new byte[1024];
				while ((len = in.read(buffer)) != -1) {
					out.write(buffer, 0, len);
				}
				count++;

				if (in != null)
					in.close();
				if (out != null)
					out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (count == files.length) {
			tag = true;
		}

		return tag;
	}

	/**
	 * ɸѡƥ����չ�����ļ�
	 * @param rootDir ָ������Ŀ¼
	 * @param exname ��չ��
	 * @param tag �Ƿ�ݹ��ļ����������ļ�
	 * @return ͨ����ָ��Ŀ¼�в��Ҷ�Ӧ��չ���ļ��������ļ����ϣ����飩
	 */
	private static File[] selectFilesByExtension(File rootDir, String exname, boolean tag) {
		File[] selected = null;

		// ͨ���ļ������������ļ�
		selected = rootDir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				boolean tag = false;
				// Ҫ���ж��Ƿ����ļ� listFiles[]�������г������ļ����ļ���
				File reDir = new File(dir, name);
				if (reDir.isFile()) {
					String fileName = reDir.getName();
					String getExname = fileName.substring(fileName.lastIndexOf(".") + 1);

					// �����ȡ��ȡ������չ�����û�ָ������չ����ͬ��selected
					if (getExname.equalsIgnoreCase(exname)) {
						tag = true;
					}
				}
				return tag;
			}
		});

		return selected;
	}
}