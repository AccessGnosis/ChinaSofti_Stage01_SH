/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Producer.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: ����9:37:55
*/
package com.chinasofti.day21.consprod;

public class Producer implements Runnable {
	private ShareResource resource;// ������Դ����

	// �вι���
	public Producer(ShareResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; ++i) {
			if (i % 2 != 0) {
				resource.push("С��", "��");
			} else {
				resource.push("С��", "Ů");
			}
		}
	}
}
