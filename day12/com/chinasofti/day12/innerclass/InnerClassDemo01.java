/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InnerClassDemo01.java
* Copyright 2017-07-30 By Gnosis. Allright reserved.
* Time: ����9:05:26
*/
package com.chinasofti.day12.innerclass;

//��ʾʵ���ڲ���
public class InnerClassDemo01 {

	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Inner in = new Outter().new Inner();

		System.out.println(out);
		System.out.println(in);

		in.test();
		new Outter1();
	}

}

// �ⲿ��
class Outter {
	String name = "Outter name";

	public void aaa() {
		System.out.println(this.new Inner().age);
	}

	class Inner {// ʵ���ڲ���
		String name = "Inner Class";
		int age = 20;

		// static int age1 = 20;//�����ڲ���Outter.Inner
		public void test() {
			String name = "Local Name";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
	}
}

//�ⲿ��
class Outter1 {
	String name = "Outter name";

	public void aaa() {
		System.out.println(Inner.name);
	}

	 static class Inner {// ��̬�ڲ���
		static String name = "Inner Class";
		int age = 20;

		// static int age1 = 20;//�����ڲ���Outter.Inner
		public void test() {
			String name = "Local Name";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outter1.Inner.name);
		}
	}
}