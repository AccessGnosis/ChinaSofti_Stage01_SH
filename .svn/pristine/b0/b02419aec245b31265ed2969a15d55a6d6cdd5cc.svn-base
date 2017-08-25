/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_02.java
* Copyright 2017-08-22 By Gnosis. Allright reserved.
* Time: 下午2:38:45
*/
package com.chinasofti.exam01;

import java.math.BigDecimal;

public class Di_02 {

	public static void main(String[] args) {
		Minus m1 = new Minus(1, 2);
		Minus m2 = new Minus(-1, 2);
		System.out.println(m2.plus());
		System.out.println(m2.substraction());
		System.out.println(m2.multi());
	}

}

class Minus {
	private double a;
	private double b;

	public Minus(double a, double b) {
		if (a >= 0 && b >= 0) {
			System.err.println("a,b均不为负数.请重新指定");
		} else {
			this.a = a;
			this.b = b;
		}
	}

	double plus() {
		double result = a + b;

		return result;
	}

	double substraction() {
		BigDecimal dba = new BigDecimal(a);
		BigDecimal dbb = new BigDecimal(b);
		BigDecimal dbr = dba.subtract(dbb);

		return dbr.doubleValue();
	}

	double multi() {
		double result = a * b;

		return result;
	}

	@Override
	public String toString() {
		return "Minus [a=" + a + ", b=" + b + "]";
	}
}