package my.day7;

import java.util.Scanner;

import my.util.MyUtil;

public class GayBayBo {
	
	//
	public static void menu() {
		System.out.println("\n=== 가위, 바위, 보 Game ===");
		System.out.println("1. 가위\t2. 바위\t3. 보\t4. 게임종료");
		System.out.print(">> 선택하세요(1,2,3,4) => ");
	}
	
	
	public void gameResult(String userNo, String pcNo) { //
		
		// userNo "1"(가위) pcNo "3"(보) ==> 사용자가 이겼습니다.
		// userNo "1"(가위) pcNo "2"(주먹)==> 사용자가 졋습니다.
		
		// userNo "2"(바위) pcNo "1"(가위) ==> 사용자가 이겼습니다.
		// userNo "2"(바위) pcNo "3"(보) ==> 사용자가 졋습니다.
		
		// userNo "3"(보) pcNo "2"(주먹) ==> 사용자가 이겼습니다.
		// userNo "3"(보) pcNo "1"(가위) ==> 사용자가 졋습니다.
		
		String gameResult = ""; 
		
		if 
		("1".equals(userNo) && "3".equals(pcNo) ||
		 "2".equals(userNo) && "1".equals(pcNo) ||
		 "3".equals(userNo) && "2".equals(pcNo))
		 gameResult = "사용자가 이겼습니다.";
		
		else if 
		("1".equals(userNo) && "2".equals(pcNo) ||
		 "2".equals(userNo) && "3".equals(pcNo) ||
		 "3".equals(userNo) && "1".equals(pcNo))
		 gameResult = "사용자가 졌습니다.";
		
		else 
			gameResult = "사용자가 비겼습니다.";
		
		String pcStr = "";
		String userStr = "";
		
		//userNo가 내는 거
		if("1".equals(userNo)) {
			userStr = "가위";
		}
		else if("2".equals(userNo)) {
			userStr = "바위";
		}
		else if("3".equals(userNo)) {
			userStr = "보";
		}
		
		//pcNo 가 뭘 내는지 
		if("1".equals(pcNo)) {
			pcStr = "가위";
		}
		else if("2".equals(pcNo)) {
			pcStr = "바위";
		}
		else if("3".equals(pcNo)) {
			pcStr = "보";
		}
		
		System.out.println(">>> 사용자 : " +userStr+", 컴퓨터 : "+pcStr);
		System.out.println(gameResult+"\n");
			
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GayBayBo obj = new GayBayBo(); //인스턴스 메소드 

		String userNo ="";
		do {
			GayBayBo.menu();//메뉴보여줌
			userNo = sc.nextLine(); 
			
			int pcNo = MyUtil.random(1, 3);//1부터 3까지중 랜덤 선택 (PC가 임의로 가위,바위,보 선택 )
			
			switch (userNo) {
			//userNo가 선택한 것이 1 or 2 or 3 이다.
			case "1":
			case "2":
			case "3":
				obj.gameResult(userNo, Integer.toString(pcNo)/*String(문자열) 타입으로 바꿔줌*/); //userNo 와 pcNo 비교..이겼다 비겼다 졌다 나타낼 메소드 
				break;
				
			case "4":
				break;

			default:
				System.out.println(">>> 메뉴는 1,2,3,4 중에 하나이여야 합니다.");
				break;//switch 문을 빠져나가 while로가  //continue; 해도되
			}//end of switch-----------------------------
			
			
		} while (!"4".equals(userNo));//입력한 값이 4가 아니라면 반복, 4이면 do while문을 나온다.   보통 while(!조건)으로 많이쓴다.
		
		System.out.print(">> 프로그램 종료 시각 : ");
		MyUtil.currentTime(); // void 타입
		sc.close();

	}

}
