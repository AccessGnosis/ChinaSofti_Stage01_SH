/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: PersonDemo.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: 上午10:32:34
*/
package com.chinasofti.day09.person;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("张三");
		p1.setAge(20);
		String name = p1.getName();
		System.out.println(name);
	}

}

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("年龄不能为负数……");
			return;
		}
		this.age = age;
	}

}