/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ArrayUtilTest.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: ÉÏÎç10:04:11
*/
package com.chinasofti.day06.util.array;

import java.util.List;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 5, 3, 4, 6, 9, 1, 4, 5, 2, 0, 1 };

		List<Integer> list = ArrayUtil.getIndex(arr, 5);
		for (int i : list) {
			System.out.print(i + "  ");
		}
		System.out.println();

		ArrayUtil.bubbleSort(arr);
		ArrayUtil.printArray(arr);
		ArrayUtil.reversePrint(arr);
		
		int index = ArrayUtil.binarySearch(arr, 5);
		System.out.println(index);
	}

}
