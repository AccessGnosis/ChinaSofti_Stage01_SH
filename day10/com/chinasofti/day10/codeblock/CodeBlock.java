/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CodeBlock.java
* Copyright 2017-07-28 By Gnosis. Allright reserved.
* Time: ����11:02:25
*/
package com.chinasofti.day10.codeblock;

public class CodeBlock {

	public static void main(String[] args) {
		if (true) {
			System.out.println("�ֲ������");
		}
		SubClass sc = new SubClass();
	}

}

class SuperClass {
	public SuperClass() {
		init();
	}

	public void init() {
		System.out.println("���������ʼ������");
	}
}

class SubClass extends SuperClass {
	public SubClass() {
		init();
	}

	public void init() {
		System.out.println("���������ʼ������");
	}
}