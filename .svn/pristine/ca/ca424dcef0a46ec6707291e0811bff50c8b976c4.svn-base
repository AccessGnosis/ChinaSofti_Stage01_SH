/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InterfaceDemo03.java
* Copyright 2017-07-29 By Gnosis. Allright reserved.
* Time: 下午2:36:52
*/
package com.chinasofti.day11.inerfacedemo;

public class InterfaceDemo03 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		IWalkable w1 = new Dog();

		w1.walk();

		IWalkable w2 = new IWalkable() {

			@Override
			public void walk() {
				System.out.println("IWalkable's action");
			}
		};
		w2.walk();
		
		IAmphibous am1 = new Frog();
		am1.swim();
		am1.walk();
	}

}

class Animal {// 定义一个动物类

}

interface IWalkable {// 定义爬行动物
	void walk();// 爬行动物具有爬的功能//定义为抽象方法，默认被public abstract修饰
}

interface ISwimmable {// 定义水生动物
	void swim();// 水生动物具有的游泳功能
}

interface IAmphibous extends IWalkable, ISwimmable {// 定义两栖动物
}

// 狗
class Dog extends Animal implements IWalkable {

	@Override
	public void walk() {
		System.out.println("dog can running...");
	}

}

// 鱼
class Fish extends Animal implements ISwimmable {

	@Override
	public void swim() {
		System.out.println("fish can swimming...");
	}

}

class Frog extends Animal implements IAmphibous {

	@Override
	public void walk() {
		System.out.println("frog can running...");
	}

	@Override
	public void swim() {
		System.out.println("frog can swimming...");
	}

}