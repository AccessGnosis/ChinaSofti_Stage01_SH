/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Producer.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: 上午9:37:55
*/
package com.chinasofti.day21.consprod;

public class Producer implements Runnable {
	private ShareResource resource;// 共享资源对象

	// 有参构造
	public Producer(ShareResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; ++i) {
			if (i % 2 != 0) {
				resource.push("小龙", "男");
			} else {
				resource.push("小丽", "女");
			}
		}
	}
}
