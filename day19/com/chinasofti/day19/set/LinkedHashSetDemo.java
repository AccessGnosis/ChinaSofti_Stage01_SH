/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LinkedHashSetDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ионГ9:09:43
*/
package com.chinasofti.day19.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add("a");
		hs.add("c");
		hs.add("b");
		hs.add("a");
		System.out.println(hs);
		Set lhs = new LinkedHashSet();
		lhs.add("a");
		lhs.add("c");
		lhs.add("b");
		lhs.add("a");
		System.out.println(lhs);
	}

}
