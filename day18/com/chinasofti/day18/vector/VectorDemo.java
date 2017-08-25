/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: VectorDemo.java
* Copyright 2017-08-07 By Gnosis. Allright reserved.
* Time: ����11:11:55
*/
package com.chinasofti.day18.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		/*
		 * boolean add(E e) ��ָ��Ԫ����ӵ�������ĩβ
		 */
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add(1, "C");// ��ָ��λ���ϲ���Ԫ��
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
		v2.add(sb);// v2������������ʲô
		sb.append("hahaha");// �����д洢���Ƕ�������ã������Ƕ��������
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
