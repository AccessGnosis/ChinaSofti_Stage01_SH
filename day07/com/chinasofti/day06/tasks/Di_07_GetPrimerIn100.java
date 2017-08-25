/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_07_GetPrimerIn100.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: ионГ11:27:20
*/
package com.chinasofti.day06.tasks;

public class Di_07_GetPrimerIn100 {

	private static final int LIMITED = 100;

	public static void main(String[] args) {
		int j = 0;
		for (int i = 1; i <= LIMITED; ++i) {
			if (isPrimer(i)) {
				System.out.print(i + "\t");
				++j;
				if (j % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

	private static boolean isPrimer(int num) {
		boolean tag = true;
		for (int i = 2; i < num; ++i) {
			if (num % i == 0) {
				tag = false;
				break;
			}
		}
		return tag;
	}

}
