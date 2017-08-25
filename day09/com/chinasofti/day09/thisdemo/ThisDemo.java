/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ThisDemo.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: 下午1:43:49
*/
package com.chinasofti.day09.thisdemo;

/**
 * 
 * @author Administrator
 * this关键字存在的位置
 * 	1）方法中：哪一个对象调用了this所在的方法，该方法中的this就是哪一个对象。
 *  2）构造器中：表示当前创建的对象，哪一个对象调用了this所在的成员，
 *  		this就是哪一个对象，当一个对象创建之后，jvm会分配一个引用自身的引用this.
 * this的使用场景：
 * 	1）解决区分成员变量和局部变量的方法（set）
 */
public class ThisDemo {
	private String name = "成员变量";
	private int age;

	ThisDemo() {
	}

	ThisDemo(String name) {
		// this.name = name;
		this(name, 20);
	}

	ThisDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		ThisDemo th = new ThisDemo("张三", 18);
		System.out.println(th.name + ", " + th.age);
		ThisDemo th2 = new ThisDemo("李四");
		System.out.println(th2.name + ", " + th2.age);
	}

}
