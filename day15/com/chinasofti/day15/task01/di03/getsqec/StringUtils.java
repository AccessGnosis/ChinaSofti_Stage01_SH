/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: GetLastStringSquence.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: обнГ3:43:18
*/
package com.chinasofti.day15.task01.di03.getsqec;

public class StringUtils {
	public static String getLastStringSquence(String str){
		return (String) str.subSequence(str.lastIndexOf("/")+1, str.length());
	}
}
