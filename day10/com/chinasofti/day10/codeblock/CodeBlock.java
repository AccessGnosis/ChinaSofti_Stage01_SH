/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CodeBlock.java
* Copyright 2017-07-28 By Gnosis. Allright reserved.
* Time: 上午11:02:25
*/
package com.chinasofti.day10.codeblock;

public class CodeBlock {

	public static void main(String[] args) {
		if (true) {
			System.out.println("局部代码块");
		}
		SubClass sc = new SubClass();
	}

}

class SuperClass {
	public SuperClass() {
		init();
	}

	public void init() {
		System.out.println("父类的做初始化操作");
	}
}

class SubClass extends SuperClass {
	public SubClass() {
		init();
	}

	public void init() {
		System.out.println("子类的做初始化操作");
	}
}