/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ArraysDemo.java
* Copyright 2017-08-08 By Gnosis. Allright reserved.
* Time: ����4:20:28
*/
package com.chinasofti.day19.collectiontools;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		// ������ת��Ϊ���ϣ�list��
		List list = Arrays.asList("A", "B", "C");// ���ȹ̶�������
		System.out.println(list);
		// list.remove(2);//�������Ƴ��̶�����
		// ��Ϊͨ��Arrays.asList(...)�õ��ļ�����һ���̶��ļ���
		// ����������ɾ�������ǿ����޸�
		list.set(0, "a");
		System.out.println(list);

		list = Arrays.asList(1, 2, 3);// �˴����Զ�װ��ģ������ֿ�����Integer�����������ͣ�
		System.out.println(list);
		//�ֶ������int[]���������ǲ������Զ�װ��ģ�������Ҫ�Լ��ֶ�װ�䣬���Ƽ�ʹ��
		int[] arr = new int[]{1, 2, 3, 4};
		list = Arrays.asList(arr);
	}

}
