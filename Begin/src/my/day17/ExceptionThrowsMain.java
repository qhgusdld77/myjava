package my.day17;

public class ExceptionThrowsMain {

	public static void main(String[] args) {
		
		ExceptionThrows obj = new ExceptionThrows();
		
		try {
			obj.setName("홍길동");
		//	obj.setPoint("97");
			obj.setPoint("asdf");
			
			System.out.println("성명 : "+obj.getName());
			System.out.println("점수 : "+obj.getPoint());
			System.out.println("학점 : "+obj.getHakjum());
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 입력하세요");
		}
		
		
		
		
		
	}
	
	

}
