/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StudentDemo.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: 下午4:49:39
*/
package com.chinasofti.day06.oopdemo;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "张三";
		s1.isFees = true;
		Student s2 = new Student();
		s2.name = "李四";
		Student s3 = new Student();
		s3.name = "王五";
		s3.isFees = true;
		Student s4 = new Student();
		s4.name = "邱六";
		Student s5 = new Student();
		s5.name = "赵七";
		
		Student[] students = new Student[]{s1, s2, s3, s4, s5};
		for(Student student : students){
			System.out.println(student.name+","+student.isFees);
		}
		
		System.out.println("======================================");
		
		for(Student student : students){
			if(!student.isFees){
				System.out.print(student.name+"  ");
			}
		}
	}

}

class Student{
	String name;
	boolean isFees;
}