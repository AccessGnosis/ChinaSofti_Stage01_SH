/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExtendsDemo.java
* Copyright 2017-07-28 By Gnosis. Allright reserved.
* Time: 上午9:12:09
*/
package com.chinasofti.day10.extendsdemo;

public class ExtendsDemo01 {
	public static void main(String[] args) {
		/*
		 * 对象a的类型：有两种
		 * 
		 * Dog a = new Dog();//Dog类型——dog对象
		 * Animal a = new Dog();//
		 * 编译期：把对象a看成/当成是什么类型。——Animal类型
		 * 运行期：对象的真正类型。——Dog类型
		 * 此时，发现编译期和运行期类型不一致，此时的情况就称为多态。
		 * 
		 * 多态：就是一个对象可以有多种形态（类型）。
		 * 
		 * encapsulation, modularity, polymorphism
		 * 		封装			 模块化		      多态
		 * 
		 * 注意：继承是多态的前提的一种，多态的具体变换形式：接口和实现类的关系
		 * 
		 * 多态的特点：
		 * 	把子类对象看成是父类的对象（把子类对象赋给父类的某一个变量），
		 * 	但是在运行期，表现的是子类的特征
		 * 
		 * 多态的优点：
		 * 	使代码更加简洁明了，优雅。提高代码的复用。
		 */
		Dog dog = new Dog(); // 创建了一个狗对象
		dog.eat();
		// 子类的对象赋给父类型的变量
		Animal anidog = new Dog(); // 多态
		anidog.eat();
		Person p = new Person();

		Cat cat = new Cat();
		p.feed(dog);
		p.feed(cat);
	}
}

class Animal {
	public void eat() {
		System.out.println("吃一般的食物");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("吃狗粮");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("吃猫粮");
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