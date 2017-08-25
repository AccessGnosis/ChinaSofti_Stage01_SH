/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_04_ComparatorInterface.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: ÏÂÎç6:17:47
*/
package com.chinasofti.day21.task04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Di_04_ComparatorInterface {

	public static void main(String[] args) {
		Emp e1 = new Emp("Terry", 25, 'm', 6000);
		Emp e2 = new Emp("Allen", 21, 'f', 4000);
		Emp e3 = new Emp("Smith", 23, 'm', 3000);
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);

		Collections.sort(emps, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		System.out.println(emps);
	}

}

class Emp {
	private String name;
	private int age;
	private char gender;
	private double salary;

	public Emp(String name, int age, char gender, double salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary + "]\n";
	}

}
