/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: PrintCharacters.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: 下午3:52:06
*/
package com.chinasofti.day15.task01.di06.printallzh;

public class PrintCharacters {
	public String printTotalZH_CHCharacters() {
		int min = (int) (4 * Math.pow(16, 3) + 14 * Math.pow(16, 2)); // 汉字ASCII码最小值
		int max = (int) (9 * Math.pow(16, 3) + 15 * Math.pow(16, 2) + 10 * Math.pow(16, 1)) + 5; // 汉字ASCII码最大值
		StringBuffer sb = new StringBuffer();
//		System.out.println(min);
//		System.out.println(max);
		
		int a = min;
		int b = max;
		
		for (int i = a, j = 1; i <= b; ++i, ++j) {
			System.out.print((char) i);
			sb.append((char)i);
			if (j % 50 == 0) {
				System.out.println();
			}
		}
		return sb.toString();
	}
}
