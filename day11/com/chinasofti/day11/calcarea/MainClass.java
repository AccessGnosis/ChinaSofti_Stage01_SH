/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-07-29 By Gnosis. Allright reserved.
* Time: ионГ9:13:46
*/
package com.chinasofti.day11.calcarea;

public class MainClass {

	public static void main(String[] args) {
		Graphic circle = new Circle(10);
		Graphic rectange = new Rectange(10, 20);
		Graphic triangle = new Triangle(3, 4, 5);
		System.out.println(circle.calcArea());
		
		System.out.println(rectange.calcArea());
		System.out.println(triangle.calcArea());
		
	}

}
