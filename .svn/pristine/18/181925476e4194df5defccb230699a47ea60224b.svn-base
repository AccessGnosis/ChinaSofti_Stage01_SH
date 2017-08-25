/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SelectionSort.java
* Copyright 2017-07-20 By Gnosis. Allright reserved.
* Time: 下午5:07:24
*/
package com.chinasofti.day05.sort;

/**
 * 基本思路： 选择某个索引位置的元素，然后和后面的元素依次比较， 若大于则交换位置，经过第一轮比较排序后可得出最小值，
 * 然后使用同样的方法把剩下的元素逐个比较即可。
 * 
 * @author Administrator
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 9, 6, 7, 4, 1 };
		selectionSort1(arr);
		printArray(arr);
	}

	private static void selectionSort1(int[] arr) {
		for (int count = 0; count < arr.length - 1; ++count) {
			for (int index = count + 1; index < arr.length; ++index) {
				if (arr[count] > arr[index]) {
					int temp = arr[count];
					arr[count] = arr[index];
					arr[index] = temp;
				}
			}
		}
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
