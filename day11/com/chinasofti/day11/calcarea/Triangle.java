/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Triangle.java
* Copyright 2017-07-29 By Gnosis. Allright reserved.
* Time: ÉÏÎç9:18:50
*/
package com.chinasofti.day11.calcarea;

public class Triangle extends Graphic {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double calcArea() {
		double p = 0.5 * (a + b + c);

		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return result;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

}
