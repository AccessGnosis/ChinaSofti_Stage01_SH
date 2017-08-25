/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_11_GetEIndex.java
* Copyright 2017-07-24 By Gnosis. Allright reserved.
* Time: обнГ9:50:24
*/
package com.chinasofti.day06.tasks;

public class Di_11_GetEIndex {

	static final int ERROR = -1;

	public static void main(String[] args) {
		char[] chs = new char[] { 'h', 'e', 'l', 'l', 'o' };
		char key = 'e';
		int[] indexs = new int[chs.length];

		for (int i = 0; i < chs.length; ++i) {
			indexs[i] = ERROR;
			if (chs[i] == key) {
				indexs[i] = i;
			}
		}

		for (int index : indexs) {
			if (index != ERROR) {
				System.out.print(index + " ");
			}
		}
	}

}
