/*
	==== TCP 통신방식을 이용한 예제 ====
	- 서버단          : ServerSocket 과 Socket 이 필요함.
	- 클라이언트단 : Socket 이 필요함.

*/


package net.day1;

import java.io.*;
import java.net.*;		// java.net.*; 은 항상 java.io.*; 와 같이 동반해야한다.

public class MyNetServer {

	public static void main(String[] args) throws IOException{
		 
		// === ServerSocket 객체 생성하기 ===
		// ServerSocket 객체를 생성할때는 port 번호가 필요하다.

		ServerSocket serverSock = new ServerSocket(7777); // 포트번호 7777 을 사용하는 서버소켓 객체를 생성한다.
		System.out.println("---- 클라이언트 연결을 기다림....");
		
		
		while(true) {
			
			Socket sock = serverSock.accept();
			/*
				serverSock.accept(); 메소드는
				클라이언트가 접속할때 까지 블럭(대기상태)으로 계속해서 머물고 있다가,
				클라이언트쪽에서 서버의 해당 포트번호(지금은7777)로 들어오는 시도를 
				서버쪽에서 인지하는 순간, 클라이언트와 서버간에 통신할 수 있는 객체인
				소켓객체(sock) 을 리턴해준다. 
			*/
			
			System.out.println(">>> 클라이언트가 접속해옴 <<<");
			
			// 접속한 클라이언트의 IP주소를 알아오는 메소드
			InetAddress clientInetAddress = sock.getInetAddress();
			String clientIP = clientInetAddress.getHostAddress();
			
			System.out.println("클라이언트의 IP 주소  => "+clientIP);
			
			/*
				서버와 클라이언트간에 데이터를 서로 주고 받는 것은 스트림 객체를 통해서 이루어지므로 
				먼저 소켓객체를 통해 입출력스트림 객체를 얻어와야 한다.
				테스트를 위해서 일단 서버는 접속한 클라이언트에게
				"어서오세요!! 192.168.50.50님~~" 라는 인사말을 보내겠다.
				
			*/
			
			OutputStream outstrm = sock.getOutputStream();
			//1byte 기반 기본 출력 스트림을 얻어온다.
			
			DataOutputStream doutstrm = new DataOutputStream(outstrm);
			//위에서 얻어온 기본 출력 스트림에 필터스트림(보조스트림, 오리발)장착
			
			String msg = "어서오세요!! "+clientIP+"님~~";
			doutstrm.writeUTF(msg);
			//문자열 msg를 UTF-8 인코딩(== UTF-8형태의 타입으로 변경)을 사용하여 그 내용물을 
			//데이터 출력 스트림(DataOutputStream)에 기록한다.
			
			doutstrm.flush();
			//데이터 출력 스트림 (DataOutputStream)에 기록된 내용을 내보내는 작업을 한 것이다.
			//즉, 클라이언트 컴퓨터에 "어서오세요!! 192.168.50.50님~~"이라는 내용을 보내는 것이다.
			
			
			
			
			
			// ==== 클라이언트에서 보내온 메시지를 일거서 출력하도록 하겠다.==== //
			//클라이언트쪽에 스트림을 통해 보내온 메시지를 읽어서 출력하도록 한다.
			InputStream instrm = sock.getInputStream();
			//sock.getInputStream() 메소드를 사용하여 1byte기반 기본 입력스트림(InputStream)객체를 얻어온다.
			
			DataInputStream dinstrm = new DataInputStream(instrm);
			//기본 입력스트림(InputStream)에 필터스트림(보조스트림, 오리발)을 장착한다.
			
			String clientMsg = dinstrm.readUTF();
			//dinstrm.readUTF() 은 DataInputStream을 통해 받은 byte를 UTF-8 형식으로 읽어들여서 
			//문자열(String) 타입으로 리턴시켜주는 메소드이다.
			
			System.out.println(">> "+clientIP+"로 부터 온 메시지 : " +clientMsg);
			
			if(doutstrm != null)doutstrm.close();
			if(outstrm != null)outstrm.close();
			if(dinstrm != null)dinstrm.close();
			if(instrm != null)instrm.close();
			if(sock != null)sock.close();
			
			//if(serverSock != null) serverSock.close(); 을 하면 안된다.
			//왜냐하면 ServerSocket serverSock 이 존재해야만
			//새로운 클라이언트의 연결을 바아줄 수 있기 때문이다.

			
			
			
			
			
			
		}// end of while
		
		
		
		
		
		
		
	}// end of main------------------------------------------------
}
