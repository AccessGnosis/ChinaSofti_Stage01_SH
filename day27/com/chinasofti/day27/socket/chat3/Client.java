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

//客户端的程序
public class Client {
	// 该clientSocket,是用于连接在服务端的Socket.
	private Socket clientSocket;

	// 无参构造,用于初始化客户端
	public Client() {
		try {
			System.out.println("正在连接服务端.....");
			clientSocket = new Socket("localhost", 8012);
			System.out.println("成功连接服务端...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 客户端启动方法
	public void start() {

		try {
			// 创建并启动线程,用来接受服务端的信息
			Runnable rnn = new GetServerInfoHandler();
			Thread t = new Thread(rnn);
			t.start();
			/*
			 * 可以通过Socket的getOutputStream()方法
			 * 获取一条输出流,用于将信息发送给服务端.
			 */
			OutputStream out = clientSocket.getOutputStream();
			/*
			 * 使用字符流来根据指定的编码将字符串转换为字节,在通过out发送给服务端
			 */
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			/*
			 * 将字符流包装成缓冲流,就可以按行为单位写出字符串了
			 */
			PrintWriter pw = new PrintWriter(osw, true);

			// pw.println("你好,服务端!");
			// pw.flush();
			// 从控制台输入
			Scanner scan = new Scanner(System.in);
			System.out.println("欢迎来到撩汉群...");

			while (true) {
				System.out.println("请输入昵称:");
				String nickName = scan.nextLine();
				if (nickName.trim().length() > 0) {
					pw.println(nickName);
					// pw.flush();
					break;
				}
				System.out.println("昵称不能为空...");
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
			System.out.println("客户端连接异常...");
		}
	}

	/**
	 * 该线程的作用是循环接受服务端发送过来的信息,并输出到控制台
	 * @author Administrator
	 *
	 */
	class GetServerInfoHandler implements Runnable {

		public void run() {

			try {
				// 通过clientSocket获取输入流
				InputStream in = clientSocket.getInputStream();
				// 将输入流转换为字符流
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
				// 将字符输入流转换为缓冲流
				BufferedReader br = new BufferedReader(isr);
				String message = null;
				while ((message = br.readLine()) != null) {
					// 将服务端发送过来的字符串打印输出到客户端的控制台
					System.out.println(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}