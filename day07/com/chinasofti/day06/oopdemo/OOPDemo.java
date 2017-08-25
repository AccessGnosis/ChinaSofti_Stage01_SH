/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: OOPDemo.java
* Copyright 2017-07-21 By Gnosis. Allright reserved.
* Time: 下午4:28:32
*/
package com.chinasofti.day06.oopdemo;

public class OOPDemo {

	public static void main(String[] args) {
		FeiYong f = new FeiYong();
		Programer p = new Programer();
		
		f.shopping();
		f.cook();
		eat();
		f.washing();
		p.code();
	}
	
	public static void eat(){
		System.out.println("去吃饭");
	}

}

class FeiYong{
	void shopping(){
		System.out.println("去购物");
	}
	void cook(){
		System.out.println("去做饭");
	}
	void washing(){
		System.out.println("去洗碗");
	}
}

class Programer{
	void code(){
		System.out.println("去敲代码");
	}
}