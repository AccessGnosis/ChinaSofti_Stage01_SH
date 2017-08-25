/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringsUtils.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: ����8:24:42
*/
package com.chinasofti.day13.guessgame;

public class StringsUtils {
	public static String getRamdomChars() {
		StringBuffer rdmstr = new StringBuffer(Game.RDM_CHAR_NUMS);
		char[] chs = new char[26];
		boolean[] flags = new boolean[chs.length];

		// ����a~z������ĸ��chs������
		for (int i = 97; i < (chs.length + 97); ++i) {
			chs[i - 97] = (char) i;
		}

		// ����������ɵ���ĸ
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
		System.out.println("λ�ö�" + comparepos + "��");
		System.out.println("��ĸ��" + compareactnums + "��");
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
