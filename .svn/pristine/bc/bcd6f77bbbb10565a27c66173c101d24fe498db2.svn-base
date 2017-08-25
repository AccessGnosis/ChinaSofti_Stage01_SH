/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TreeSetDemo2.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ÉÏÎç10:31:00
*/
package com.chinasofti.day19.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		Set set = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Teacher t1 = (Teacher) o1;
				Teacher t2 = (Teacher) o2;

				if (t1.getName().length() > t2.getName().length()) {
					return 1;
				} else if (t1.getName().length() < t2.getName().length()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		set.add(new Teacher("lulylilei"));
		set.add(new Teacher("zhangsan"));
		set.add(new Teacher("lily"));
		set.add(new Teacher("tom"));
		System.out.println(set);
	}

}
