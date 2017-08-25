/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: IteratorDemo.java
* Copyright 2017-08-07 By Gnosis. Allright reserved.
* Time: ÏÂÎç4:27:23
*/
package com.chinasofti.day18.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("d");
		System.out.println(list);
		/*
		for (int i = 0; i < list.size(); ++i) {
			Object ele = list.get(i);
			System.out.print(ele + " ");
			if ("c".equals(ele)) {
				list.remove(ele);
			}
		}
		*/
		System.out.println();
		// for (Object e : list) {
		// System.out.print(e + " ");
		// // if ("c".equals(e)) {
		// // list.remove(e);
		// // }
		// }
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object ele = it.next();
			if ("c".equals(ele)) {
				it.remove();
			}
		}
		System.out.println(list);

		// for-each²Ù×÷Iterator
		for (Iterator lit = list.iterator(); lit.hasNext();) {
			System.out.print(lit.next() + " ");
		}
	}

}
