/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Student.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: ÏÂÎç2:48:42
*/
package com.chinasofti.day09.stuchdemo;

public class Student extends Human {
	private String stuid;

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public int getAge() {
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		super.setAge(age);
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", getAge()=" + getAge() + ", getName()=" + getName() + "]";
	}

}
