/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: User.java
* Copyright 2017-08-15 By Gnosis. Allright reserved.
* Time: 下午4:22:28
*/
package com.chinasofti.day25.serialization;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	transient private String password;//transient屏蔽不想序列化的属性
	private int age;

	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + "]";
	}

}
