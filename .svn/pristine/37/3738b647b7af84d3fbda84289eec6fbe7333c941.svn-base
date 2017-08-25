/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MethodOper.java
* Copyright 2017-07-29 By Gnosis. Allright reserved.
* Time: ионГ11:36:29
*/
package com.chinasofti.day11.template;

public abstract class MethodOper {
	public static final int NUM_LENGTH = 100000000;

	abstract void generate();

	public long doWork() {
		long start = System.currentTimeMillis();
		this.generate();
		long end = System.currentTimeMillis();
		return (end - start);
	}
}

class StringOper extends MethodOper {

	public void generate() {
		char sumChar = 'a';

		for (int i = 0; i < NUM_LENGTH; ++i) {
			sumChar += (char) i;
		}
	}

}

class IntOper extends MethodOper {
	public void generate() {
		int sumNum = 0;

		for (int i = 0; i < NUM_LENGTH; ++i) {
			sumNum += i;
		}

		return;
	}

}