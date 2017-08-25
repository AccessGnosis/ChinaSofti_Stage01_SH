/**
* Describe:需求：有100个苹果，叫三个同学来拿，每次只能拿一个 
* 	因为三个同学可以同时吃苹果，此时，需要使用多线程技术来实现。
* Keyword: 
* Hint: 
* Filename: ExtendsDemo.java
* Copyright 2017-08-09 By Gnosis. Allright reserved.
* Time: 下午1:57:43
*/
package com.chinasofti.day20.thread;

/**
 * 此程序不合理，每一个线程对象都执行了100次，即每一个对象都吃了100个苹果
 * @author Administrator
 *
 */
public class ExtendsDemo {

	public static void main(String[] args) {
		new Student("小龙").start();// 每一个同学相当于一个线程
		new Student("小丽").start();
		new Student("小南").start();
	}

}

class Student extends Thread {
	private int num = 100;

	public Student(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			if (num > 0) {
				System.out.println(this.getName() + " 在吃第 " + num-- + " 个苹果");
			}
		}
	}

}
