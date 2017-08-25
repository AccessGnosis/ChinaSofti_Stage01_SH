/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ClientDemo.java
* Copyright 2017-08-18 By Gnosis. Allright reserved.
* Time: 上午10:01:25
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
	// 该socket，是用于连接在服务端的ServerSocket
	private Socket clientSocket;

	public ClientDemo() {
		try {
			System.out.println("正在链接服务端");
			clientSocket = new Socket("localhost", 8088);
			System.out.println("成功连接服务端");
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
		 * 可以通过Socket的getOutputStream()方法
		 * 获取一条输出流，用于将信息发送给服务端。
		 */
		try {
			OutputStream out = clientSocket.getOutputStream();
			/*
			 * 使用字符流来根据指定的编码将字符串转换为字节，再通过out输出流
			 * 	再发送给服务端。
			 */
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			/*
			 * 将字符流包装成缓冲流，就可以按行为单位写出字符串
			 */
			PrintWriter pw = new PrintWriter(osw);
			pw.println(str);

			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
