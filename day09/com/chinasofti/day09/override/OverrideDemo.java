/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: OverrideDemo.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: ����3:52:12
*/
package com.chinasofti.day09.override;

import com.chinasofti.day09.animaldemo.Cat;

public class OverrideDemo {

	public static void main(String[] args) {
		Penguin p = new Penguin();
		((Bird) p).fly().fly().fly();

		System.out.println("======================================");

		Bird bird = new Bird();
		Penguin penguin = new Penguin();
		System.out.println(bird.getBird() == penguin.getBird());
		System.out.println(bird.fly().getClass());
		System.out.println(bird.b == penguin.b);
	}

}

class Bird {
	public Cat b = new Cat();

	Bird fly() {
		System.out.println("fly.........");
		return this;
	}

	public Cat getBird() {
		return this.b;
	}
}

class Penguin extends Bird {
	/*
	 * ��������д��Ҳ�Ʒ����ĸ��� ������չ�˸��࣬���Ի�ø���Ĳ��ַ����ͳ�Ա������
	 * ���ǵ������ĳ������ ���ʺ����౾�������ʱ����ʱ��
	 * 	�������¸��Ǹ÷����������±�д�����塪����������д
	 * 
	 * ���������أ�ͬһ�࣬��������ͬ�������б�ͬ(��ͬһ��ͬ)
	 * 
	 * ��������д�����ڼ̳еĹ�ϵ��ǿ�����Ǹ��������֮��Ĺ�ϵ��
	 * 	��������д��ѭ��(��ͬ��Сһ��ԭ��)
	 * 				��ͬ������������ͬ�������б���ͬ
	 * 				��С��1�����෽�����ص�����ҪС�ڵ��ڸ��෽���ķ������ͣ�
	 * 						�����͵Ĵ�С���ǻ������͵Ĵ�С��
	 * 					2���쳣�ȸ��෽��С����ȡ�
	 * 				һ��Ȩ�ޱȸ����������
	 * 
	 * @see com.chinasofti.day09.override.Bird#fly()
	 */

	// @Override
	// Penguin fly() {
	// System.out.println("can not fly.....");
	// return this;
	// }

}
