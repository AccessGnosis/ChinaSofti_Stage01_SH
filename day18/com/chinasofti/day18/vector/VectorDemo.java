/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: VectorDemo.java
* Copyright 2017-08-07 By Gnosis. Allright reserved.
* Time: 上午11:11:55
*/
package com.chinasofti.day18.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		/*
		 * boolean add(E e) 将指定元素添加到向量的末尾
		 */
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add(1, "C");// 在指定位置上插入元素
		v.addElement("D");
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println("==========================");
		Vector v1 = new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		System.out.println(v1);
		v.addAll(v1);
		System.out.println(v);
		System.out.println("===================================");
		// v1.clear();
		// System.out.println(v1);
		System.out.println(v1.contains(1)); // true
		System.out.println(v1.contains(4)); // false
		System.out.println(v.contains(v1)); // true

		Vector v2 = new Vector();
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		v2.add(sb);// v2对象里面存的是什么
		sb.append("hahaha");// 集合中存储的是对象的引用，而不是对象的内容
		System.out.println(v2);

		Vector v3 = new Vector();
		v3.add(1);
		v3.add(2);
		v3.add(3);
		v3.add("a");
		v3.add("b");
		v3.add("b");
		System.out.println(v3);
		v3.remove(3);
		System.out.println(v3);
		v3.remove("b");
		System.out.println(v3);
		v3.remove(Integer.valueOf(3));
		v3.remove(Integer.valueOf("3"));
		System.out.println(v3);
	}

}
