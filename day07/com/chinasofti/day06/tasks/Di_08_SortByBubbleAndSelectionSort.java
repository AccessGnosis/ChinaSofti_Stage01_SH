/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_08_SortByBubbleAndSelectionSort.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: ÉÏÎç11:34:05
*/
package com.chinasofti.day06.tasks;

public class Di_08_SortByBubbleAndSelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 9, 7, 6, 3, 4, 2 };
		
//		BubbleSort(arr);
		SelectionSort(arr);
		printArray(arr);
	}

	private static void BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - i - 1; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	private static void SelectionSort(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i; j < arr.length; ++j) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}
}
