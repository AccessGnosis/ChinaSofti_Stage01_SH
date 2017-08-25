/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: OverrideDemo2.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: 下午5:32:43
*/
package com.chinasofti.day09.override;

public class OverrideDemo2 {

	public static void main(String[] args) {
		Fish fish = new Fish("nemooy", 30, "green");
		System.out.println(fish.toString());
	}

}

class Animal {
	private String name;
	private int age;

	Animal() {
		System.out.println("父类的无参构造方法");
	}

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
		this.age = age;
	}

}

class Fish extends Animal {
	private String color;

	Fish() {
		super();
		System.out.println("子类的无参构造方法");
	}

	Fish(String name, int age, String color) {
		super.setName(name);
		super.setAge(age);
		this.color = color;

	}

	@Override
	public String toString() {
		return "Fish [color=" + color + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}