/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StaticDemo2.java
* Copyright 2017-07-24 By Gnosis. Allright reserved.
* Time: обнГ3:36:58
*/
package com.chinasofti.day08.staticdemo;

public class StaticDemo2 {
	public static void main(String[] args) {
		new AA().say(); // 1, 1
		new AA().say(); // 1, 2
		new AA().say(); // 1, 3
	}
}

class AA {
	int a;
	static int b;

	AA() {
		a++;
		b++;
	}

	void say() {
		System.out.print("a = " + a);
		System.out.println("; b = " + b);
	}
}