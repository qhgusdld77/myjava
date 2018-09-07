package my.day4;

import java.io.IOException;
//import java.util.Scanner;

public class IfTest2 {
	
/*	public void showInfo(int n) {
		
		if( 65<=n && n<=90 ) { // 영문대문자
			System.out.println("입력하신 글자"+(char)n+"는 영문대문자 입니다.");
		}
		else if(97<=n && n<=122 ) { // 영문소문자
			System.out.println("입력하신 글자"+(char)n+"는 영문소문자 입니다.");
		}
		else if(48<=n && n<=57) { // 숫자
			System.out.println("입력하신 글자"+(char)n+"는 숫자 입니다.");
		}
		else { // 영문자,숫자를 제와한 나머지
			System.out.println("입력하신 글자"+(char)n+"는 특수문자 입니다.");
		}
	
	}(ctrl+shift+/)*/ 
	
	
	
	
	
	public void showInfo(int n) {
		
		char ch = (char)n;
			
		if( 'A'<=ch && ch<='Z' ) { // 영문대문자
			System.out.println("입력하신 글자"+ch+"는 영문대문자 입니다.");
		}
		else if('a'<=ch && ch<='z' ) { // 영문소문자
			System.out.println("입력하신 글자"+ch+"는 영문소문자 입니다.");
		}
		else if('0'<=ch && ch<='9') { // 숫자
			System.out.println("입력하신 글자"+ch+"는 숫자 입니다.");
		}
		else { // 영문자,숫자를 제와한 나머지
			System.out.println("입력하신 글자"+ch+"는 특수문자 입니다.");
		}
		
	}

	public static void main(String[] args) throws IOException {

		
		System.out.print("글자 1개를 입력하세요 => ");
		
		int n = System.in.read();
		// System.in 는 키보드
		// System.in.read() 은 키보드로 부터 입력받은 글자중
		// 첫번째 글자 1개만 읽어 들이는 것이다.
		// 리턴타입은 int 타입이다!
		
	//	System.out.println(n);
		
		IfTest2 obj = new IfTest2();
		obj.showInfo(n); //인스턴스 메소드 ,리턴타입 void, 파라미터 있음
		

	}

}
