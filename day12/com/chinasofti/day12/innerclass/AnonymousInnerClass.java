/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AnonymousInnerClass.java
* Copyright 2017-07-30 By Gnosis. Allright reserved.
* Time: ����11:34:28
*/
package com.chinasofti.day12.innerclass;

//��ʾ�����ڲ���
public class AnonymousInnerClass {

	public static void main(String[] args) {
		MotherBoard.pluginIn(new Mouse());
		MotherBoard.pluginIn(new Mouse());
		
		MotherBoard.pluginIn(new IUSB(){

			@Override
			public void work() {
				System.out.println("���̹�����...");
			}
			
		});
		
		MotherBoard.traverse();
	}

}

// ����USB�ӿ�
interface IUSB {
	void work();// ���й�������Ϊ�淶
}

class Mouse implements IUSB {

	@Override
	public void work() {// ��д�ӿ��еĳ��󷽷�
		System.out.println("��깤����...");
	}

}

class Printer implements IUSB {

	@Override
	public void work() {// ��д�ӿ��еĳ��󷽷�
		System.out.println("��ӡ��������...");
	}

}

class MotherBoard {
	private static IUSB[] usbs = new IUSB[6];
	private static int index = 0;

	public static void pluginIn(IUSB usb) {
		if (index == usbs.length) {
			System.out.println("USB�������");
			return;
		}
		// if (usb instanceof Mouse) {
		// System.out.println("������");
		// } else if (usb instanceof Printer) {
		// System.out.println("��ӡ������");
		// }
		usbs[index] = usb;
		index++;
	}

	public static void traverse() {
		for (IUSB usb : usbs) {
			if (usb != null) {
				usb.work();
			}
		}
	}
}