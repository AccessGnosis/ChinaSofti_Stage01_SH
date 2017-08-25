/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ClientDemo.java
* Copyright 2017-08-18 By Gnosis. Allright reserved.
* Time: 上午10:01:25
*/
package com.chinasofti.day27.socket.threadpool;

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
	// 该socket，是用于连接在服务端的ServerSocket
	private Socket clientSocket;

	public ClientDemo() {
		try {
			System.out.println("正在链接服务端");
			clientSocket = new Socket("localhost", 8012);
			System.out.println("成功连接服务端");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ClientDemo client = new ClientDemo();
		client.start();
	}

	private void start() {
		/*
		 * 可以通过Socket的getOutputStream()方法
		 * 获取一条输出流，用于将信息发送给服务端。
		 */
		try {
			// 创建并启动线程，用来接收服务端的信息
			Runnable rnn = new GetServerInfoHandler();
			Thread t = new Thread(rnn);
			t.start();

			OutputStream out = clientSocket.getOutputStream();
			/*
			 * 使用字符流来根据指定的编码将字符串转换为字节，再通过out输出流
			 * 	再发送给服务端。
			 */
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			/*
			 * 将字符流包装成缓冲流，就可以按行为单位写出字符串
			 */
			PrintWriter pw = new PrintWriter(osw, true);

			Scanner scan = new Scanner(System.in);
			System.out.println("欢迎来到：");

			while (true) {
				System.out.println("请输入昵称：");
				String nickName = scan.nextLine();
				if (nickName.trim().length() > 0) {
					pw.println(nickName);
					break;
				}
				System.out.println("昵称不能为空");
			}

			while (true) {
				String str = scan.nextLine();
				pw.println(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 该线程的作用是循环接收服务端发送过来的信息，并输出到控制台
	 */
	class GetServerInfoHandler implements Runnable {

		@Override
		public void run() {
			try {
				// 通过clientSocket获取输入流
				InputStream in = clientSocket.getInputStream();
				// 将输入流转换为字符流
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				// 将字符输入流转换为缓冲流
				BufferedReader br = new BufferedReader(isr);

				String message = null;

				while ((message = br.readLine()) != null) {
					// 将服务端发送过来的信息打印出来
					System.out.println(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
