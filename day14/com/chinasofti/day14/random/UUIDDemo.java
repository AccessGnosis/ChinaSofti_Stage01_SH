/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: UUIDDemo.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: ионГ10:04:35
*/
package com.chinasofti.day14.random;

import java.util.UUID;

public class UUIDDemo {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString().replaceAll("-", ""));
		
	}

}
