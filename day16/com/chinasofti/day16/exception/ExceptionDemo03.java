/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ExceptionDemo02.java
* Copyright 2017-08-03 By Gnosis. Allright reserved.
* Time: ����1:46:33
*/
package com.chinasofti.day16.exception;

public class ExceptionDemo03 {

	public static void main(String[] args) {
		// ģ���û�����Ĳ�������
		String inputNum1 = "1b";
		String inputNum2 = "0";
		// ��String����ת��Ϊint����
		try {
			int a = Integer.valueOf(inputNum1);
			int b = Integer.valueOf(inputNum2);
			int c = a / b;
			System.out.println("���c = " + c);
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			System.out.println("��������ָ�ʽ�쳣Ϊ" + e.getMessage());
			int b = Integer.valueOf(inputNum2);
			int c = 10 / b;
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			int a = Integer.valueOf(inputNum1);
			System.out.println("����������쳣Ϊ" + e);
		} catch (Exception e) {
			// �����쳣Ӧ��д�����������쳣�����
			System.out.println("�����������͵��쳣Ϊ" + e);
		} finally {
			try {
				int a = Integer.valueOf(inputNum1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
