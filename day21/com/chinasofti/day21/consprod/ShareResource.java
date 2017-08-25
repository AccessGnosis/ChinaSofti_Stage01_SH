/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ShareResource.java
* Copyright 2017-08-10 By Gnosis. Allright reserved.
* Time: ����9:38:19
*/
package com.chinasofti.day21.consprod;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;// �Ƿ�Ϊ��

	/*
	 * ʹ��Lock������
	 * 1.����������
	 */
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	// ������������Դ����洢����

	public void push(String name, String gender) {
		lock.lock();// ��ȡ��������
		try {
			if (!isEmpty) {// ����
				condition.await();// �ȼ���this.wait()
			}
			this.name = name;
			Thread.sleep(20);
			this.gender = gender;
			isEmpty = false;// ���գ�˵������ռ������ݣ��ȴ�������������
			condition.signal();	//�ȼ���this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	// �����ߴӹ�����Դ��ȡ����
	public void pop() {
		lock.lock();
		try {
			if (isEmpty) {
				condition.await();// �ȼ���this.wait()
			}
			System.out.println(this.name + "----" + this.gender);
			isEmpty = true;// ˵������ռ�Ϊ�գ��ȴ�������������
			condition.signal();	//�ȼ���this.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	/*
	 * ʹ��synchronized���ͬ����������
	 */
	// private boolean isEmpty = true;// �Ƿ�Ϊ��
	// // ������������Դ����洢����
	//
	// synchronized public void push(String name, String gender) {
	// if (!isEmpty) {// ����
	// try {
	// this.wait();// �õ�ǰ�߳̽���ȴ���
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
	// isEmpty = false;// ���գ�˵������ռ������ݣ��ȴ�������������
	// this.notifyAll();// ����������������
	// }
	//
	// // �����ߴӹ�����Դ��ȡ����
	// synchronized public void pop() {
	// if (isEmpty) {
	// try {
	// this.wait();
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// }
	// System.out.println(this.name + "----" + this.gender);
	// isEmpty = true;// ˵������ռ�Ϊ�գ��ȴ�������������
	// this.notify(); // ����������������
	// }
}
