/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: ����9:37:28
*/
package com.chinasofti.day21.consprod;

public class MainClass {

	public static void main(String[] args) {
		// ���������ߺ������ߵĹ�ͬ����
		ShareResource resource = new ShareResource();
		// �����������߳�
		new Thread(new Producer(resource)).start();
		// �����������߳�
		new Thread(new Consumer(resource)).start();
	}

}
