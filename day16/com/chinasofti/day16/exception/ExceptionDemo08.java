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
 * throws：运用于方法声明之上，用于表示当前方法不处理这个异常对象，而是提醒方法的调用者来处理异常/抛出异常。
 * @author Administrator
 * 
 * 如果每一个方法都放弃处理该异常，直接用throws往外抛，最后异常会抛给main()方法。
 * 如果main()方法还不处理，继续抛出，最后给JVM虚拟机，虚拟机调用底层代码打印该异常的栈信息。
 */
public class ExceptionDemo08 {

	public static void main(String[] args) {
		// System.out.println("abcd".charAt(-1));//字符串越界异常
		int ret = divide(10, 0);
		System.out.println(ret);
	}

	private static int divide(int i, int j) throws ArithmeticException {
		System.out.println("begin.....");
		int k = i / j;
		System.out.println("结果 k = " + k);

		return 0;
	}

}
