/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: HashMapDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: 下午2:04:41
*/
package com.chinasofti.day19.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 增加元素的时候，新put一个key值，value值不一样即可
		Map hm = new HashMap();
		hm.put("key1", "张三");
		hm.put("key2", "张三丰");
		hm.put("key3", "张无忌");
		System.out.println(hm);
		System.out.println(hm.size());

		// Map不是集合，不能使用foreach遍历，但是可以使用map中的key组成key集合--set集合
		// 遍历Map集合的第一种方式，根据key值，获取value的值
		Set keys = hm.keySet();
		for (Object key : keys) {
			System.out.println(key + "-->" + hm.get(key));
		}
		System.out.println("==================================");
		Collection values = hm.values();
		for (Object value : values) {
			System.out.print(value + " ");
		}
		System.out.println("\n==================================");
		Set<Map.Entry<String, Object>> entrys = hm.entrySet();
		for (Map.Entry<String, Object> entry : entrys) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}

}
