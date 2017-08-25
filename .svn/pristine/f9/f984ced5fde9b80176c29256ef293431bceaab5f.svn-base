/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_03.java
* Copyright 2017-08-22 By Gnosis. Allright reserved.
* Time: 下午2:50:59
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
				production.push("电视机" + (i + 1));
			} else if (i % 3 == 1) {
				production.push("洗衣机" + (i + 1));
			} else {
				production.push("电冰箱" + (i + 1));
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
	private boolean isEmpty = true;// 是空

	// 生产
	synchronized public void push(String name) {
		if (!isEmpty) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name;
		System.out.println("正在生产：" + name);
		isEmpty = false;
		this.notifyAll();
	}

	// 消费
	synchronized public void pop() {
		if (isEmpty) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("正在消费：" + name);
		isEmpty = true;
		this.notifyAll();
	}
}