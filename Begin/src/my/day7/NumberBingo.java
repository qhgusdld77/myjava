package my.day7;

import java.util.Scanner;

import my.util.MyUtil;

public class NumberBingo {
	 //객체 한번생성했으니까 안써도됨
	/*static*/ int count;// 멤버변수는 int 초기치가 0 , 객체를 부를 때 초기화, 메소드를 부를때마다 누적되야해 지역변수 쓰면안돼 
	
	
	public void bingo(int random, int userNum) {
		String str = "";
		
		if(userNum > random) {
			str = userNum + " 보다 작습니다.";
			count++; //
			
		}
		else if(userNum < random) {
			str = userNum + "보다 큽니다.";
			count++;
		}
		else {
			str = "빙고~~ "+ ++count +"번만에 맞추었습니다.";
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		// 컴퓨터가 1 ~ 100 사이의 랜덤한 숫자를 가지도록 한다.
		int random = MyUtil.random2(1, 100);
		int userNum = 0; //사용자가 숫자를 넣어주면 userNum으로 들어갈래
		
		Scanner sc = new Scanner(System.in);
		NumberBingo obj = new NumberBingo(); //기본생성자 ,인스턴스메소드 호출위해 객체생성 
		
		
		
		outer:
		do {
			
			try {
				System.out.println(random+"1부터 100사이의 정수를 입력하세요 => ");
				userNum = Integer.parseInt(sc.nextLine());
				if(userNum < 1 || userNum > 100)
				{
					System.out.println(">> 경고 : 1과 100 사이의 정수만 가능합니다.");
					continue;
				}
				//숫자를 맞추는 메소드 호출;
				obj.bingo(random, userNum);
				
			} catch (NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요!! ");
				continue; //(try를 벗어나면)써주면 while로 바로가지만 안써줘도 밑으로 떨어진다 
			}
			// 여기에 코딩 있으면 continue 써야된다.
			
			
			
			
			
			
			// 게임을 계속하고싶으면 Y 종료하려면 N을 누르면 ...
			
				
				if(random == userNum)/*숫자 맞추면*/ {
					
					for(;;) {
						System.out.print(">> 게임을 계속하시겠습니까?(Y/N) => ");
						String yn = sc.nextLine();
						
						if("n".equals(yn) || "N".equals(yn)) {
							System.out.println("=== 게임종료 ===");
							break outer; // break 레이블명; 을 하면 가장 가까운 레이블명이 붙은 반복문을 빠져나간다.
										 // 여기서는 dowhile문을 빠져나간다.
						}
						else if("y".equals(yn) || "Y".equals(yn)) {
							//게임을 다시 진행하기 위해서  count와 random을 초기화 시켜야 한다.
							obj.count = 0; //초기화
							random = MyUtil.random2(1, 100); //새로운 값 
							break; // 가장 가까운 반복문을 벗어난다.
						}
						else { // y나 n이 아닌경우 
							System.out.println(">> Y 또는 N 을 선택해 주세요.");
							continue; // continue; 는 아래의 명령줄을 실행하지 말고
	                        		  // 반복문으로 올라가라는 말이다.
						}
						
					}	//end of for()--------------------------
					
				}//end of if ~ else-------------------------

				
		} while (true);

		sc.close();
		
	}//end of main()-----------------------

}
