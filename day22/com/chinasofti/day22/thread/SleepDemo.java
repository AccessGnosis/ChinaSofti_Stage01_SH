/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SleepDemo.java
* Copyright 2017-08-11 By Gnosis. Allright reserved.
* Time: 下午2:32:44
*/
package com.chinasofti.day22.thread;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class SleepDemo {

	public static void main(String[] args) {
		System.out.println("新年马上来临……");
		System.out.println("进入倒计时.....");
		try {
			for (int i = 10; i >= 0; --i) {
				clear();
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("钟声敲响");
	}

	public static void clear() {
		try {
			Robot r;
			r = new Robot();
			r.mousePress(InputEvent.BUTTON3_MASK);
			r.mouseRelease(InputEvent.BUTTON3_MASK); // 释放鼠标右键
			r.keyPress(KeyEvent.VK_CONTROL); // 按下Ctrl键
			r.keyPress(KeyEvent.VK_R); // 按下R键
			r.keyRelease(KeyEvent.VK_R); // 释放R键
			r.keyRelease(KeyEvent.VK_CONTROL); // 释放Ctrl键
			r.delay(100);
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}
}
