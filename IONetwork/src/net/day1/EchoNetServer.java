/*
	==== TCP 통신방식을 이용한 예제 ====
	- 서버단          : ServerSocket 과 Socket 이 필요함.
	- 클라이언트단 : Socket 이 필요함.
	
	>>>>> 구현할 내용 <<<<<
	==> Client가 Server에 접속을 하면
	
	1.클라이언트는 서버로 부터 "안녕하세요? IP주소 님.." 이라는 인사말을 받는다.
	2.그러면 클라이언트는 키보드 입력을 통해 서버쪽에 다음과 같은 메시지를 보낸다.
	  a) "안녕하세요?" 또는 "하이" 라는 메시지를 클라이언트가 서버쪽으로 보내면
	            서버는 클라이언트에게 "IP주소 님 반갑습니다.^^" 라는 메시지를 보낸다.
	  b) "오늘 날짜는?" 라는 메시지를 클라이언트가 서버쪽으로 보내면
	 	   서버는 클라이언트에게 오늘의 날짜를 보내준다.
	  c) 기타 다른 메시지를 서버쪽으로 보내면
	            서버는 "IP주소 님 어여 나가세요~~~!!" 라는 메시지를 클라이언트쪽으로 보낸다.

*/

package net.day1;

import java.net.*;
import java.util.Date;
import java.io.*;

public class EchoNetServer {

	public static void main(String[] args) {
	
		//1.서버소켓 생성
		final int port = 6000;
		ServerSocket srvSock = null;
		Socket sock = null;
		
		
		try {
			srvSock = new ServerSocket(port);
			// 포트번호 6000 을 사용하는 서버소켓 객체를 생성한다.
			
			System.out.println("--- EchoNetServer Ready....");
			
		//2.통신하기 위한 Socket객체 생성하기
			sock = srvSock.accept();
			
		//3.Socket sock 을 사용하여	클라이언트에게 데이터를 보내는(출력) 연결통로인 출력스트림 생성하기
		//	Socket sock 을 사용하여	클라이언트에게 데이터를 받는(입력) 연결통로인 입력스트림 생성하기
			OutputStream ostrm = sock.getOutputStream();
			InputStream istrm = sock.getInputStream();
			
			OutputStreamWriter ostrmwriter = new OutputStreamWriter(ostrm);
			//1byte 기반의 OutputStream ostrm 을
			//2byte 기반으로 바꾸어주는 것이다.
			
			InputStreamReader istrmReader = new InputStreamReader(istrm);
			//1byte 기반의 InputStream istrm 을
			//2byte 기반으로 바꾸어주는 것이다.
			
			PrintWriter printWriter = new PrintWriter(ostrmwriter, true);
			//두번째 파라미터가 true 이므로 엔터를 만나면 자동으로 autoFlush가 발생한다.
			
			BufferedReader bufReader = new BufferedReader(istrmReader);
			
			// 접속한 클라이언트의 IP주소를 알아오는 메소드
			InetAddress clientInetAddress = sock.getInetAddress();
			String clientIP = clientInetAddress.getHostAddress();
			
			String serverMsg = "안녕하세요? "+clientIP+"님";
			printWriter.println(serverMsg);//클라이언트와 연결된 쪽으로 내보냄
			
			// === 클라이언트 쪽에서 보내온 메시지를 받아서 적절하게 응답해주기 === //
			String clientMsg = ""; //null아님
			
			while((clientMsg = bufReader.readLine()) != null) {
			// 키보드로 Ctrl+C 가 null 이므로 이때 while 문을 탈출함.
				
				//클라이언트 쪽에서 보내온 메시지를 분석해서 응답하기
				if(clientMsg.startsWith("안녕") || clientMsg.startsWith("하이")){
					printWriter.println(clientIP+"님 반갑습니다.^^");//클라이언트로 보내기
				}
				else if(clientMsg.startsWith("오늘날짜") || clientMsg.startsWith("오늘 날짜")) {
					Date now = new Date();
					String today = String.format("%tF %tT %tA", now, now, now);
					
					printWriter.println(today);//클라이언트로 보내기
				}
				else {
					printWriter.println(clientIP+"님 어여 나가세요~~~!!");//클라이언트로 보내기
				}
				
			}//end of while
			
			if(bufReader != null)bufReader.close();
			if(printWriter != null)printWriter.close();
			if(istrmReader != null)istrmReader.close();
			if(ostrmwriter != null)ostrmwriter.close();
			if(istrm != null)istrm.close();
			if(ostrm != null)ostrm.close();
			if(sock != null)sock.close();
			if(srvSock != null)srvSock.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println(">>>> EchoNetServer 종료~~~");
		

	}//end of main----------------------------------------

}
