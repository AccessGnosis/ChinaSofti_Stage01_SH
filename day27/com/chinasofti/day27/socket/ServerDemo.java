/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Server.java
* Copyright 2017-08-18 By Gnosis. Allright reserved.
* Time: 上午9:45:19
*/
package com.chinasofti.day27.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//服务端程序
public class ServerDemo {
	private ServerSocket server;

	// 无参构造，初始化服务端对象
	/**
	 * 
	 */
	public ServerDemo() {
		try {
			System.out.println("初始化服务器");
			server = new ServerSocket(8088);
			System.out.println("服务端初始化完毕");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ServerDemo server = new ServerDemo();
		server.start();
	}

	// 服务端开始工作的方法
	private void start() {
		try {
			System.out.println("等待客户端链接");
			/*
			 * ServerSocket的accept()方法，用于监听8088端口，等待客户端的链接，
			 * 该方法是一个阻塞方法，直到一个客户端的链接，
			 * 否则一致阻塞，若客户端连接了返回的是客户端的Socket
			 */
			Socket clientSocket = server.accept();
			// System.out.println("一个客户端链接了");
			/*
			 * 通过socket获取客户端的地址信息
			 */
			InetAddress address = clientSocket.getInetAddress();
			/*
			 * 通过刚刚连接上的客户端的clientSocket获取输入流，
			 * 	来读取客户端发送过来的信息。
			 */
			InputStream in = clientSocket.getInputStream();
			/*
			 * 将字节流转换成字符流并指定编码集
			 */
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			/*
			 * 将字符流转换成缓冲流，这样就可以以行为单位读取字符串
			 */
			BufferedReader br = new BufferedReader(isr);
			String message = null;
			while ((message = br.readLine()) != null) {
				System.out.println(address.getHostAddress() + "说：" + message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}