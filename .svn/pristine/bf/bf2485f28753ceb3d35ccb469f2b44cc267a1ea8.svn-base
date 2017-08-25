/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_04_JudgeDays.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: 上午11:03:45
*/
package com.chinasofti.day06.tasks;

public class Di_04_JudgeDays {

	public static void main(String[] args) {
		int year = 2008;
		int month = 2;
		System.out.println(getDays(year, month));
	}

	private static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static int getDays(int year, int month) {
		int day = -1;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if (isLeapYear(year)) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		default:
			System.err.println("您输入的月份有误");
			break;
		}
		return day;
	}
}
