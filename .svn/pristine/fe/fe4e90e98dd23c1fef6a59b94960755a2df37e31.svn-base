/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Game.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: 下午8:24:01
*/
package com.chinasofti.day13.guessgame;

import java.util.Scanner;

public class Game {
	public static int INIT_FULL_SCORE = 100;
	public static int RDM_CHAR_NUMS = 5;

	public Game(int rdmCharNums) {
		Game.RDM_CHAR_NUMS = rdmCharNums;
	}

	public void init() {
		System.out.println("欢迎来到 猜字母 游戏");
		System.out.println("=========================");
		System.out.println("请输入字母组合，按回车确定");
		System.out.println("(已忽略大小写)");
		// 获取随机生成字符串
		String getRamdomChars = StringsUtils.getRamdomChars();
		System.out.println("作弊：" + getRamdomChars);
		// 循环判断
		while (true) {
			// 获取用户输入字符串
			String userinput = new Scanner(System.in).nextLine();
			if (StringsUtils.comparedFullStrings(userinput, getRamdomChars)) {
				System.out.println("游戏通关");
				Game.getResultScore();
				break;
			} else if (StringsUtils.compareStrings(userinput, getRamdomChars)) {
				Game.substractScore();
			}
		}
	}

	private static void gameOver() {
		System.out.println("游戏结束");
		System.out.println("当前分数：" + INIT_FULL_SCORE + "分");
		System.exit(-1);
	}

	private static void substractScore() {
		System.out.println("不好意思，您猜错了");
		INIT_FULL_SCORE -= 10;
		getResultScore();
	}

	private static void getResultScore() {
		if (INIT_FULL_SCORE <= 0) {
			gameOver();
		}
		System.out.println("当前分数：" + INIT_FULL_SCORE + "分");
	}

}
