/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StaticInnerClassDemo.java
* Copyright 2017-07-30 By Gnosis. Allright reserved.
* Time: ионГ10:25:59
*/
package com.chinasofti.day12.innerclass;

public class StaticInnerClassDemo {

	public static void main(String[] args) {
		Outter2.Inner in = new Outter2.Inner();
	}

}
class Outter2{
	String name = "Outter name";
	
	static class Inner{
		static String name = "Inner name";
	}
}