package boTest;

public class MemberMain {
	
	public static void startMenu() {
		
		System.out.println("\n======== 초기 Menu ========");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 모든회원출력");
		System.out.println("4. 특정ID검색하기");
		System.out.println("5. 나의정보보기");
		System.out.println("6. 나의정보변경");
		System.out.println("7. 종료");
		System.out.println("==========================");
		
		
	}


	public static void main(String[] args) {
		
		String menuno = "";
		
		do {
			MemberMain.startMenu();
			switch (menuno) {
			case "1"://회원가입
				
				break;
			case "2"://로그인
				
				break;
			case "3"://모든회원출력
				
				break;
			case "4"://특정ID검색하기
				
				break;
			case "5"://나의정보보기
				
				break;
			case "6":
				
				break;
				

			default:
				break;
			}
		} while (!"7".equals(menuno));

	}

}
