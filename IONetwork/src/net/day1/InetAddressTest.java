package net.day1;

import java.net.*;

public class InetAddressTest {

	public static void main(String[] args) {
		
		// InetAddress 클래스 ==> IP와 관련된 클래스
		
		try {
			//InetAddress my_inet_ip = InetAddress.getByName("DESKTOP-R78VFCU");
			//DESKTOP-R78VFCU 는 내컴퓨터 속성 들어가서 컴퓨터 이름 갖고온거임.
			
			//InetAddress my_inet_ip = InetAddress.getByName("127.0.0.1");
			// 127.0.0.1 이것도 가능. 
			// ip가 127.0.0.1 은 자기자신의 IP를 말하는 것임. 
			// 127.0.0.1 LoopBack Address 라고 부른다.
			
			//InetAddress my_inet_ip = InetAddress.getByName("192.168.50.13");
			// 이건 cmd가서 찾아온 내 IP 주소
			
			//InetAddress my_inet_ip = InetAddress.getByName("192.168.50.50");
			// 이건 홍윤성 IP주소
			
			//InetAddress my_inet_ip = InetAddress.getByName("localhost");
			// 127.0.0.1 이 나옴. 자기자신이라는 의미.
			
			InetAddress inet_ip = InetAddress.getByName("www.hongys.com");
			//C:\Windows\System32\drivers\etc\host 파일을 편집한다.
			
			
			
			String ip = inet_ip.getHostAddress();
			System.out.println("ip => "+ip);
			
			String hostname = inet_ip.getHostName();
			System.out.println("hostname => "+hostname);
			
			System.out.println("\n================================================\n");
			
			InetAddress inet_ip2 = InetAddress.getByName("www.naver.com");
			
			String ip2 = inet_ip2.getHostAddress();
			System.out.println("ip2 => "+ip2);
			
			String hostname2 = inet_ip2.getHostName();
			System.out.println("hostname2 => "+hostname2);
			
			System.out.println("\n================================================\n");
			
			InetAddress[] inetAddrArr = InetAddress.getAllByName("www.google.com");
			//1개의 HostName(지금은www.google.com)에 여려개의 IP Address 를 사용하는 서버의 경우
			System.out.println("www.google.com의 IP주소들");
			for(int i=0; i<inetAddrArr.length; i++) {
				System.out.println(inetAddrArr[i].getHostAddress());
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// end of main
}