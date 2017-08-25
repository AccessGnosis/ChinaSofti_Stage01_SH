/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExceptionDemo02.java
* Copyright 2017-08-03 By Gnosis. Allright reserved.
* Time: 下午1:46:33
*/
package com.chinasofti.day16.exception;

public class ExceptionDemo03 {

	public static void main(String[] args) {
		// 模拟用户输入的操作数据
		String inputNum1 = "1b";
		String inputNum2 = "0";
		// 把String类型转换为int类型
		try {
			int a = Integer.valueOf(inputNum1);
			int b = Integer.valueOf(inputNum2);
			int c = a / b;
			System.out.println("结果c = " + c);
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			System.out.println("捕获的数字格式异常为" + e.getMessage());
			int b = Integer.valueOf(inputNum2);
			int c = 10 / b;
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			int a = Integer.valueOf(inputNum1);
			System.out.println("捕获的算术异常为" + e);
		} catch (Exception e) {
			// 父类异常应该写在所有子类异常的最后
			System.out.println("捕获其他类型的异常为" + e);
		} finally {
			try {
				int a = Integer.valueOf(inputNum1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
