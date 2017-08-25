/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: WhyGenericTypeDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: 下午4:48:23
*/
package com.chinasofti.day19.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WhyGenericTypeDemo {

	public static void main(String[] args) {
		// 问题1：代码出现大量的黄色警告
		List list = new ArrayList();
		list.add("a");
		System.out.println(list);
		// 问题2：从集合中取出元素必须强转
		String str = (String) list.get(0);
		// 问题3：使用TreeSet，如何保证集合中只存储一种类型的数据
		Set set = new TreeSet();
		set.add(1);
		// set.add("a");
		System.out.println(set);
	}

}
