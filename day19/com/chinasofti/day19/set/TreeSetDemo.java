/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TreeSetDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ����9:23:42
*/
package com.chinasofti.day19.set;

import java.util.Set;
import java.util.TreeSet;

//��ʾTreeSet�࣬�ײ���õĺ�����㷨��ƽ���������
//Ĭ�϶Ѽ��϶�������Ȼ�������򣬲�Ҫ�����ж�������ͱ��뱣��һ��
class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("a");
		set.add("c");
		set.add("1");
		set.add("b");
		set.add("10");
		set.add("09");
		set.add("����");
		set.add("������");
		System.out.println(set);
		System.out.println(set.descendingSet());// ���������������ͼ
		System.out.println(set.headSet("a"));// ����Ԫ��ҪС��ָ�� Ԫ��a
	}
}
