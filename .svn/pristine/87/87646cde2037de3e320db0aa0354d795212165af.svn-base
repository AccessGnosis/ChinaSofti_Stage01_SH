/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_06_GetSum02.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: ионГ11:15:35
*/
package com.chinasofti.day06.tasks;

public class Di_06_GetSum02 {

	public static void main(String[] args) {
		System.out.println(getSum(3));
	}

	private static int getSum(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; ++i){
			sum += generatNum(i);
		}

		return sum;
	}

	private static int generatNum(int n) {
		int result = 0;
		int a = 0;

		for(int i = 1; i <= n; ++i){
			a = (int) (9 * Math.pow(10, n - i));
			result += a;
		}

		return result;
	}
}
