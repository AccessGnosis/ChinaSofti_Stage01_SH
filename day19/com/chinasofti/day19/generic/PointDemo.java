/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: PointDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ����5:07:46
*/
package com.chinasofti.day19.generic;

public class PointDemo {

	public static void main(String[] args) {
		// 1.ʹ��String����
		Point<String> p1 = new Point<String>();
		p1.setX("1");
		System.out.println(p1);
		// 2.ʹ��Integer����
		Point<Integer> p2 = new Point<Integer>();
		p2.setX(1);
		System.out.println(p2);
	}

}
