/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ConstructorDemo.java
* Copyright 2017-07-24 By Gnosis. Allright reserved.
* Time: 上午9:59:15
*/
package com.chinasofti.day08.constructor;

public class ConstructorDemo {
	public static void main(String[] args) throws Throwable {
		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println("=======================");
		Person p2 = new Person("张三");
		System.out.println(p2.name);
		p1.finalize();
		p2.finalize();
		System.out.println(p1);
		System.out.println(p2.name);
	}
}
class Person{
	String name = null;
	
	static{
		System.out.println("调用静态代码块……");
	}
	
	Person(){
		System.out.println("调用无参构造……");
	}
	Person(String n){
		System.out.println("调用有参构造……");
		name = n;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.gc();
		System.out.println("调用finalize方法");
	}
}
