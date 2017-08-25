/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_03.java
* Copyright 2017-08-22 By Gnosis. Allright reserved.
* Time: ����2:50:59
*/
package com.chinasofti.exam01;

public class Di_03 {

	public static void main(String[] args) {
		Production production = new Production();
		new Thread(new Producer(production)).start();
		new Thread(new Consumer(production)).start();
	}

}

class Producer implements Runnable {
	private Production production;

	public Producer(Production production) {
		this.production = production;
	}

	@Override
	public void run() {
		for (int i = 0; i < 300; ++i) {
			if (i % 3 == 0) {
				production.push("���ӻ�" + (i + 1));
			} else if (i % 3 == 1) {
				production.push("ϴ�»�" + (i + 1));
			} else {
				production.push("�����" + (i + 1));
			}
		}
	}
}

class Consumer implements Runnable {
	private Production production;

	public Consumer(Production production) {
		this.production = production;
	}

	@Override
	public void run() {
		for (int i = 0; i < 300; ++i) {
			production.pop();
		}
	}
}

class Production {
	private String name;
	private boolean isEmpty = true;// �ǿ�

	// ����
	synchronized public void push(String name) {
		if (!isEmpty) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name;
		System.out.println("����������" + name);
		isEmpty = false;
		this.notifyAll();
	}

	// ����
	synchronized public void pop() {
		if (isEmpty) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�������ѣ�" + name);
		isEmpty = true;
		this.notifyAll();
	}
}