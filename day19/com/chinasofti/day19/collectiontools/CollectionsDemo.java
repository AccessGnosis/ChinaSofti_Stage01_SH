/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CollectionsDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: 下午4:37:51
*/
package com.chinasofti.day19.collectiontools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List list = Collections.EMPTY_LIST;
		System.out.println(list);
		list = Collections.emptyList();
		System.out.println(list);
		list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int index = Collections.binarySearch(list, 7);
		System.out.println(index);
		System.out.println(list);
		Collections.reverse(list); // 反转
		System.out.println(list);
		Collections.shuffle(list); // 随机生成集合
		System.out.println(list);
		Collection list1 = Collections.synchronizedList(new ArrayList<>());// 将ArrayList变成一个线程安全的
	}

}
