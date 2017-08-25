/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: GenericTypeDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: 下午5:12:34
*/
package com.chinasofti.day19.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		// list.add("a");
		doWork(list); // 必须是Number类型的子类或本身
		List<Object> list2 = new ArrayList<Object>();
		doWork2(list2);// 必须是Number类型的父类或本身
	}

	// 泛型的上限，必须是Number类型的子类及Number类本身
	private static void doWork(List<? extends Number> list) {
	}

	// 泛型的下限，必须是Number类型的父类及Number类本身
	private static void doWork2(List<? super Number> list) {
	}

}
