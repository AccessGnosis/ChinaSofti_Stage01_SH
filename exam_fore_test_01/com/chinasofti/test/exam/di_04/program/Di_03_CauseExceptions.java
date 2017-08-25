/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_03_CauseExceptions.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: ÏÂÎç7:59:39
*/
package com.chinasofti.test.exam.di_04.program;

public class Di_03_CauseExceptions {

	public static void main(String[] args) {
		String str = null;
		try {
			str.charAt(0);
		} catch (NullPointerException e) {
			System.out.println("²¶×½ NullPointerException");
		}

		try {
			String[] strs = new String[-1];
		} catch (NegativeArraySizeException e) {
			System.out.println("²¶×½ NegativeArraySizeException");
		}

		String[] strs = new String[1];
		try {
			strs[1] = "";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("²¶×½ ArrayIndexOutOfBoundsException");
		}
	}

}
