
package net.day1;

import java.io.*;
import java.net.*;	
import java.util.Date;

public class MyNetServer2 {

	public static void main(String[] args) throws IOException{
		 

		ServerSocket serverSock = new ServerSocket(10000); 
		System.out.println("---- 클라이언트 연결을 기다림....");
		
		
		while(true) {
			
			Socket sock = serverSock.accept();
			System.out.println(">>> 클라이언트가 접속해옴 <<<");
			
			InputStream instrm = sock.getInputStream();
			
			DataInputStream dinstrm = new DataInputStream(instrm);

			OutputStream outstrm = sock.getOutputStream();
			
			DataOutputStream doutstrm = new DataOutputStream(outstrm);
			
			
			
			String clientMs = "";
			
			while((clientMs = dinstrm.readUTF()) != null) {
				
				if(clientMs.startsWith("time")) {
					Date now = new Date();
					String today = String.format("%tT", now);
					
					doutstrm.writeUTF(today);
					doutstrm.flush();
				}
				else {
					doutstrm.writeUTF("time을 입력하세요");
					doutstrm.flush();
				}
			
				
			}//end of while

			
			if(doutstrm != null)doutstrm.close();
			if(outstrm != null)outstrm.close();
			if(dinstrm != null)dinstrm.close();
			if(instrm != null)instrm.close();
			if(sock != null)sock.close();
		

			
		}// end of while

		
		
	}// end of main------------------------------------------------
}
