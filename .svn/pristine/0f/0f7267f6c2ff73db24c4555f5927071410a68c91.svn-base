/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: 下午3:14:37
*/
package com.chinasofti.day15.task03.di01.goodscalc;

import java.text.ParseException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {
		System.out.println("请输入生产日期(yyyy-MM-dd)");
		String goodbirth = new Scanner(System.in).nextLine();
//		String goodbirth = "2014-03-01";
		System.out.println("请输入保质期(天数)");
		int goodalive = new Scanner(System.in).nextInt();
//		int goodalive = 30;
		System.out.println("促销日为：" + GoodsDetail.getResultDay(goodbirth, goodalive));
	}

}
