package my.day4;

import java.util.Scanner; 

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		// System.in == > 키보드 
		
		System.out.println("정수를 입력하세요 => ");		//98(입력값)엔터 
		int n = sc.nextInt/*enter전 까지 읽어옴*/();		//98(입력값)출력                                                            리턴값 정수형
		System.out.println("입력한 정수 : "+ n);
		
		System.out.println("문자열 단어를 입력하세요 => ");	// 서울시 종로구엔터
		String word = sc.next(); 					// 서울시(입력값)만 출력                                                  한 단어만 읽어옴 공백X
		System.out.println("입력한 단어: "+ word);
		
		System.out.println("\n================================\n");
		System.out.println("문자열을 입력하세요 => ");
		String str = sc.nextLine/*enter까지 읽어옴*/();	//종로구(입력값)엔터 출력
		System.out.println("입력한 문자열: "+str);
		
		sc.close();		// 스캐너 종료
		
		
	}

}