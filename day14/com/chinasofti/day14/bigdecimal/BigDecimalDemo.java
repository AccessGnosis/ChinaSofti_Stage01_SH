/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: BigDecimalDemo.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: ионГ11:22:19
*/
package com.chinasofti.day14.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		double d1 = 2.0;
		double d2 = 1.09;
		System.out.println(d1 - d2);

		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("1.09");

		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.divide(bd2));
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

}
