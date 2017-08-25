/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_01_DetailCopyDemo.java
* Copyright 2017-08-14 By Gnosis. Allright reserved.
* Time: 下午7:04:34
*/
package com.chinasofti.day24.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//作业：文件拷贝案例——拷贝指定目录的指定文件（.java）到指定目录，把拷贝过去文件的拓展名改为.txt
public class Di_01_DetailCopyDemo {

	public static void main(String[] args) {
		File dir = new File("C:/temp/stream");
		File[] selectedFiles = selectFilesByExtension(dir, "java", false);
		File destDir = new File("C:/temp/dest_stream");
		if (copyFiles(selectedFiles, destDir)) {
			System.out.println("文件复制成功");
		}
		if (refactorExName(destDir, "txt")) {
			System.out.println("文件重命名成功");
		}
	}

	/**
	 * 将指定文件夹下的文件拓展名从 orgExname 修改为 newName
	 * @param destDir 指定文件夹
	 * @param newName 修改后新拓展名
	 * @return 文件名是否修改成功
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
	 * 将选出的文件（数组），复制到目标文件夹中
	 * @param selectedFiles 选出的文件（数组）
	 * @param destDir 复制到目标文件夹中
	 * @return 复制成功返回true，否则返回false
	 */
	private static boolean copyFiles(File[] files, File destDir) {
		boolean tag = false;
		// count用来判断文件是否全部复制成功
		int count = 0;
		InputStream in = null;
		OutputStream out = null;

		// 如果目录不存在，先创建
		if (!destDir.exists()) {
			destDir.mkdirs();
		}

		try {
			// 取出文件名和文件所在路径
			for (int i = 0; i < files.length; ++i) {
				String fileName = files[i].getName();
				File destFile = new File(destDir, fileName);

				// 通过字节流进行复制
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
	 * 筛选匹配拓展名的文件
	 * @param rootDir 指定查找目录
	 * @param exname 拓展名
	 * @param tag 是否递归文件夹下所有文件
	 * @return 通过在指定目录中查找对应拓展名文件，返回文件集合（数组）
	 */
	private static File[] selectFilesByExtension(File rootDir, String exname, boolean tag) {
		File[] selected = null;

		// 通过文件过滤器过滤文件
		selected = rootDir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				boolean tag = false;
				// 要先判断是否是文件 listFiles[]方法会列出包括文件和文件夹
				File reDir = new File(dir, name);
				if (reDir.isFile()) {
					String fileName = reDir.getName();
					String getExname = fileName.substring(fileName.lastIndexOf(".") + 1);

					// 如果获取截取到的拓展名和用户指定的拓展名相同，selected
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