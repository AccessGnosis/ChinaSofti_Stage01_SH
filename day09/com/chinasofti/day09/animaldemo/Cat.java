/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Cat.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: ÏÂÎç3:44:12
*/
package com.chinasofti.day09.animaldemo;

public class Cat extends Animal {
	void catchMouse(){
		System.out.println("×½ÀÏÊó");
	}

	@Override
	public String toString() {
		return "Cat [getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
