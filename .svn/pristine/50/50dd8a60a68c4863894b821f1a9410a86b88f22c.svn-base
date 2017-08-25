/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ArrayUtil.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: 上午9:53:31
*/
package com.chinasofti.day06.util.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 操作数组的工具类 保护数组相关的操作，打印，排序，最大最小值，复制
 * 
 * @author Gnosis
 *
 */
public class ArrayUtil {
	/**
	 * 二分法搜索算法
	 * 
	 * @param arr
	 *            待排序数组
	 * @param key
	 *            需要查找的值
	 * @return 返回查找值的索引
	 */
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

	/**
	 * 冒泡排序算法
	 * 
	 * @param arr
	 *            待排序数组
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
	 * 选择排序算法
	 * 
	 * @param arr
	 *            待排序数组
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
	 * 打印数组
	 * 
	 * @param arr
	 *            待打印数组
	 */
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}

	/**
	 * 逆序打印数组
	 * 
	 * @param arr
	 *            待逆序打印数组
	 */
	public static void reversePrint(int[] arr) {
		for (int i = arr.length - 1; i >= 0; --i) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	/**
	 * 数组拷贝
	 * 
	 * @param src
	 *            原数组
	 * @param srcPos
	 *            原数组起始位置
	 * @param dest
	 *            目标数组
	 * @param destPos
	 *            目标数组起始位置
	 * @param length
	 *            数组复制长度
	 */
	public static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
		for (int i = srcPos; i < srcPos + length; ++i) {
			dest[destPos] = src[i];
			destPos++;
		}
	}

	/**
	 * 获取值的索引
	 * 
	 * @param arr
	 *            待获取索引数组
	 * @param value
	 *            传入需要获取索引的数
	 * @return 返回相同类型的数组集合
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
	 * 获取数组最大最小值
	 * 
	 * @param arr
	 *            待判断数组
	 * @return 返回数组极值，index=0为最大值，index=1为最小值
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
