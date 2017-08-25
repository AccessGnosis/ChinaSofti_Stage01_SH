/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_10_EmptyCenterTraiangle.java
* Copyright 2017-07-24 By Gnosis. Allright reserved.
* Time: обнГ9:38:34
*/
package com.chinasofti.day06.tasks;

public class Di_10_EmptyCenterTraiangle {

	public static void main(String[] args) {
		int n = 8;

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i - 1 + n; j++)
				if (j == n - i + 1 || j == n + i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
		for (int i = 1; i <= 2 * n - 1; i++)
			System.out.print("*");
	}

}
