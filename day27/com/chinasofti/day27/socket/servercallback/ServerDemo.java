/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Server.java
* Copyright 2017-08-18 By Gnosis. Allright reserved.
* Time: ����9:45:19
*/
package com.chinasofti.day27.socket.servercallback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//����˳���
public class ServerDemo {
	// �����ڷ���˵�Socket����
	private ServerSocket server;
	// �̳߳أ���������ͻ������ӵĽ����߳�
	private ExecutorService threadPool;

	// �޲ι��죬��ʼ������˶���
	public ServerDemo() {
		try {
			System.out.println("��ʼ��������");
			server = new ServerSocket(8088);
			// ��ʼ�����ӳ�
			threadPool = Executors.newFixedThreadPool(50);
			System.out.println("����˳�ʼ�����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ServerDemo server = new ServerDemo();
		server.start();
	}

	// ����˿�ʼ�����ķ���
	private void start() {
		try {
			System.out.println("�ȴ��ͻ�������");
			/*
			 * ServerSocket��accept()���������ڼ���8088�˿ڣ��ȴ��ͻ��˵����ӣ�
			 * �÷�����һ������������ֱ��һ���ͻ��˵����ӣ�
			 * ����һ�����������ͻ��������˷��ص��ǿͻ��˵�Socket
			 */
			while (true) {
				Socket clientSocket = server.accept();
				// System.out.println("һ���ͻ���������");
				/*
				 * ͨ��socket��ȡ�ͻ��˵ĵ�ַ��Ϣ
				 */

				/*
				 * ��һ���ͻ������Ӻ�����һ���߳�ClientHandler��Ȼ��
				 */
				Runnable handler = new ClientHandler(clientSocket);

//				Thread t = new Thread(handler);
//				t.start();
				/*
				 * ʹ���̳߳ط�������߳�������ǰ���ӵĿͻ���
				 */
				threadPool.execute(handler);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

/*
 * �������һ���̣߳����ں�ĳ���ͻ��˽���
 * ʹ���̵߳�Ŀ�ľ���ʹ�÷���˿��Դ������ͻ���
 */
class ClientHandler implements Runnable {
	// ��ǰ�̴߳���Ŀͻ��˵�Socket
	private Socket clientSocket;
	private InetAddress address;

	public ClientHandler(Socket socket) {
		this.clientSocket = socket;
		// ͨ��clientSocket��ȡ�ͻ��˵ĵ�ַ��Ϣ
		address = clientSocket.getInetAddress();
		// ��ȡ�ͻ��˵�IP
		String ip = address.getHostAddress();
		// ��ȡ�ͻ��˵Ķ˿�
		int port = clientSocket.getPort();
		System.out.println(ip + ":" + port + " �ͻ���������");
	}

	@Override
	public void run() {
		try {
			/*
			 * ͨ���ո������ϵĿͻ��˵�clientSocket��ȡ��������
			 * 	����ȡ�ͻ��˷��͹�������Ϣ��
			 */
			InputStream in = clientSocket.getInputStream();
			/*
			 * ���ֽ���ת�����ַ�����ָ�����뼯
			 */
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			/*
			 * ���ַ���ת���ɻ������������Ϳ�������Ϊ��λ��ȡ�ַ���
			 */
			BufferedReader br = new BufferedReader(isr);
			String message = null;
			while ((message = br.readLine()) != null) {
				System.out.println(address.getHostAddress() + ":" + clientSocket.getPort() + " ˵��" + message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				clientSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}