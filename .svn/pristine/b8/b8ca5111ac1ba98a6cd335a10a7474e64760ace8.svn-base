/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: NumbericFunction.java
* Copyright 2017-08-02 By Gnosis. Allright reserved.
* Time: 下午2:38:56
*/
package com.chinasofti.day15.task02.di03.numfun;

public class NumbericFunction {
	public static void numbericJudge(Number number) {
		if (number instanceof Integer) {
			System.out.println("这是一个整数：" + number);
		} else if (number instanceof Double) {
			System.out.println("这是一个小数：" + number);
		} else {
			System.out.println("数字格式不正确");
		}
	}

	public static void numbericJudge(String number) {
		byte type = -1;

		for (int i = 0; i < number.length(); ++i) {
			if (number.charAt(i) == '.') {
				type = 2;
				break;
			} else if (i == number.length() - 1) {
				type = 1;
				break;
			}
		}
		if (number.matches("[^0-9]*")) {
			type = -1;
		}
		switch (type) {
		case -1:
			System.out.println("数字格式不正确");
			break;
		case 1:
			System.out.println("这是一个整数：" + number);
			break;
		case 2:
			System.out.println("这是一个小数：" + number);
			break;
		default:
			System.out.println("数字格式不正确");
			break;

		}
	}

	public static void numbericJudgeRegex(String number) {
		byte type = -1;
		
		if (number.matches("[^0-9]*")) {
			type = -1;
		}else if(number.matches("\\d+[.]\\d*")){
			type = 2;
		}else if(number.matches("\\d*")){
			type = 1;
		}
		
		switch (type) {
		case -1:
			System.out.println("数字格式不正确");
			break;
		case 1:
			System.out.println("这是一个整数：" + number);
			break;
		case 2:
			System.out.println("这是一个小数：" + number);
			break;
		default:
			System.out.println("数字格式不正确");
			break;
		}
	}

}
