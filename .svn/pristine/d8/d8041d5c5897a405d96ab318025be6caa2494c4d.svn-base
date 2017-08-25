/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: VectorDemo02.java
* Copyright 2017-08-07 By Gnosis. Allright reserved.
* Time: 下午1:54:55
*/
package com.chinasofti.day18.vector;

import java.util.Vector;

public class VectorDemo02 {
	/*
	 * 删除：
	 * E remove(int index)	移除此向量中指定位置的元素
	 * boolean remove(Object o)
	 * 		移除此向量中指定元素的第一个匹配项，如果向量不包含该元素，则元素保持不变。
	 * boolean removeAll(Collection<?> c)
	 * 		从此向量中移除包含在指定Collection中的所有元素。
	 * boolean retainAll(Collection<?> c)
	 * 		在此向量中仅保留包含在指定Collection中的元素。
	 * 
	 * 修改：
	 * E set(int index, E element) 
	 * 		用指定的元素替换此向量中指定位置处的元素。并返回被修改的数据。
	 * 
	 * 查询：
	 * int size()
	 * 		返回的是当前集合包含几个元素。
	 * boolean isEmpty()
	 * 		判断当前集合中的元素个数是否为0
	 * Object get(int index)
	 * 		查询指定索引位置的元素
	 * Object[] toArray()
	 * 		把集合对象转换为Object[]数组
	 */
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add("a");
		v1.add("b");
		v1.add("a");
		v1.add("c");
		v1.add("d");
		v1.add(3);
		v1.add(5);
		System.out.println(v1);
		System.out.println("=============================");
		Vector v2 = new Vector();
		v2.add("a");
		v2.add("b");
		v2.add("c");
		v2.add(3);
		System.out.println(v2);
		System.out.println("================================");
		// v1.removeAll(v2); //从v1集合中移除包含在指定集合v2中的所有元素
		v1.retainAll(v2);// 从v1集合中仅保留包含在指定集合v2中的元素，求两个集合的交集
		System.out.println(v1);

		System.out.println("=================================");

		Object ret = v1.set(4, "sb");
		System.out.println(ret);
		System.out.println(v1);
		System.out.println("=================================");
		System.out.println(v1.size());
		System.out.println(v1.isEmpty());
		System.out.println(v1.get(2));
		// v1.toArray()：把集合v1转换成数组
		Object[] objs = v1.toArray();
		for (Object obj : objs) {
			System.out.print(obj + " ");
		}
	}

}
