/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExceptionDemo07.java
* Copyright 2017-08-03 By Gnosis. Allright reserved.
* Time: ����3:33:51
*/
package com.chinasofti.day16.exception;

/**
 * throw:�����ڷ����ڲ������ڸ������߷���һ���쳣���󣬺�returnһ����������ǰ����
 * @author Administrator
 *
 */
public class ExceptionDemo07 {

	public static void main(String[] args) {
		try {
			int ret = divide(10, 0);
			System.out.println(ret);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("�׳����쳣�ǣ�" + e.getMessage());
		}
	}

	private static int divide(int i, int j) {
		System.out.println("begin.....");
		if (j == 0) {
			throw new ArithmeticException("��������Ϊ0");
			// ��j==0ʱ��throw�൱��return�����ص���һ������Ķ���
		}
		int k = i / j;
		System.out.println("��� k = " + k);

		return 0;
	}

}
