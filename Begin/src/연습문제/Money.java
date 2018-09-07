package 연습문제;

import java.util.Scanner;

public class Money {
	
	int total;
	
	
	public int money(int a, int b, int c) {
		total = a+b+c;
		return total;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.상원 : ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.print("2.민규 : ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.print("3.윤성 : ");
		int c =Integer.parseInt(sc.nextLine());
		
		System.out.println("우리가 가져온 돈은 "+(a+b+c)+"원 이야");
		
		if(a == 0) {
			System.out.println("상원이는 좀 맞자");
		}
		if(b == 0) {
			System.out.println("민규는 좀 맞자");
		}
		if(c == 0) {
			System.out.println("윤성이는 좀 맞자");
		}
	}
}
