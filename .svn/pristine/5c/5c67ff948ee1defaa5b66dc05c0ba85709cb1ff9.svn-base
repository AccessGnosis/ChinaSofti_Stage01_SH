/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InterfaceDemo01.java
* Copyright 2017-07-29 By Gnosis. Allright reserved.
* Time: обнГ1:55:27
*/
package com.chinasofti.day11.inerfacedemo;

public class InterfaceDemo01 {

	public static void main(String[] args) {
		IInterface i1 = new A();
		i1.doWork1();
	}

}

interface IInterface {
	int AGE = 20;

	void doWork();

	default void doWork1() {
		System.out.println("default");
	}
}

class A implements IInterface {

	@Override
	public void doWork() {
	}

	@Override
	public void doWork1() {
		IInterface.super.doWork1();
	}
}