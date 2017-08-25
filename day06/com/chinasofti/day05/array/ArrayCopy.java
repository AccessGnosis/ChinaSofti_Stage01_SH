/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ArrayCopy.java
* Copyright 2017-07-20 By Gnosis. Allright reserved.
* Time: обнГ3:12:59
*/
package com.chinasofti.day05.array;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] src = new int[] { 1, 2, 3 };
		int[] dest = new int[4];
		arraycopy(src, 1, dest, 2, 2);

		for (int i : dest) {
			System.out.println(i);
		}

		System.arraycopy(src, 0, dest, 0, 2);
		for (int i : dest) {
			System.out.println(i);
		}
	}

	private static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
		for (int i = srcPos; i < srcPos + length; ++i) {
			dest[destPos] = src[i];
			destPos++;
		}
	}
}
