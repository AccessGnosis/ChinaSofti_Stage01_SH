/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FinalDemo01.java
* Copyright 2017-07-28 By Gnosis. Allright reserved.
* Time: ����1:52:24
*/
package com.chinasofti.day10.finaldemo;

public class FinalDemo01 {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.AGE);
		// p.AGE = 18; //���ܶ�final���ε�ֵ�����޸�
		System.out.println(p.name);
		System.out.println("=====================");
		final User user = new User();
		System.out.println(user);
		user.setName("zhaoliu");
		System.out.println(user);
		User user1 = new User();
		// user = user1; //user��ָ����ڴ��ַ���ɱ�
	}

}

class Person {
	final int AGE = 18;
	// age = 18; //����
	final String name = "zhangsan";
}

class User {
	String name = "wangwu";

	public void setName(String name) {
		this.name = name;
	}

	// ��д
	public String toString() {
		return this.name;
	}
}