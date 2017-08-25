/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExtendsDemo.java
* Copyright 2017-07-28 By Gnosis. Allright reserved.
* Time: ����9:12:09
*/
package com.chinasofti.day10.extendsdemo;

public class ExtendsDemo01 {
	public static void main(String[] args) {
		/*
		 * ����a�����ͣ�������
		 * 
		 * Dog a = new Dog();//Dog���͡���dog����
		 * Animal a = new Dog();//
		 * �����ڣ��Ѷ���a����/������ʲô���͡�����Animal����
		 * �����ڣ�������������͡�����Dog����
		 * ��ʱ�����ֱ����ں����������Ͳ�һ�£���ʱ������ͳ�Ϊ��̬��
		 * 
		 * ��̬������һ����������ж�����̬�����ͣ���
		 * 
		 * encapsulation, modularity, polymorphism
		 * 		��װ			 ģ�黯		      ��̬
		 * 
		 * ע�⣺�̳��Ƕ�̬��ǰ���һ�֣���̬�ľ���任��ʽ���ӿں�ʵ����Ĺ�ϵ
		 * 
		 * ��̬���ص㣺
		 * 	��������󿴳��Ǹ���Ķ��󣨰�������󸳸������ĳһ����������
		 * 	�����������ڣ����ֵ������������
		 * 
		 * ��̬���ŵ㣺
		 * 	ʹ������Ӽ�����ˣ����š���ߴ���ĸ��á�
		 */
		Dog dog = new Dog(); // ������һ��������
		dog.eat();
		// ����Ķ��󸳸������͵ı���
		Animal anidog = new Dog(); // ��̬
		anidog.eat();
		Person p = new Person();

		Cat cat = new Cat();
		p.feed(dog);
		p.feed(cat);
	}
}

class Animal {
	public void eat() {
		System.out.println("��һ���ʳ��");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("�Թ���");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("��è��");
	}
}

class Person {
	// public void feed(Dog a){
	// System.out.println("...feeding...");
	// }
	// public void feed(Cat a){
	// System.out.println("...feeding...");
	// }
	public void feed(Animal a) {
		if (a instanceof Dog) {
			System.out.println("...Dog.feeding...");
		} else if (a instanceof Cat) {
			System.out.println("...Cat.feeding...");
		}
	}
}