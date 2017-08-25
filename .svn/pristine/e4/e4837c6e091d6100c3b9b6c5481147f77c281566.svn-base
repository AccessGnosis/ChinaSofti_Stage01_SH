/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DichotomySort.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: 上午9:07:27
*/
package com.chinasofti.day06.sort;

public class DichotomySort {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(binarySearch(arr, 6));
	}

	public static int guessIndex(int[] arr, int value) {
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1234;
	}

	public static int binarySearch(int[] arr, int key) {
		int low = 0; // 表示最小的索引
		int high = arr.length - 1; // 表示最大的索引

		while (low <= high) {
			int mid = (low + high) / 2; // 表示中间索引
			int midVal = arr[mid];

			if (midVal < key) { // 猜小了
				low = mid + 1; // 中间索引右移一位
			} else if (midVal > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	private static boolean searchArray(int[] arr, int value) {
		for (int i : arr) {
			if (value == i) {
				return true;
			}
		}
		return false;
	}

}
