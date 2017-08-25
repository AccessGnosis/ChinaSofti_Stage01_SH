/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ClientDemo.java
* Copyright 2017-08-18 By Gnosis. Allright reserved.
* Time: ����10:01:25
*/
package com.chinasofti.day27.socket.copy;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo {
	// ��socket�������������ڷ���˵�ServerSocket
	private Socket clientSocket;

	public ClientDemo() {
		try {
			System.out.println("�������ӷ����");
			clientSocket = new Socket("localhost", 8088);
			System.out.println("�ɹ����ӷ����");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ClientDemo client = new ClientDemo();
		Scanner scan = new Scanner(System.in);
		while (true) {
			client.start(scan.nextLine());
		}
	}

	private void start(String str) {
		/*
		 * ����ͨ��Socket��getOutputStream()����
		 * ��ȡһ������������ڽ���Ϣ���͸�����ˡ�
		 */
		try {
			OutputStream out = clientSocket.getOutputStream();
			/*
			 * ʹ���ַ���������ָ���ı��뽫�ַ���ת��Ϊ�ֽڣ���ͨ��out�����
			 * 	�ٷ��͸�����ˡ�
			 */
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			/*
			 * ���ַ�����װ�ɻ��������Ϳ��԰���Ϊ��λд���ַ���
			 */
			PrintWriter pw = new PrintWriter(osw);
			pw.println(str);

			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
