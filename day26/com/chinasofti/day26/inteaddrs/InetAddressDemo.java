/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InetAddressDemo.java
* Copyright 2017-08-17 By Gnosis. Allright reserved.
* Time: ����10:22:59
*/
package com.chinasofti.day26.inteaddrs;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		// ��ȡ������ip
		InetAddress ip = InetAddress.getByName("MS-20170705GIER");
		System.out.println(ip);
		// ��ȡ��������
		System.out.println(ip.getHostName());
		// ��ȡip��ַ
		System.out.println(ip.getHostAddress());
	}

}
