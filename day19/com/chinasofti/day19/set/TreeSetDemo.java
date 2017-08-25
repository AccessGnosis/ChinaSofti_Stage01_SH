/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TreeSetDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: 上午9:23:42
*/
package com.chinasofti.day19.set;

import java.util.Set;
import java.util.TreeSet;

//演示TreeSet类，底层采用的红黑树算法（平衡二叉树）
//默认堆集合对象按照自然排序排序，并要求所有对象的类型必须保持一致
class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("a");
		set.add("c");
		set.add("1");
		set.add("b");
		set.add("10");
		set.add("09");
		set.add("张三");
		set.add("张三丰");
		System.out.println(set);
		System.out.println(set.descendingSet());// 返回数组的逆向视图
		System.out.println(set.headSet("a"));// 返回元素要小于指定 元素a
	}
}
