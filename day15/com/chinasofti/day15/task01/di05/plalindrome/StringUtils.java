/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StringUtils.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: обнГ3:47:26
*/
package com.chinasofti.day15.task01.di05.plalindrome;

public class StringUtils {
	public static boolean judgePlalindrome(String str) {
		StringBuffer sstr = new StringBuffer(str);
		
		if (str.equals(sstr.reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}
}
