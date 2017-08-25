/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Dog.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: обнГ3:43:31
*/
package com.chinasofti.day09.animaldemo;

public class Dog extends Animal {
	void watchDoor() {
		System.out.println("©╢це");
	}

	@Override
	public String toString() {
		return "Dog [getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getClassName() {
		String str = null;

		str += getClass().getName();
		
		return str;
	}

}
