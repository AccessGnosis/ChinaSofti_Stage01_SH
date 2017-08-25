/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: VectorDemo02.java
* Copyright 2017-08-07 By Gnosis. Allright reserved.
* Time: ����1:54:55
*/
package com.chinasofti.day18.vector;

import java.util.Vector;

public class VectorDemo02 {
	/*
	 * ɾ����
	 * E remove(int index)	�Ƴ���������ָ��λ�õ�Ԫ��
	 * boolean remove(Object o)
	 * 		�Ƴ���������ָ��Ԫ�صĵ�һ��ƥ������������������Ԫ�أ���Ԫ�ر��ֲ��䡣
	 * boolean removeAll(Collection<?> c)
	 * 		�Ӵ��������Ƴ�������ָ��Collection�е�����Ԫ�ء�
	 * boolean retainAll(Collection<?> c)
	 * 		�ڴ������н�����������ָ��Collection�е�Ԫ�ء�
	 * 
	 * �޸ģ�
	 * E set(int index, E element) 
	 * 		��ָ����Ԫ���滻��������ָ��λ�ô���Ԫ�ء������ر��޸ĵ����ݡ�
	 * 
	 * ��ѯ��
	 * int size()
	 * 		���ص��ǵ�ǰ���ϰ�������Ԫ�ء�
	 * boolean isEmpty()
	 * 		�жϵ�ǰ�����е�Ԫ�ظ����Ƿ�Ϊ0
	 * Object get(int index)
	 * 		��ѯָ������λ�õ�Ԫ��
	 * Object[] toArray()
	 * 		�Ѽ��϶���ת��ΪObject[]����
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
		// v1.removeAll(v2); //��v1�������Ƴ�������ָ������v2�е�����Ԫ��
		v1.retainAll(v2);// ��v1�����н�����������ָ������v2�е�Ԫ�أ����������ϵĽ���
		System.out.println(v1);

		System.out.println("=================================");

		Object ret = v1.set(4, "sb");
		System.out.println(ret);
		System.out.println(v1);
		System.out.println("=================================");
		System.out.println(v1.size());
		System.out.println(v1.isEmpty());
		System.out.println(v1.get(2));
		// v1.toArray()���Ѽ���v1ת��������
		Object[] objs = v1.toArray();
		for (Object obj : objs) {
			System.out.print(obj + " ");
		}
	}

}
