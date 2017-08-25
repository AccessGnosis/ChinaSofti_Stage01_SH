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

//服务端程序
public class Server {
	// 运行在服务端的socket对象
	private ServerSocket serverSocket;
	// 线程池,用来管理客户端连接的交互线程
	private ExecutorService threadPool;
	// 保存所有客户端输出流的集合
	private List<PrintWriter> allOut;

	// 无参构造,初始化服务端对象
	public Server() {
		try {
			System.out.println("初始化服务器...");
			serverSocket = new ServerSocket(8088);
			Thread.sleep(2000);
			// 初始化连接池
			threadPool = Executors.newFixedThreadPool(50);
			// 初始化存放所有客户端输出流的集合
			allOut = new ArrayList<PrintWriter>();
			System.out.println("服务端初始化完毕...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 服务端开始工作的方法
	public void start() {
		try {

			/*
			 * ServerSocket的accept()方法,用于监听8088端口,等待客户端的连接,
			 * 该方法是一个阻塞方法,直到一个客户端的连接, 否则一直阻塞,若客户端连接了返回的是客户端的Socket.
			 */
			while (true) {
				System.out.println("等待客户端连接...");
				Socket clientSocket = serverSocket.accept();
				// System.out.println("一个客户端连接了...");

				/*
				 * 当一个客户端连接后,启动一个线程ClientHandler,将该客户端的Socket传入,
				 * 使得该线程处理与该客户端的交互.
				 */
				Runnable handler = new ClientHandler(clientSocket);
				//
				// Thread t = new Thread(handler);
				// t.start();
				/*
				 * 使用线程池分配空闲线程来处理当前连接的客户端
				 */
				threadPool.execute(handler);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 将给定的输出流存入共享集合
	public void addOut(PrintWriter pw) {
		synchronized (this) {
			allOut.add(pw);
		}
	}

	// 将给定的输出流从共享集合中删除
	public void removeOut(PrintWriter pw) {
		synchronized (this) {
			allOut.remove(pw);
		}
	}

	// 将给定的消息转发给所有的客户端
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
			System.out.println("服务端初始化失败");
		}
	}

	/*
	 * 服务端中一个线程,用于和某个客户端交互 使用线程的目的就是使得服务端可以处理多个客户端
	 */
	class ClientHandler implements Runnable {
		// 当前线程处理得客户端的Socket.
		private Socket clientSocket;
		// 当前客户端的昵称
		private String nickName;
		// 当前客户端的ip
		private String ip;
		// 当前客户端的端口
		private int port;

		public ClientHandler(Socket socket) {
			this.clientSocket = socket;
			// 通过clientSocket获取客户端的地址信息
			InetAddress address = clientSocket.getInetAddress();
			// 获取客户端的ip
			ip = address.getHostAddress();
			// 获取客户端的端口
			port = clientSocket.getPort();
			System.out.println(ip + ":" + port + " 客户端连接了");
		}

		public void run() {
			PrintWriter pw = null;
			try {
				/*
				 * 可以通过clientSocket的getOutputStream()方法
				 * 获取一条输出流,用于将信息发送给客户端.
				 */
				OutputStream out = clientSocket.getOutputStream();
				/*
				 * 使用字符流来根据指定的编码将字符串转换为字节,在通过out发送给服务端
				 */
				OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
				/*
				 * 将字符流包装成缓冲流,就可以按行为单位写出字符串了
				 */
				pw = new PrintWriter(osw, true);
				/*
				 * 需要将该客户端的输出流存入到共享集合中,目的使得该客户端也能接受到服务端转发的信息
				 */
				addOut(pw);
				System.out.println("当前的在线人数: " + allOut.size());
				/*
				 * 通过刚刚连接上的客户端的clientSocket获取输入流, 来读取客户端发送过来的信息.
				 */
				InputStream in = clientSocket.getInputStream();
				/*
				 * 将字节流转换成字符流并指定编码集
				 */
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				/*
				 * 将字符流转换成缓冲流,这样就可以以行为单位读取字符串
				 */
				BufferedReader br = new BufferedReader(isr);
				/*
				 * 当创建好当前客户端的输入流后,读取的第一个字符串,定义为昵称
				 */
				nickName = br.readLine();
				// 通知所有的客户,当前该用户上线了
				sendMessageToAllClient("[" + nickName + "]上线了");
				String message = null;
				while ((message = br.readLine()) != null) {
					// System.out.println("客服端说:" + message);
					// pw.println(message);
					// pw.flush();
					// 当读取到客户端发送过来的信息,转发给所有的客户端
					sendMessageToAllClient(nickName + "说: " + message);
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				/*
				 * 将该客户端的输出流从集合中移除
				 */
				removeOut(pw);
				System.out.println("当前的在线人数: " + allOut.size());
				// 通知所有客户端,该用户下线了
				sendMessageToAllClient(nickName + "下线了...");
				try {
					clientSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("一个客户端下线了...");

			}

		}

	}
}
