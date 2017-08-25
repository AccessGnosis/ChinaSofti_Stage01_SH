/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ArrayMaxMin.java
* Copyright 2017-07-19 By Gnosis. Allright reserved.
* Time: ÏÂÎç2:39:57
*/
package com.chinasofti.day05.array;

public class ArrayMaxMin {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 9, 5, 3, 1, 8 };

		int min = arr[0];
		int max = arr[0];

		for (int a : arr) {
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);

		System.out.println("------------------------------------");

		int[] result = getMaxMin(arr);
		System.out.println("max = " + result[0]);
		System.out.println("min = " + result[1]);

		System.out.println("------------------------------------");
		reversePrint(arr);
		System.out.println("------------------------------------");
		print(arr);
	}

	public static int[] getMaxMin(int[] arr) {
		int min = arr[0];
		int max = arr[0];

		for (int a : arr) {
			if (a > max) {
				max = a;
			} else if (a < min) {
				min = a;
			}
		}

		int result[] = new int[] { max, min };

		return result;
	}

	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static void reversePrint(int[] arr) {
		for (int i = arr.length - 1; i >= 0; --i) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}
