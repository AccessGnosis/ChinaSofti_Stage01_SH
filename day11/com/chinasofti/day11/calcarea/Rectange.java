/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Rectange.java
* Copyright 2017-07-29 By Gnosis. Allright reserved.
* Time: ионГ9:17:10
*/
package com.chinasofti.day11.calcarea;

public class Rectange extends Graphic {

	private double a;
	private double b;

	public Rectange(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double calcArea() {
		return (a * b);
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

}
