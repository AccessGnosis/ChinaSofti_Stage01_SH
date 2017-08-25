/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LinkedList.java
* Copyright 2017-08-07 By Gnosis. Allright reserved.
* Time: 下午3:06:59
*/
package com.chinasofti.day18.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		list.addLast("a");
		list.addLast("e");
		list.addLast("f");
		list.addLast("d");
		list.addLast("e");
		list.addLast("f");
		System.out.println(list);
		list.addFirst("a");
		System.out.println(list);

		LinkedList list1 = new LinkedList();
		list1.addLast("x");
		list1.addLast("y");
		list1.addLast("z");
		list.addAll(list1);
		list.add(list1); // 把list1当成一个整体添加到list元素的末尾
		System.out.println(list);
		System.out.println(list1);
		list.addAll(1, list1);
		System.out.println(list1);
		System.out.println(list.getFirst());
		System.out.println(list.element());
		System.out.println(list.get(0));
		System.out.println(list.indexOf("a"));
		list.push("a");
		System.out.println(list.peek());
	}

}
