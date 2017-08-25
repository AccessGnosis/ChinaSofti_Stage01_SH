/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ArrayDemo.java
* Copyright 2017-07-19 By Gnosis. Allright reserved.
* Time: ÏÂÎç1:45:58
*/
package com.chinasofti.day05.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[1] = "3";

		System.out.println(arr.getClass().getName());
		System.out.println(arr[1].getClass().getName());

		String[] arr2 = new String[] {};

		System.out.println(arr2.length);
		System.out.println(arr2.getClass().getName());

		List<String> arrlist = new ArrayList<String>();
		arrlist.add(new String("1"));
		arrlist.add(new String("2"));
		arrlist.add(new String("0"));
		System.out.println(arrlist.size());
		System.out.println(arrlist.getClass().getName());

		for (String list : arrlist) {
			System.out.print(list + "\t");
		}
		System.out.println();
		for (String arr3 : arr) {
			System.out.print(arr3 + "\t");
		}
		System.out.println();
		
		arrlist.sort(null);
		
		System.out.println(Arrays.toString(arrlist.toArray()));
		System.out.println(Arrays.toString(arr));
	}
}
