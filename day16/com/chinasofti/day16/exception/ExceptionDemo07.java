/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExceptionDemo07.java
* Copyright 2017-08-03 By Gnosis. Allright reserved.
* Time: 下午3:33:51
*/
package com.chinasofti.day16.exception;

/**
 * throw:运用于方法内部，用于给调用者返回一个异常对象，和return一样并结束当前方法
 * @author Administrator
 *
 */
public class ExceptionDemo07 {

	public static void main(String[] args) {
		try {
			int ret = divide(10, 0);
			System.out.println(ret);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("抛出的异常是：" + e.getMessage());
		}
	}

	private static int divide(int i, int j) {
		System.out.println("begin.....");
		if (j == 0) {
			throw new ArithmeticException("除数不能为0");
			// 当j==0时，throw相当于return，返回的是一个错误的对象
		}
		int k = i / j;
		System.out.println("结果 k = " + k);

		return 0;
	}

}
