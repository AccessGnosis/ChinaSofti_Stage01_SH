package com.chinasofti.day27.socket.chat4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//����˳���
public class Server {
	// �����ڷ���˵�socket����
	private ServerSocket serverSocket;
	// �̳߳�,��������ͻ������ӵĽ����߳�
	private ExecutorService threadPool;
	// �������пͻ���������ļ���
	private List<PrintWriter> allOut;

	// �޲ι���,��ʼ������˶���
	public Server() {
		try {
			System.out.println("��ʼ��������...");
			serverSocket = new ServerSocket(8088);
			Thread.sleep(2000);
			// ��ʼ�����ӳ�
			threadPool = Executors.newFixedThreadPool(50);
			// ��ʼ��������пͻ���������ļ���
			allOut = new ArrayList<PrintWriter>();
			System.out.println("����˳�ʼ�����...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ����˿�ʼ�����ķ���
	public void start() {
		try {

			/*
			 * ServerSocket��accept()����,���ڼ���8088�˿�,�ȴ��ͻ��˵�����,
			 * �÷�����һ����������,ֱ��һ���ͻ��˵�����, ����һֱ����,���ͻ��������˷��ص��ǿͻ��˵�Socket.
			 */
			while (true) {
				System.out.println("�ȴ��ͻ�������...");
				Socket clientSocket = serverSocket.accept();
				// System.out.println("һ���ͻ���������...");

				/*
				 * ��һ���ͻ������Ӻ�,����һ���߳�ClientHandler,���ÿͻ��˵�Socket����,
				 * ʹ�ø��̴߳�����ÿͻ��˵Ľ���.
				 */
				Runnable handler = new ClientHandler(clientSocket);
				//
				// Thread t = new Thread(handler);
				// t.start();
				/*
				 * ʹ���̳߳ط�������߳�������ǰ���ӵĿͻ���
				 */
				threadPool.execute(handler);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ����������������빲����
	public void addOut(PrintWriter pw) {
		synchronized (this) {
			allOut.add(pw);
		}
	}

	// ��������������ӹ�������ɾ��
	public void removeOut(PrintWriter pw) {
		synchronized (this) {
			allOut.remove(pw);
		}
	}

	// ����������Ϣת�������еĿͻ���
	public void sendMessageToAllClient(String message) {
		synchronized (this) {
			for (PrintWriter pw : allOut) {
				pw.println(message);
			}
		}
	}

	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����˳�ʼ��ʧ��");
		}
	}

	/*
	 * �������һ���߳�,���ں�ĳ���ͻ��˽��� ʹ���̵߳�Ŀ�ľ���ʹ�÷���˿��Դ������ͻ���
	 */
	class ClientHandler implements Runnable {
		// ��ǰ�̴߳���ÿͻ��˵�Socket.
		private Socket clientSocket;
		// ��ǰ�ͻ��˵��ǳ�
		private String nickName;
		// ��ǰ�ͻ��˵�ip
		private String ip;
		// ��ǰ�ͻ��˵Ķ˿�
		private int port;

		public ClientHandler(Socket socket) {
			this.clientSocket = socket;
			// ͨ��clientSocket��ȡ�ͻ��˵ĵ�ַ��Ϣ
			InetAddress address = clientSocket.getInetAddress();
			// ��ȡ�ͻ��˵�ip
			ip = address.getHostAddress();
			// ��ȡ�ͻ��˵Ķ˿�
			port = clientSocket.getPort();
			System.out.println(ip + ":" + port + " �ͻ���������");
		}

		public void run() {
			PrintWriter pw = null;
			try {
				/*
				 * ����ͨ��clientSocket��getOutputStream()����
				 * ��ȡһ�������,���ڽ���Ϣ���͸��ͻ���.
				 */
				OutputStream out = clientSocket.getOutputStream();
				/*
				 * ʹ���ַ���������ָ���ı��뽫�ַ���ת��Ϊ�ֽ�,��ͨ��out���͸������
				 */
				OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
				/*
				 * ���ַ�����װ�ɻ�����,�Ϳ��԰���Ϊ��λд���ַ�����
				 */
				pw = new PrintWriter(osw, true);
				/*
				 * ��Ҫ���ÿͻ��˵���������뵽��������,Ŀ��ʹ�øÿͻ���Ҳ�ܽ��ܵ������ת������Ϣ
				 */
				addOut(pw);
				System.out.println("��ǰ����������: " + allOut.size());
				/*
				 * ͨ���ո������ϵĿͻ��˵�clientSocket��ȡ������, ����ȡ�ͻ��˷��͹�������Ϣ.
				 */
				InputStream in = clientSocket.getInputStream();
				/*
				 * ���ֽ���ת�����ַ�����ָ�����뼯
				 */
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				/*
				 * ���ַ���ת���ɻ�����,�����Ϳ�������Ϊ��λ��ȡ�ַ���
				 */
				BufferedReader br = new BufferedReader(isr);
				/*
				 * �������õ�ǰ�ͻ��˵���������,��ȡ�ĵ�һ���ַ���,����Ϊ�ǳ�
				 */
				nickName = br.readLine();
				// ֪ͨ���еĿͻ�,��ǰ���û�������
				sendMessageToAllClient("[" + nickName + "]������");
				String message = null;
				while ((message = br.readLine()) != null) {
					// System.out.println("�ͷ���˵:" + message);
					// pw.println(message);
					// pw.flush();
					// ����ȡ���ͻ��˷��͹�������Ϣ,ת�������еĿͻ���
					sendMessageToAllClient(nickName + "˵: " + message);
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				/*
				 * ���ÿͻ��˵�������Ӽ������Ƴ�
				 */
				removeOut(pw);
				System.out.println("��ǰ����������: " + allOut.size());
				// ֪ͨ���пͻ���,���û�������
				sendMessageToAllClient(nickName + "������...");
				try {
					clientSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("һ���ͻ���������...");

			}

		}

	}
}
