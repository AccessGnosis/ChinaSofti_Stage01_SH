/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ArraysDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: 下午4:20:28
*/
package com.chinasofti.day19.collectiontools;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		// 把数组转换为集合（list）
		List list = Arrays.asList("A", "B", "C");// 长度固定的数组
		System.out.println(list);
		// list.remove(2);//不允许移除固定集合
		// 因为通过Arrays.asList(...)得到的集合是一个固定的集合
		// 不允许增加删除，但是可以修改
		list.set(0, "a");
		System.out.println(list);

		list = Arrays.asList(1, 2, 3);// 此处是自动装箱的，把数字看成是Integer对象（引用类型）
		System.out.println(list);
		//手动定义的int[]类型数组是不可以自动装箱的，若用需要自己手动装箱，不推荐使用
		int[] arr = new int[]{1, 2, 3, 4};
		list = Arrays.asList(arr);
	}

}
