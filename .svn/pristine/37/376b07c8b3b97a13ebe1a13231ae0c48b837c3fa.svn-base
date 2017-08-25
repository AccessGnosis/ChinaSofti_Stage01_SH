/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TreeSortSetDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: 上午9:48:31
*/
package com.chinasofti.day19.set;

import java.util.Set;
import java.util.TreeSet;

//定义三个学生，属性为name, age, score, 要求按分数的从小到大排序
public class TreeSortSetDemo {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(new Person("张三", 20, 90));
		set.add(new Person("张三丰", 30, 80));
		set.add(new Person("西门", 28, 60));
		set.add(new Person("西门", 30, 60));
		set.add(new Person("欧阳", 35, 70));
		set.add(new Person("欧阳该", 40, 70));
		System.out.println(set);
	}

}

class Person implements Comparable {
	private String name;
	private int age;
	private int score;

	public Person(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", score=" + score + "]\n";
	}

	@Override
	public int compareTo(Object o) {
		Person other = (Person) o;
		if (this.score > other.score) {
			return 1;
		} else if (this.score < other.score) {
			return -1;
		} else {
			if (this.age > other.age) {
				return 1;
			} else if (this.age < other.age) {
				return -1;
			} else {
//				return 0;
				return this.name.compareTo(other.name);
			}
		}
	}

}