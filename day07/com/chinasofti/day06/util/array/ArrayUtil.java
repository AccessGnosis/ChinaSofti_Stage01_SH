/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ArrayUtil.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: ����9:53:31
*/
package com.chinasofti.day06.util.array;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������Ĺ����� ����������صĲ�������ӡ�����������Сֵ������
 * 
 * @author Gnosis
 *
 */
public class ArrayUtil {
	/**
	 * ���ַ������㷨
	 * 
	 * @param arr
	 *            ����������
	 * @param key
	 *            ��Ҫ���ҵ�ֵ
	 * @return ���ز���ֵ������
	 */
	public static int binarySearch(int[] arr, int key) {
		int low = 0; // ��ʾ��С������
		int high = arr.length - 1; // ��ʾ��������

		while (low <= high) {
			int mid = (low + high) / 2; // ��ʾ�м�����
			int midVal = arr[mid];

			if (midVal < key) { // ��С��
				low = mid + 1; // �м���������һλ
			} else if (midVal > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	/**
	 * ð�������㷨
	 * 
	 * @param arr
	 *            ����������
	 */
	public static void bubbleSort(int[] arr) {
		for (int count = 1; count < arr.length; ++count) {
			for (int index = 0; index < arr.length - count; ++index) {
				if (arr[index] > arr[index + 1]) {
					int temp = arr[index];
					arr[index] = arr[index + 1];
					arr[index + 1] = temp;
				}
			}
		}
	}

	/**
	 * ѡ�������㷨
	 * 
	 * @param arr
	 *            ����������
	 */
	public static void selectionSort(int[] arr) {
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

	/**
	 * ��ӡ����
	 * 
	 * @param arr
	 *            ����ӡ����
	 */
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}

	/**
	 * �����ӡ����
	 * 
	 * @param arr
	 *            �������ӡ����
	 */
	public static void reversePrint(int[] arr) {
		for (int i = arr.length - 1; i >= 0; --i) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	/**
	 * ���鿽��
	 * 
	 * @param src
	 *            ԭ����
	 * @param srcPos
	 *            ԭ������ʼλ��
	 * @param dest
	 *            Ŀ������
	 * @param destPos
	 *            Ŀ��������ʼλ��
	 * @param length
	 *            ���鸴�Ƴ���
	 */
	public static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
		for (int i = srcPos; i < srcPos + length; ++i) {
			dest[destPos] = src[i];
			destPos++;
		}
	}

	/**
	 * ��ȡֵ������
	 * 
	 * @param arr
	 *            ����ȡ��������
	 * @param value
	 *            ������Ҫ��ȡ��������
	 * @return ������ͬ���͵����鼯��
	 */
	public static List<Integer> getIndex(int[] arr, int value) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; ++i) {
			if (value == arr[i]) {
				list.add(new Integer(i));
			}
		}
		return list;
	}

	/**
	 * ��ȡ���������Сֵ
	 * 
	 * @param arr
	 *            ���ж�����
	 * @return �������鼫ֵ��index=0Ϊ���ֵ��index=1Ϊ��Сֵ
	 */
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
}
