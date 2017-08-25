/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SelectionSort.java
* Copyright 2017-07-20 By Gnosis. Allright reserved.
* Time: ����5:07:24
*/
package com.chinasofti.day05.sort;

/**
 * ����˼·�� ѡ��ĳ������λ�õ�Ԫ�أ�Ȼ��ͺ����Ԫ�����αȽϣ� �������򽻻�λ�ã�������һ�ֱȽ������ɵó���Сֵ��
 * Ȼ��ʹ��ͬ���ķ�����ʣ�µ�Ԫ������Ƚϼ��ɡ�
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
