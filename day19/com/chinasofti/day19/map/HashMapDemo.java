/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: HashMapDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ����2:04:41
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
		// ����Ԫ�ص�ʱ����putһ��keyֵ��valueֵ��һ������
		Map hm = new HashMap();
		hm.put("key1", "����");
		hm.put("key2", "������");
		hm.put("key3", "���޼�");
		System.out.println(hm);
		System.out.println(hm.size());

		// Map���Ǽ��ϣ�����ʹ��foreach���������ǿ���ʹ��map�е�key���key����--set����
		// ����Map���ϵĵ�һ�ַ�ʽ������keyֵ����ȡvalue��ֵ
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
