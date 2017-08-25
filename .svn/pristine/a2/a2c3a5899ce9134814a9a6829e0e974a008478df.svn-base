/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StudentsDemo.java
* Copyright 2017-08-07 By Gnosis. Allright reserved.
* Time: 下午5:31:56
*/
package com.chinasofti.day18.set;

import java.util.HashSet;
import java.util.Set;

public class StudentsDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Student("张三", 18, "男"));
		set.add(new Student("张三", 18, "男"));
		set.add(new Student("李四", 20, "男"));
		set.add(new Student("王五", 19, "女"));
		System.out.println(set.size());
		System.out.println(set);
	}
}

class Student extends Object {
	private String name;
	private int age;
	private String gender;

	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
