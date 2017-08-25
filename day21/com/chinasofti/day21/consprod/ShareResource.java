/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ShareResource.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: 上午9:38:19
*/
package com.chinasofti.day21.consprod;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;// 是否为空

	/*
	 * 使用Lock锁机制
	 * 1.创建锁对象
	 */
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	// 生产者向共享资源对象存储数据

	public void push(String name, String gender) {
		lock.lock();// 获取锁，加锁
		try {
			if (!isEmpty) {// 不空
				condition.await();// 等价于this.wait()
			}
			this.name = name;
			Thread.sleep(20);
			this.gender = gender;
			isEmpty = false;// 不空，说明共享空间有数据，等待消费者来消费
			condition.signal();	//等价于this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	// 消费者从共享资源中取数据
	public void pop() {
		lock.lock();
		try {
			if (isEmpty) {
				condition.await();// 等价于this.wait()
			}
			System.out.println(this.name + "----" + this.gender);
			isEmpty = true;// 说明共享空间为空，等待生产者来生产
			condition.signal();	//等价于this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	/*
	 * 使用synchronized解决同步并发问题
	 */
	// private boolean isEmpty = true;// 是否为空
	// // 生产者向共享资源对象存储数据
	//
	// synchronized public void push(String name, String gender) {
	// if (!isEmpty) {// 不空
	// try {
	// this.wait();// 让当前线程进入等待期
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// }
	// this.name = name;
	// try {
	// Thread.sleep(5);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// this.gender = gender;
	// isEmpty = false;// 不空，说明共享空间有数据，等待消费者来消费
	// this.notifyAll();// 唤醒消费者来消费
	// }
	//
	// // 消费者从共享资源中取数据
	// synchronized public void pop() {
	// if (isEmpty) {
	// try {
	// this.wait();
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// }
	// System.out.println(this.name + "----" + this.gender);
	// isEmpty = true;// 说明共享空间为空，等待生产者来生产
	// this.notify(); // 唤醒生产者来生产
	// }
}
