/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InnerClassDemo01.java
* Copyright 2017-07-30 By Gnosis. Allright reserved.
* Time: 上午9:05:26
*/
package com.chinasofti.day12.innerclass;

//演示实例内部类
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

// 外部类
class Outter {
	String name = "Outter name";

	public void aaa() {
		System.out.println(this.new Inner().age);
	}

	class Inner {// 实例内部类
		String name = "Inner Class";
		int age = 20;

		// static int age1 = 20;//错误：内部类Outter.Inner
		public void test() {
			String name = "Local Name";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
	}
}

//外部类
class Outter1 {
	String name = "Outter name";

	public void aaa() {
		System.out.println(Inner.name);
	}

	 static class Inner {// 静态内部类
		static String name = "Inner Class";
		int age = 20;

		// static int age1 = 20;//错误：内部类Outter.Inner
		public void test() {
			String name = "Local Name";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outter1.Inner.name);
		}
	}
}