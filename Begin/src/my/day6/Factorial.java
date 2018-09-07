// === 입사문제 === //

package my.day6;

import java.util.Scanner;

public class Factorial {
	
	public static int calc1(int num){ // 5
			//5*4*3*2*1
			int result = 1;
			for(int i=num; i>0; i--) {
				result *= i; //result = result*1;
							 //result = 1*5;
				             //result = 5*4*3*2*1;		
			}
			return result;
		}
	
	
	
	
	
	public static int calc2(int num) { // 5
			
			if(num == 1)
				return 1; //num 이 1 이라면 1을 반환 // 더 이상 감(--num)하지 말라는거지
			else
				return num*calc2(--num); //재귀호출
		}
	
	//	5*calc2(4);
	//  5*4*calc2(3);
	//  5*4*3*calc2(2);
	//  5*4*3*2*calc2(1);
	//	5*4*3*2*1
	
	
	public static void main(String[] args) {
		
		// >> 알고 싶은 팩토리얼 수 입력 => 5 엔터
		// >> 정답 : 5! = 120
		// >> 계속할래요?(예:Y, 아니오:N) => y엔터
		
		// >> 알고 싶은 팩토리얼 수 입력 => 6엔터
		// >> 정답 : 6! = 720
		// >> 계속할래요?(예:Y, 아니오:N) => n엔터
		// >> -- 프로그램종료 --
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
		System.out.print(">> 알고 싶은 팩토리얼 수 입력 => ");
		try {
			
			int num = Integer.parseInt(sc.nextLine());
			
			if(num < 1) {
				System.out.println(">>> 입력하는 값은 1이상의 정수 이어야 합니다.");
				continue;
			}
			
			System.out.println(">> 정답1 : "+num+"! = "+Factorial.calc1(num)); 
			System.out.println(">> 정답2 : "+num+"! = "+Factorial.calc2(num)); //재귀호출방법으로 해볼거다
			
		} catch (NumberFormatException e) {
			
			System.out.println("=== 정수만 입력하세요!! ===");
			continue; // (=== 정수만 입력하세요!! ===) 다음에  ( >> 알고 싶은 팩토리얼 수 입력 => ) 이게 계속 나와야 되니까  
		}
		
		
		System.out.print(">> 계속할래요?(예:Y, 아니오:N) => ");
		String yn = sc.nextLine();
		
		if("n".equals(yn) || "N".equals(yn)) {
			System.out.println(">> -- 프로그램종료 -- ");
			break;
		}
			
		
		
		
		}// end of for------------------------------------
		
		
		sc.close();
		
		

	}// end of main()-------------------------------------
	
	
	
}
