/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AnonymousInnerClass.java
* Copyright 2017-07-30 By Gnosis. Allright reserved.
* Time: 上午11:34:28
*/
package com.chinasofti.day12.innerclass;

//演示匿名内部类
public class AnonymousInnerClass {

	public static void main(String[] args) {
		MotherBoard.pluginIn(new Mouse());
		MotherBoard.pluginIn(new Mouse());
		
		MotherBoard.pluginIn(new IUSB(){

			@Override
			public void work() {
				System.out.println("键盘工作中...");
			}
			
		});
		
		MotherBoard.traverse();
	}

}

// 定义USB接口
interface IUSB {
	void work();// 具有工作的行为规范
}

class Mouse implements IUSB {

	@Override
	public void work() {// 重写接口中的抽象方法
		System.out.println("鼠标工作中...");
	}

}

class Printer implements IUSB {

	@Override
	public void work() {// 重写接口中的抽象方法
		System.out.println("打印机工作中...");
	}

}

class MotherBoard {
	private static IUSB[] usbs = new IUSB[6];
	private static int index = 0;

	public static void pluginIn(IUSB usb) {
		if (index == usbs.length) {
			System.out.println("USB插口满了");
			return;
		}
		// if (usb instanceof Mouse) {
		// System.out.println("鼠标插入");
		// } else if (usb instanceof Printer) {
		// System.out.println("打印机插入");
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