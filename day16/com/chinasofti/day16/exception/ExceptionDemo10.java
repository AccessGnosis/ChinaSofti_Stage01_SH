/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExceptionDemo10.java
* Copyright 2017-08-03 By Gnosis. Allright reserved.
* Time: 下午5:12:36
*/
package com.chinasofti.day16.exception;

//自定义异常
public class ExceptionDemo10 {

	public static void main(String[] args) {
		try {
			register("唐僧");
		} catch (LogicException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	// 模拟注册
	public static void register(String username) {
		// 表示已经注册的用户信息
		String[] names = { "张三", "李四", "唐僧", "八戒" };
		for (String name : names) {
			if (name.equals(username)) {
				throw new LogicException("用户名重复");
			}
		}
	}

}

class LogicException extends RuntimeException {
	public LogicException(String msg) {
		super(msg);
	}

	public LogicException(String message, Throwable cause) {
		// message:错误信息 ；cause:导致的原因
		super(message, cause);
	}
}