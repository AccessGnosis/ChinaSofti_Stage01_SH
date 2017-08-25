/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_12_BinarySearch.java
* Copyright 2017-07-24 By Gnosis. Allright reserved.
* Time: обнГ9:56:48
*/
package com.chinasofti.day06.tasks;

public class Di_12_BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 9, 7, 6, 3, 4, 2 };
		int index = binarySearch(arr, 4);
		System.out.println(index);
	}

	public static int binarySearch(int[] arr, int key) {
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int midVal = arr[mid];

			if (midVal < key) {
				low = mid + 1;
			} else if (midVal > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
