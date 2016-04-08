package cn.com.city.service;

import java.io.IOException;


import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;


/**
 * FTP通用类
 * @author Administrator
 *
 */
public class FtpClass {
	
	/**
	 *本地服务器IP 
	 */
	private static final String  IP="192.168.1.100";
	
	private static final int PORT=21;
	
	public void connention(String remotePath){
		FTPClient  ftp=new FTPClient();
		boolean result=false;
		try {
			ftp.connect(IP, PORT);
			result=	ftp.login("user", "123456");
			System.out.println(result);
			System.out.println(ftp.getRemoteAddress());
			listAllFiles(remotePath, ftp);
		}
		catch (IOException e) {
		}
	}
	
	private void listAllFiles(String remotePath,FTPClient  ftp){
		if (remotePath.startsWith("/") && remotePath.endsWith("/")) {   
			FTPFile[] files;
			try {
				files = ftp.listFiles(remotePath);
				for (int i = 0; i < files.length; i++) {   
					if (files[i].isFile()) {   
						System.out.println(files[i].getName());   
					} 
					else if (files[i].isDirectory()) {   
						listAllFiles(remotePath + files[i].getName() + "/",ftp);   
					} 
				}
			} catch (IOException e) {
				
			}   
		}	
	}
	public static void main(String[] args) {
		new FtpClass().connention("/");
	}
	
	
}
