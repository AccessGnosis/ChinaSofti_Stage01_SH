/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExceptionDemo07.java
* Copyright 2017-08-03 By Gnosis. Allright reserved.
* Time: 下午3:33:51
*/
package com.chinasofti.day16.exception;

public class ExceptionDemo09 {

	public static void main(String[] args) {
		try {
			int ret = divide(10, 0);
			System.out.println(ret);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("抛出的异常是：" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int divide(int i, int j) throws Exception {
		System.out.println("begin.....");
		if (j == 0) {
			throw new Exception("除数不能为0");
			// Exception异常必须处理或抛出
			// 当j==0时，throw相当于return，返回的是一个错误的对象
		}
		int k = i / j;
		System.out.println("结果 k = " + k);

		return 0;
	}

}
