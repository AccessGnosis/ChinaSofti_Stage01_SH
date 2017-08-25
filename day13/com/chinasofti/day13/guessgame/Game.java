/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Game.java
* Copyright 2017-07-31 By Gnosis. Allright reserved.
* Time: ����8:24:01
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
		System.out.println("��ӭ���� ����ĸ ��Ϸ");
		System.out.println("=========================");
		System.out.println("��������ĸ��ϣ����س�ȷ��");
		System.out.println("(�Ѻ��Դ�Сд)");
		// ��ȡ��������ַ���
		String getRamdomChars = StringsUtils.getRamdomChars();
		System.out.println("���ף�" + getRamdomChars);
		// ѭ���ж�
		while (true) {
			// ��ȡ�û������ַ���
			String userinput = new Scanner(System.in).nextLine();
			if (StringsUtils.comparedFullStrings(userinput, getRamdomChars)) {
				System.out.println("��Ϸͨ��");
				Game.getResultScore();
				break;
			} else if (StringsUtils.compareStrings(userinput, getRamdomChars)) {
				Game.substractScore();
			}
		}
	}

	private static void gameOver() {
		System.out.println("��Ϸ����");
		System.out.println("��ǰ������" + INIT_FULL_SCORE + "��");
		System.exit(-1);
	}

	private static void substractScore() {
		System.out.println("������˼�����´���");
		INIT_FULL_SCORE -= 10;
		getResultScore();
	}

	private static void getResultScore() {
		if (INIT_FULL_SCORE <= 0) {
			gameOver();
		}
		System.out.println("��ǰ������" + INIT_FULL_SCORE + "��");
	}

}
