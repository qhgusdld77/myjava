package my.day17;

public class MamberMain {
										 /*던져버려 전가*/
	public static void main(String[] args) /*throws UserDefineExceptionID*/{
		
		Member mem = new Member();
		
		try {//생성자에서 오류를 throws 해서 여기서 오류를 잡아줘야되
		//	mem.setId("abc"); //ID명은 최소길이가 5글자 이상이어야 합니다.
		//	mem.setId("admin");//id명은 admin 및 superman 으로 사용할 수 없습니다.
			mem.setId("hongkd");
			mem.setPassword("qwer123$");
			mem.setName("홍길동");
		} catch (UserDefineExceptionID e) {
		//	e.printStackTrace(); //어디서 오류가 났는지까지 알려줌
			System.out.println("오류 =>" +e.getMessage());//메세지만 보여줌
		}
		
		Member mem2 = null;
		try {
		//	mem2 = new Member("abcd", "qwer1234$", "이순신");
		//	mem2 = new Member("superman", "qwer1234$", "이순신");
			mem2 = new Member("leess", "qwer1234$", "이순신");
		} catch (UserDefineExceptionID e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
