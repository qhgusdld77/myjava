package net.day2;
import java.net.*;
import java.io.*;

/* ====== *** 구현내용 *** =======
   -- 채팅 서버와 클라이언트가 일대일 채팅하는 프로그램 - 키보드 입력, 콘솔에 출력
 */

public class ConsoleChatServer implements Runnable {

	ServerSocket serversocket;
	Socket socket;
	String clientIP;
	private final int port=5555;
		
	boolean stop = false;
	
	// 생성자 
	public ConsoleChatServer() {
		service();//메소드호출
	}// end of 생성자 ------------------------------
	
	
	public void service() {
		
		BufferedReader keyboardReader = null;
		// 서버자신이 클라이언트쪽으로 입력 내용을 보내기 위해 "키보드로 부터 입력받은 내용을 읽어들이는" 용도.
		
		PrintWriter	printWriter = null;
		// 서버자신이 키보드로 부터 입력받은 내용을 클라이언트쪽으로 보내기 위한 용도.
				
		System.out.println("ConsoleChatServer 준비중...");
		
		try {
			// === ServerSocket 및 Socket 생성하기 ===
			serversocket = new ServerSocket(port);
			socket = serversocket.accept();
			/* 서버소켓 객체의 accept() 메소드는 
			      클라이언트가 접속할때까지 블럭(대기상태)으로 계속해서 머물고 있다가,
			      클라이언트쪽에서 서버의 해당포트번호(지금은 5555)로 들어오는 시도를 서버쪽에서 인지되어야만 
			      클라이언트와 서버간에 통신할 수 있는 객체인 소켓객체(통신할수 있는 객체)를 리턴해준다.
			*/	
				InetAddress inetip = socket.getInetAddress();
				                    // 소켓에 연결된 클라이언트의 IP와 관련된 정보를 알수있는 InetAddress 객체를 리턴시켜준다.  
				clientIP = inetip.getHostAddress();
									// 문자열 형태의 IP address 리턴시켜준다.
				System.out.println("### ["+clientIP+"]님이  접속하였습니다. ###");
	
				
			// === 키보드 입력 스트림 필요(사용자가 키보드로 부터 입력한 메시지를 읽어들여 클라이언트로 보내기 위해) - System.in 
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			// 서버자신이 클라이언트쪽으로 입력 내용을 보내기 위해 키보드로 부터 입력받은 내용을 읽어들이는 용도.
			// 1btye 기반 System.in(키보드입력) 을 InputStreamReader 브릿지 스트림을 사용하여 2byte 기반으로 바꾸어준다.
			// 그런 다음에 속도 향상을 위해서 필터(보조)스트림인 BufferedReader 를 장착한다.
			
			
			// === 소켓을 통해 클라이언트에게 보낼 스트림 연결 ===
			printWriter = new PrintWriter(socket.getOutputStream(), true);
			// 서버자신이 키보드로 부터 입력받은 내용을 클라이언트쪽으로 보내기 위한 용도.
			// 출력스트림(OutputStream)을 PrintWriter 클래스로 감싸았음.
			// PrintWriter를 사용하는 이유는 주로 printXXX (printf, println, 등) Method 들을 사용하기 위해서 이다.
			// println() 메소드가 호출되면 자동으로 flush() 메소드를 호출한다.	
			
			
			// === 클라이언트에서 보내오는 메시지를 계속 듣는 스레드 생성하여 동작시키기 ==
				Thread thr = new Thread(this);
				thr.start();
				
				//String myMsg="";
				/*while( (myMsg=keyboardReader.readLine() ) != null) { // 키보드로 내(서버) 메시지 입력받기
					printWriter.println(myMsg); // 소켓을 통해 클라이언트에게 내(서버) 메시지를 전송하기
				}*/
	
				// === 서버에서 클라이언트쪽으로 메시지를 보내는 작업
				do {
					if(/*클라이언트 소켓*/socket.isClosed())  // 소켓이 닫힌 상태이라면
						//break;
						System.exit(0);
					else { // 소켓이 열려진 상태이라면
						String myMsg = keyboardReader.readLine(); 
						// 키보드로 내(서버) 메시지 입력받기
						
						if(myMsg.equalsIgnoreCase("exit")) {  
							stop = true;
							break; // exit 또는 EXIT 누르면 while 문 종료
						}
					
						printWriter.println(myMsg); // 소켓을 통해 클라이언트에게 내(서버) 메시지를 전송하기
					}
					
				} while (true);
				
			System.out.println(">>> 채팅서버가 종료합니다. <<<");
			System.exit(0);
			
			} catch (IOException e) {
				System.out.println("예외: "+e.getMessage());
			}
		
		 
		
	}// end of service()---------------------------------------------------
	
	@Override
	public void run() {
		//클라이언트에서 보내오는 메시지를 계속 받아서 자기 콘솔에 출력 -- listener(리스너) 역할
		
		InputStream instream = null;
		// 클라이언트에서 보내온 데이터를 읽어들이기 위한 노드 스트림.
		
		BufferedReader bufferReader = null; 
		// 클라이언트에서 보내온 데이터를 읽어들이기 위한 스트림으로 부터 읽어들이기위한 필터(보조) 스트림.
		
		try {
				instream = socket.getInputStream();
				// 클라이언트에서 보내온 데이터를 읽어들이기 위한 노드 스트림.
				
				bufferReader = new BufferedReader(new InputStreamReader(instream)); 
				// 클라이언트에서 보내온 데이터를 읽어들이기 위한 스트림으로 부터 읽어들이기위한 필터(보조) 스트림.
				// 1btye 기반 instream 을 InputStreamReader 브릿지 스트림을 사용하여 2byte 기반으로 바꾸어준다.
				// 그런 다음에 속도 향상을 위해서 필터(보조)스트림인 BufferedReader 를 장착한다.
				
				String clientMsg = "";
			
				while(!stop) { 
					clientMsg = bufferReader.readLine(); 
					// bufferReader 를 통해 클라이언트가 보내준 메시지를 한줄씩 읽어온다. 
					
					System.out.println("From Client"+clientIP+">> "+clientMsg);
					// 콘솔창에 출력해준다.
				}// end of while---------------------------------
				
			} catch (IOException e) {
				// ***** 클라이언트에서 socket.close(); System.exit(0);이 발생하여 
				//       위의 socket.getInputStream();부분 또는 bufferReader.readLine(); 부분에서 IOException 이 발생하면 *****
				System.out.println(">> 클라이언트와의 대화연결이 끊어졌습니다.");
			} finally {
				try {
					if(socket != null)
						socket.close();
					
					if(serversocket != null)
						serversocket.close();
					
					System.exit(0);
					
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
		
		}//end of run() @Override---------------------------------------------------------


	public static void main(String[] args) {
		new ConsoleChatServer();//객체를 만들었다  기본생성자 호출

	}//end of main()------------------------------------

}//end of class ConsoleChatServer //////////////////////////////////////////////////////
