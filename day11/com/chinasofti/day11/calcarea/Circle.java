/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Circle.java
* Copyright 2017-07-29 By Gnosis. Allright reserved.
* Time: ионГ9:15:47
*/
package com.chinasofti.day11.calcarea;

public class Circle extends Graphic {

	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double calcArea() {
		return (Math.PI * Math.pow(r, 2));
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}
