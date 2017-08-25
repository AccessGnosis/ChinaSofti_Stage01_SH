/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: GetIndex.java
* Copyright 2017-07-19 By Gnosis. Allright reserved.
* Time: обнГ4:09:48
*/
package com.chinasofti.day05.array;

import java.util.ArrayList;
import java.util.List;

public class GetIndex {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 9, 5, 3, 1, 8, 5, 4, 2 };
		List<Integer> indexs = getIndex(arr, 5);
		
		for(int i : indexs){
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	public static List<Integer> getIndex(int[] arr, int value){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; ++i){
			if(value == arr[i]){
				list.add(new Integer(i));
			}
		}
		return list;
	}
}
