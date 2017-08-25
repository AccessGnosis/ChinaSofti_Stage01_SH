/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: обнГ2:48:04
*/
package com.chinasofti.day09.stuchdemo;

public class MainClass {

	public static void main(String[] args) {
		Human stu = new Student();
		Human tech = new Teacher();

		Student s1 = (Student)stu;
		Human h1 = (Human)s1;
		h1.setName("уехЩ");
		s1.setStuid("1234");
		System.out.println(stu.toString());
	}

}
