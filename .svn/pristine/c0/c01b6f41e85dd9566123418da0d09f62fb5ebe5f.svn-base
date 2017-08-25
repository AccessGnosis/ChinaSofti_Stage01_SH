/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: OverrideDemo.java
* Copyright 2017-07-25 By Gnosis. Allright reserved.
* Time: 下午3:52:12
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
	 * 方法的重写，也称方法的覆盖 子类拓展了父类，可以获得父类的部分方法和成员变量。
	 * 但是当父类的某个方法 不适合子类本身的特征时，此时：
	 * 	子类重新覆盖该方法，并重新编写方法体——方法的重写
	 * 
	 * 方法的重载：同一类，方法名相同，参数列表不同(两同一不同)
	 * 
	 * 方法的重写：存在继承的关系，强调的是父类和子类之间的关系。
	 * 	方法的重写遵循：(两同两小一大原则)
	 * 				两同：方法名称相同、参数列表相同
	 * 				两小：1）子类方法返回的类型要小于等于父类方法的返回类型；
	 * 						类类型的大小，非基本类型的大小。
	 * 					2）异常比父类方法小或相等。
	 * 				一大：权限比父类更大或相等
	 * 
	 * @see com.chinasofti.day09.override.Bird#fly()
	 */

	// @Override
	// Penguin fly() {
	// System.out.println("can not fly.....");
	// return this;
	// }

}
