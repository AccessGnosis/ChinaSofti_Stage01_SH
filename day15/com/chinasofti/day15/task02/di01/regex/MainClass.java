/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: ÏÂÎç3:11:04
*/
package com.chinasofti.day15.task02.di01.regex;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(RegExUtils.judgeIDNum("612301199608150001"));
		System.out.println(RegExUtils.judgeIDNum("612301199608150"));
		System.out.println(RegExUtils.judgeIDNum("6123011996081500000"));
		System.out.println(RegExUtils.judgeMailNum("712000"));
		System.out.println(RegExUtils.judgeMailNum("012000"));
		System.out.println(RegExUtils.judgePhoneNum("13145684596"));
		System.out.println(RegExUtils.judgePhoneNum("+8613145684596"));
		System.out.println(RegExUtils.judgePhoneNum("+113145684596"));
		System.out.println(RegExUtils.judgePhoneNum("+1131456845965165"));
	}

}
