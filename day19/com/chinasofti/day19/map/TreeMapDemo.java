/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TreeMapDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ����3:11:41
*/
package com.chinasofti.day19.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map map = new HashMap();//���򣬲��ظ�
		map = new LinkedHashMap();//���򣬲��ظ�
		map = new TreeMap();//��Ȼ���򣬲��ظ�
		map.put("C", "Cvalue");
		map.put("B", "Bvalue");
		map.put("A", "Avalue");
		map.put("A", "AAvalue");
		map.put("2", "2value");
		map.put("1", "1value");
		System.out.println(map);
	}

}
