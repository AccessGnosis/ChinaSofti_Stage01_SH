/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CalcTime.java
* Copyright 2017-07-29 By Gnosis. Allright reserved.
* Time: ионГ11:08:56
*/
package com.chinasofti.day11.caltime;

public class CalcTime {
	public static final int NUM_LENGTH = 100000;

	public static void main(String[] args) {
		System.out.println(getTime("int"));
		System.out.println(getTime("char"));
	}

	public static void sumNum(int sumNum) {
		sumNum = 0;

		for (int i = 0; i < NUM_LENGTH; ++i) {
			sumNum += i;
		}

		return;
	}

	public static void sumChar(char sumChar) {
		sumChar = 'a';

		for (int i = 0; i < NUM_LENGTH; ++i) {
			sumChar += (char) i;
		}
	}

	public static long getTime(String str) {
		if (str.equals("int")) {
			long start = System.currentTimeMillis();
			sumNum(0);
			long end = System.currentTimeMillis();
			return (end - start);
		} else if (str.equals("char")) {
			long start = System.currentTimeMillis();
			sumChar('a');
			long end = System.currentTimeMillis();
			return (end - start);
		}
		return 0;
	}
}
