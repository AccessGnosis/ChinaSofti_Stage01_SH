/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Consumer.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: ����9:38:02
*/
package com.chinasofti.day21.consprod;

public class Consumer implements Runnable {
	private ShareResource resource;// ������Դ����

	public Consumer(ShareResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; ++i) {
			resource.pop();
		}
	}
}
