package 연습문제;

import java.util.Scanner;

public class Hong {

	int power;
	static int sum;
	
	public Hong() {}
	public Hong(int a) {
		this.power = a;
		sum += power;
	}
	
	public static String powersum1() {
		return "obj1과 obj2의 파워의 합은 "+sum+"입니다.";
	}
	
	public static void powersum2() {
		System.out.println("obj1과 obj2의 파워의 합은 "+sum+"입니다.");
	}
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("obj1의 파워 : ");
		a = Integer.parseInt(sc.nextLine());
		
		System.out.print("obj2의 파워 : ");
		b = Integer.parseInt(sc.nextLine());
				
		Hong obj1 = new Hong(a);
		Hong obj2 = new Hong(b);
		
		if(obj1.power < obj2.power) {
			System.out.println("obj2의 파워가 더 쎕니다");
		}
		else if (obj1.power == obj2.power) {
			System.out.println("obj1과 obj2의 파워가 같습니다");
		}
		else if(obj1.power > obj2.power) {
			System.out.println("obj1의 파워가 더 쎕니다");
		}
		// if문을 써서 obj2의 파워가 더 쎕니다.
						
		System.out.println(powersum1());
		powersum2();
		// obj1의 파워와 obj2의 파워의 합은 () 입니다.
		// . 이 없으면 무조건 static메소드(static메소드는 클래스명을 생략 가능하기 때문)
		// . 이 있는 경우 . 앞이 클래스명이면 staitc메소드, 아닐경우 인스턴스메소드
		
		
		
	}

}
