/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: BoysDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ����5:31:47
*/
package com.chinasofti.day19.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//��ʾset, list, map��ʹ��
public class BoysDemo {

	public static void main(String[] args) {
		// 1.��ʾһ���༶��ѧ��
		Set<String> class1 = new HashSet<String>();
		class1.add("��ë");
		class1.add("��ë");
		class1.add("��ë");
		class1.add("Сë");
		Set<String> class2 = new HashSet<String>();
		class2.add("��");
		class2.add("����");
		class2.add("����");
		class2.add("С��");

		System.out.println(class1);
		System.out.println(class2);

		// ��ʾһ��ѧԺ��ѧ������������༶��key, value��
		// map
		Map<String, Set<String>> college1 = new HashMap<String, Set<String>>();
		college1.put("������", class1);
		college1.put("�θ߰�", class2);

		System.out.println(college1);

		Map<String, Set<String>> college2 = new HashMap<String, Set<String>>();
		college2.put("������", class1);
		college2.put("�θ߰�", class2);

		System.out.println(college2);

		// ��ʾһ��ѧУ��ѧ�� //��List
		List<Map<String, Set<String>>> list = new ArrayList<Map<String, Set<String>>>();
		list.add(college1);
		list.add(college2);
		System.out.println(list);

	}

}