/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Emp.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: ÏÂÎç2:28:35
*/
package com.chinasofti.day15.task02.di02.emp;

public class Emp {
	private String name;
	private int age;
	private String gender;
	private double salary;

	@Override
	public String toString() {
		return getName() + "," + getAge() + "," + getGender() + "," + getSalary();
	}

	@Override
	public boolean equals(Object obj) {
		if (this.getName().equals(((Emp) obj).getName())) {
			return true;
		} else {
			return false;
		}
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Emp(String name, int age, String gender, double salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

}
