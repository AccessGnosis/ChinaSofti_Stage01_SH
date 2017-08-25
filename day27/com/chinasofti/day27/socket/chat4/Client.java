package com.chinasofti.day27.socket.chat4;

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

//�ͻ��˵ĳ���
public class Client {
	// ��clientSocket,�����������ڷ���˵�Socket.
	private Socket clientSocket;

	// �޲ι���,���ڳ�ʼ���ͻ���
	public Client() {
		try {
			System.out.println("�������ӷ����.....");
			clientSocket = new Socket("192.168.80.1", 8088);
			System.out.println("�ɹ����ӷ����...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �ͻ�����������
	public void start() {

		try {
			// �����������߳�,�������ܷ���˵���Ϣ
			Runnable rnn = new GetServerInfoHandler();
			Thread t = new Thread(rnn);
			t.start();
			/*
			 * ����ͨ��Socket��getOutputStream()����
			 * ��ȡһ�������,���ڽ���Ϣ���͸������.
			 */
			OutputStream out = clientSocket.getOutputStream();
			/*
			 * ʹ���ַ���������ָ���ı��뽫�ַ���ת��Ϊ�ֽ�,��ͨ��out���͸������
			 */
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			/*
			 * ���ַ�����װ�ɻ�����,�Ϳ��԰���Ϊ��λд���ַ�����
			 */
			PrintWriter pw = new PrintWriter(osw, true);

			// pw.println("���,�����!");
			// pw.flush();
			// �ӿ���̨����
			Scanner scan = new Scanner(System.in);
			System.out.println("��ӭ�����ú�Ⱥ...");

			while (true) {
				System.out.println("�������ǳ�:");
				String nickName = scan.nextLine();
				if (nickName.trim().length() > 0) {
					pw.println(nickName);
					// pw.flush();
					break;
				}
				System.out.println("�ǳƲ���Ϊ��...");
			}
			while (true) {
				String str = scan.nextLine();
				pw.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ͻ��������쳣...");
		}
	}

	/**
	 * ���̵߳�������ѭ�����ܷ���˷��͹�������Ϣ,�����������̨
	 * @author Administrator
	 *
	 */
	class GetServerInfoHandler implements Runnable {

		public void run() {

			try {
				// ͨ��clientSocket��ȡ������
				InputStream in = clientSocket.getInputStream();
				// ��������ת��Ϊ�ַ���
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
				// ���ַ�������ת��Ϊ������
				BufferedReader br = new BufferedReader(isr);
				String message = null;
				while ((message = br.readLine()) != null) {
					// ������˷��͹������ַ�����ӡ������ͻ��˵Ŀ���̨
					System.out.println(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
