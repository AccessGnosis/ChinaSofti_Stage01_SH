/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: GetGoodsPrice.java
* Copyright 2017-07-20 By Gnosis. Allright reserved.
* Time: обнГ2:39:44
*/
package com.chinasofti.day05.array;

public class GetGoodsPrice {

	public static void main(String[] args) {
		double sum = getGoodsPrice(1.2, 5.1, 6.0, 9, 4, 6.5);
		System.out.println(sum);
		System.out.println(cutOff(sum, 0.8));
	}

	public static double getGoodsPrice(double... arr) {
		double sum = 0;
		for (double i : arr) {
			sum += i;
		}
		return sum;
	}

	public static double cutOff(double sum, double cut) {
		return sum * cut;
	}
}
