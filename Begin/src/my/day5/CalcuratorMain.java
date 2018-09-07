//main 메소드내에서 return; 은 종료를 의미한다. 
//어떤 메소드내에서 return; 은 그 메소드를 호출한 곳으로 값을 돌려준다. 
//또는 System.exit(0); 프로그램의 종료

package my.day5;

import java.util.Scanner;

public class CalcuratorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
				System.out.print("▷첫번째 수 => ");
				String str1 = sc.nextLine();
				double a = Double.parseDouble(str1);
				
				System.out.print("▷두번째 수 => ");
				String str2 = sc.nextLine();
				double b = Double.parseDouble(str2);
				
				System.out.print("▷연산자 선택 (+ - * /) => ");
				String op = sc.nextLine();
				
				
				//연산자에 + - * / 외에 다른값을 입력했을때 실행되는 부분
				switch (op) {
					case "+":
					case "-":
					case "*":
					case "/":
						
						break;
	
					default:
						System.out.println("!!!!!연산자는 + - * / 만 사용하세요");
						sc.close();
						return;
						
					
		
				}
				
				
				
				
				//연산자에 + - * / 외에 다른값을 입력했을때 실행되는 부분 이 방법도 가능 
				/*if(!("+".equals(op) || 
				       "-".equals(op) ||
				       "*".equals(op) ||
				       "/".equals(op))  ) {
					System.out.println("!!!!!연산자는 + - * / 만 사용하세요");
					sc.close();
					return;
				}*/
					
				Calcurator cl = new Calcurator();
				String result = cl.calc(a, b, op);
				
			
				
				
				
				
				
				
				// result 가 7.0이라면 7이라고 나타내고자 한다.
				// result 가 7.5이라면 7.5이라고 나타내고자 한다.
				
				// 7.0%7 ==> 0 이다.		7.0%(int)7.0
				// 7.5%7 ==> 0 이 아니다.	7.5%(int)7.5
				
				System.out.println("=== 계산결과 ===");
				if(b==0 && "/".equals(op)) {
					System.out.println(result);
				}
				else {
					System.out.println(str1 + op + str2 + "=" + result);
				}
					
		
		} catch (Exception e) {
			System.out.println(">>> 숫자로만 입력하세요!!");
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		  }
		
	}// end of main()----------------------------------------------

}
