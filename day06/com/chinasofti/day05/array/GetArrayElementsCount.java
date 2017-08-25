/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: GetArrayElementsCount.java
* Copyright 2017-07-20 By Gnosis. Allright reserved.
* Time: ÏÂÎç2:13:56
*/
package com.chinasofti.day05.array;

public class GetArrayElementsCount {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 9, 5, 3, 1, 8, 5, 4, 2 };
		int[][] price = new int[][] { { 1, 3, 5, 4, 1 }, { 2, 6, 9, 7, 8 }, { 1, 6, 0, 5 } };

		System.out.println(getElementsCount(arr));
		System.out.println(getSum(arr));

		System.out.println(getElementsCount(price));
		System.out.println(getSum(price));

		System.out.println(getSum2(4, 9, 5, 3, 1, 8, 5, 4, 2));
		System.out.println(getSum2(arr));
	}

	public static int getElementsCount(Object arr) {
		int count = 0;
		if (arr instanceof int[]) {
			for (int i : (int[]) arr) {
				count++;
			}
		} else if (arr instanceof int[][]) {
			for (int[] i : (int[][]) arr) {
				for (int j : i) {
					count++;
				}
			}
		}
		return count;
	}

	public static int getSum(Object arr) {
		int sum = 0;

		if (arr instanceof int[]) {
			for (int i : (int[]) arr) {
				sum += i;
			}
		} else if (arr instanceof int[][]) {
			for (int[] i : (int[][]) arr) {
				for (int j : i) {
					sum += j;
				}
			}
		}

		return sum;
	}

	public static int getSum2(int... arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
}
