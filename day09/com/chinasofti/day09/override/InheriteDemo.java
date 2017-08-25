/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InheriteDemo.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: обнГ5:53:32
*/
package com.chinasofti.day09.override;

public class InheriteDemo {

	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.getFatherName() == son.name);
	}

}

class Father{
	public String name = "Father";
	
}
class Son extends Father{
	public String name = "Son";
	
	public String getFatherName(){
		return super.name;
	}
}