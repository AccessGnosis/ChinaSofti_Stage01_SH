/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ClientDemo.java
* Copyright 2017-08-18 By Gnosis. Allright reserved.
* Time: ����10:01:25
*/
package com.chinasofti.day27.socket.chat3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			clientSocket = new Socket("localhost", 8012);
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
			// �����������̣߳��������շ���˵���Ϣ
			Runnable rnn = new GetServerInfoHandler();
			Thread t = new Thread(rnn);
			t.start();

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

	/*
	 * ���̵߳�������ѭ�����շ���˷��͹�������Ϣ�������������̨
	 */
	class GetServerInfoHandler implements Runnable {

		@Override
		public void run() {
			try {
				// ͨ��clientSocket��ȡ������
				InputStream in = clientSocket.getInputStream();
				// ��������ת��Ϊ�ַ���
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				// ���ַ�������ת��Ϊ������
				BufferedReader br = new BufferedReader(isr);

				String message = null;

				while ((message = br.readLine()) != null) {
					// ������˷��͹�������Ϣ��ӡ����
					System.out.println("�����˵��" + message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
