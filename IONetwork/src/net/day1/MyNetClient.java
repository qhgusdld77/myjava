/*
	==== TCP 통신방식을 이용한 예제 ====
	- 서버단          : ServerSocket 과 Socket 이 필요함.
	- 클라이언트단 : Socket 이 필요함.

*/

package net.day1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

//C:\Windows\System32\drivers\etc
public class MyNetClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> 연결할 서버의 IP 주소 입력 => ");
		
		//String serverIP = sc.nextLine();
		//이렇게 하면 안된다. serverIP에 192.168.50.48\r\n 와 같이
		//입력되므로 192.168.50.48\r\n은 IP로 사용하지 못한다.
		//nextLine은 엔터까지 읽어와 serverIP에 엔터까지 들어가
		
		String serverIP = sc.next();
		//next()는 엔터전까지 들어가
		//즉, serverIP 에 192.168.50.48만 들어간다.
		
		Socket sock = new Socket(serverIP, 7777);
		//Socket sock = new Socket("192.168.50.50", 7777);
		//Socket sock = new Socket("www.hongys.com", 7777);
		
		// Socket sock 이 생성되어지면 serverIP 서버와 연결된것이다.
		// 만약에 serverIP 서버와 연결이 실패되면
		// UnknownHostException, IOException 오류가 발생된다.
		
		System.out.println(">>> "+serverIP+"서버와 연결됨 <<<\n");
		
		
		
		
		
		//서버쪽에 스트림을 통해 보내온 메시지를 읽어서 출력하도록 한다.
		InputStream instrm = sock.getInputStream();
		//sock.getInputStream() 메소드를 사용하여 1byte기반 기본 입력스트림(InputStream)객체를 얻어온다.
		
		DataInputStream dinstrm = new DataInputStream(instrm);
		//기본 입력스트림(InputStream)에 필터스트림(보조스트림, 오리발)을 장착한다.
		
		String severMsg = dinstrm.readUTF();
		//dinstrm.readUTF() 은 DataInputStream을 통해 받은 byte를 UTF-8 형식으로 읽어들여서 
		//문자열(String) 타입으로 리턴시켜주는 메소드이다.
		
		System.out.println(">> 서버로 부터 온 메시지 : " +severMsg);

		
		
		
		
		
		//클라이언트쪽에서 서버쪽으로 메시지를 보내겠다.
		//메시지를 보내기위해 데이터 출력스트림(DataOutputStream)을 생성하겠다.
		OutputStream outstrm = sock.getOutputStream();
		//1byte 기반 기본 출력 스트림을 얻어온다.
		
		DataOutputStream doutstrm = new DataOutputStream(outstrm);
		//위에서 얻어온 기본 출력 스트림에 필터스트림(보조스트림, 오리발)장착
		
		String msg = "누구세요~~~";
		doutstrm.writeUTF(msg);
		//문자열 msg를 UTF-8 인코딩(== UTF-8형태의 타입으로 변경)을 사용하여 그 내용물을 
		//데이터 출력 스트림(DataOutputStream)에 기록한다.
		
		doutstrm.flush();
		//데이터 출력 스트림 (DataOutputStream)에 기록된 내용을 내보내는 작업을 한 것이다.
		//즉, 클라이언트 컴퓨터에 "어서오세요!! 192.168.50.50님~~"이라는 내용을 보내는 것이다.
		
		
		
		sc.close();

	}//end of main-------------------------------------------

}
