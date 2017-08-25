/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Recursion.java
* Copyright 2017-07-19 By Gnosis. Allright reserved.
* Time: ионГ9:15:27
*/
package com.chinasofti.day05.recursion;

public class Recursion {
	public static void main(String[] args) {
		System.out.println(recursion(8));
	}

	public static int recursion(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 0) {
			return 0;
		} else {
			return recursion(n - 1) + recursion(n - 2);
		}
	}

	public static int loop() {
		return 0;
	}
}
