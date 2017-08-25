/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: StackDemo.java
* Copyright 2017-08-07 By Gnosis. Allright reserved.
* Time: 下午2:22:02
*/
package com.chinasofti.day18.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("a");// 压栈
		s.push("b");
		s.push("c");
		s.push("d");
		System.out.println(s);
		s.pop(); // 出栈
		System.out.println(s);
		System.out.println(s.peek());// 返回栈顶元素
		System.out.println(s.isEmpty());
		System.out.println(s.empty());
		s.push("b");
		System.out.println(s.search("b"));
		// 返回的是对象在栈中的位置，从栈顶开始的。//基数从1开始
	}

}
