/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FinalizeDemo.java
* Copyright 2017-08-01 By Gnosis. Allright reserved.
* Time: 下午2:03:49
*/
package com.chinasofti.day14.finalize;

import java.util.Arrays;

public class FinalizeDemo {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		int[] arr1 = new int[10];
		System.arraycopy(arr, 0, arr1, 3, 3);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));
		long nowTime = System.currentTimeMillis();
		System.out.println(nowTime);
		System.exit(-1);
		new FinalizeDemo();
		new FinalizeDemo();
		new FinalizeDemo();
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("当前对象被销毁");
		super.finalize();
	}
}
