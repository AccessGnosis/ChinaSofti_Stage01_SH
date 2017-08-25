/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringsUtils.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: 下午8:24:42
*/
package com.chinasofti.day13.guessgame;

public class StringsUtils {
	public static String getRamdomChars() {
		StringBuffer rdmstr = new StringBuffer(Game.RDM_CHAR_NUMS);
		char[] chs = new char[26];
		boolean[] flags = new boolean[chs.length];

		// 生成a~z所有字母到chs数组中
		for (int i = 97; i < (chs.length + 97); ++i) {
			chs[i - 97] = (char) i;
		}

		// 生成随机生成的字母
		for (int i = 0; i < Game.RDM_CHAR_NUMS; ++i) {
			int rdm = (int) (Math.random() * 26);
			if (flags[rdm]) {
				--i;
				continue;
			} else {
				rdmstr.append(chs[rdm]);
				flags[rdm] = true;
			}
		}

		return rdmstr.toString();
	}

	public static void printArray(char[] arr) {
		for (char o : arr) {
			System.out.print(o + " ");
		}
	}

	public static boolean comparedFullStrings(String userinput, String getRamdomChars) {
		getRamdomChars = getRamdomChars.trim().toLowerCase();
		userinput = userinput.trim().toLowerCase();
		if (userinput.equals(getRamdomChars)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean compareStrings(String userinput, String getRamdomChars) {
		getRamdomChars = getRamdomChars.trim().toLowerCase();
		userinput = userinput.trim().toLowerCase();
		int comparepos = comparePos(userinput, getRamdomChars);
		int compareactnums = compareActNums(userinput, getRamdomChars);

		System.out.println("=======================================");
		System.out.println("位置对" + comparepos + "个");
		System.out.println("字母对" + compareactnums + "个");
		System.out.println("=======================================");

		return true;
	}

	private static int comparePos(String userinput, String getRamdomChars) {
		int count = 0;
		for (int i = 0; i < userinput.length(); ++i) {
			if (userinput.charAt(i) == getRamdomChars.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	private static int compareActNums(String userinput, String getRamdomChars) {
		int count = 0;

		for (int i = 0; i < userinput.length(); ++i) {
			for (int j = 0; j < getRamdomChars.length(); ++j) {
				if (userinput.charAt(i) == getRamdomChars.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}

}
