/**
* Describe: 定义一个USB接口，这种具有某种规范的行为（work()）
* 	class MotherBoard: [6个USB接口的插槽]
* 	class Mouse
* 	class Printer
* Keyword: 
* Hint: 
* Filename: InterfaceDemo2.java
* Copyright 2017-07-29 By Gnosis. Allright reserved.
* Time: 下午2:13:28
*/
package com.chinasofti.day11.inerfacedemo;

public class InterfaceDemo02 {
	public static void main(String[] args) {
		// new IUSB();//接口是不能被直接实例化的
		MotherBoard.pluginIn(new Mouse());
		MotherBoard.pluginIn(new Mouse());
		MotherBoard.pluginIn(new Mouse());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Mouse());
		MotherBoard.pluginIn(new Mouse());
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
//		if (usb instanceof Mouse) {
//			System.out.println("鼠标插入");
//		} else if (usb instanceof Printer) {
//			System.out.println("打印机插入");
//		}
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