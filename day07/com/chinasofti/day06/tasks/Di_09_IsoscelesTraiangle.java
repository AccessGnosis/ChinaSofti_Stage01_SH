/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_09_IsoscelesTraiangle.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: обнГ12:08:04
*/
package com.chinasofti.day06.tasks;

public class Di_09_IsoscelesTraiangle {

	public static void main(String[] args) {
		int i = 8;

		for (int x = 1; x <= i; x++) {
			for (int y = i - x; y >= 0; y--) {
				System.out.print(" ");
			}
			for (int a = 1; a <= (2 * x - 1); a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
