/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_01_CalcSum.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: обнГ7:29:30
*/
package com.chinasofti.test.exam.di_04.program;

public class Di_01_CalcSum {

	public static void main(String[] args) {
		System.out.println(getSum(3));
	}
	
	private static int getSum(int n){
		int sum = 0;
		
		for(int i = 1; i <= n; ++i){
			sum += getMulti(i);
		}
		
		return sum;
	}
	
	private static int getMulti(int n){
		int result = 1;
		
		for(int i = 1; i <= n; ++i){
			result *= i;
		}
		
		return result;
	}

}
