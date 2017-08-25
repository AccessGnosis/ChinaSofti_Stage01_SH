/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: BubbleSort.java
* Copyright 2017-07-20 By Gnosis. Allright reserved.
* Time: ����4:08:49
*/
package com.chinasofti.day05.sort;

/**
 * ����˼·��
 * ��δ����ĸ�Ԫ�ش�ͷ��β���αȽ����ڵ�����Ԫ�صĴ�С��ϵ
 * �����򽻻�λ�ã�����һ�ֱȽ������ɵõ����ֵ��
 * Ȼ��ʹ��ͬ���ķ�����ʣ�µ�Ԫ������Ƚϼ��ɡ�
 * ���Կ�������������N��Ԫ�أ���ôһ��Ҫ����N-1�ֱȽϣ���M�ֱȽϵĴ���ΪN-M��
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
