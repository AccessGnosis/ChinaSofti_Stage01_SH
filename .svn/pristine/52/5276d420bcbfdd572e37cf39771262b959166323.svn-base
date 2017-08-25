/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SetDemo.java
* Copyright 2017-08-07 By Gnosis. Allright reserved.
* Time: ÏÂÎç5:23:28
*/
package com.chinasofti.day18.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();

		set.add("A");
		set.add("C");
		set.add("B");
		set.add("A");
		set.add("C");
		set.add(2);
		set.add(3);
		set.add(5);
		set.add("C");

		System.out.println(set);

		// Set-->List
		List list = new ArrayList(set);
		list.add(1);
		list.add(1);
		list.add("a");
		list.add(2);
		list.add(2);
		list.add(1);
		list.add("c");
		System.out.println(list);

		// List-->Set
		set = new HashSet(list);
		System.out.println(set);
	}

}
