/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: BoysDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: 下午5:31:47
*/
package com.chinasofti.day19.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//演示set, list, map的使用
public class BoysDemo {

	public static void main(String[] args) {
		// 1.表示一个班级的学生
		Set<String> class1 = new HashSet<String>();
		class1.add("大毛");
		class1.add("二毛");
		class1.add("三毛");
		class1.add("小毛");
		Set<String> class2 = new HashSet<String>();
		class2.add("大花");
		class2.add("二花");
		class2.add("三花");
		class2.add("小花");

		System.out.println(class1);
		System.out.println(class2);

		// 表示一个学院的学生，包含多个班级（key, value）
		// map
		Map<String, Set<String>> college1 = new HashMap<String, Set<String>>();
		college1.put("基础班", class1);
		college1.put("拔高班", class2);

		System.out.println(college1);

		Map<String, Set<String>> college2 = new HashMap<String, Set<String>>();
		college2.put("基础班", class1);
		college2.put("拔高班", class2);

		System.out.println(college2);

		// 表示一个学校的学生 //用List
		List<Map<String, Set<String>>> list = new ArrayList<Map<String, Set<String>>>();
		list.add(college1);
		list.add(college2);
		System.out.println(list);

	}

}