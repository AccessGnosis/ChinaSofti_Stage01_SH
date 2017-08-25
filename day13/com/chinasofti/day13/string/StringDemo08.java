/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringDemo08.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: обнГ4:06:48
*/
package com.chinasofti.day13.string;

public class StringDemo08 {
	private static final int NUM_MAX = 1000;
	public static void main(String[] args) {
		stringBuilderTime();
		stringBufferTime();
		stringTime();
	}

	private static void stringBufferTime() {
		long begin = System.currentTimeMillis();
		StringBuffer bfr = new StringBuffer("hello");
		System.out.println("Buffer capacity = "+bfr.capacity());
		System.out.println("Buffer length = "+bfr.length());
		for(int i = 0; i < NUM_MAX; ++i){
			bfr.append(i);
		}
		System.out.println(System.currentTimeMillis() - begin);
	}

	private static void stringBuilderTime() {
		long begin = System.currentTimeMillis();
		StringBuilder sbl = new StringBuilder("hello");
		System.out.println("Builder capacity = "+sbl.capacity());
		System.out.println("Builder length = "+sbl.length());
		for(int i = 0; i < NUM_MAX; ++i){
			sbl.append(i);
		}
		System.out.println(System.currentTimeMillis() - begin);
	}

	private static void stringTime() {
		long begin = System.currentTimeMillis();
		String str1 = "hello";
		for(int i = 0; i < NUM_MAX; ++i){
			str1 += i;
		}
		System.out.println(System.currentTimeMillis() - begin);
	}

}
