/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: BubbleSort.java
* Copyright 2017-07-20 By Gnosis. Allright reserved.
* Time: 下午4:08:49
*/
package com.chinasofti.day05.sort;

/**
 * 基本思路：
 * 对未排序的个元素从头到尾依次比较相邻的两个元素的大小关系
 * 若大则交换位置，经过一轮比较排序后可得到最大值，
 * 然后使用同样的方法把剩下的元素逐个比较即可。
 * 可以看出，若数组有N个元素，那么一共要进行N-1轮比较，第M轮比较的次数为N-M次
 * @author Administrator
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 4, 1, 3, 0, -1 };

		bubbleSort4(arr);
		printArray(arr);
	}

	private static void bubbleSort1(int[] arr) {
		for (int i = arr.length; i >= 0; --i) {
			for (int j = 1; j < i; ++j) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	private static void bubbleSort2(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 1; j < arr.length; ++j) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

	private static void bubbleSort3(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 1; j < arr.length - i; ++j) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}
	
	private static void bubbleSort4(int[] arr){
		for(int count = 1; count < arr.length; ++count){
			for(int index = 0; index < arr.length-count; ++index){
				if(arr[index] > arr[index+1]){
					int temp = arr[index];
					arr[index] = arr[index+1];
					arr[index+1] = temp;
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
