package my.day17;

public class ExceptionTest7 {

	public static void main(String[] args) {
		
		
			for(int i=0; i<=5; i++) {
				try {
					
				int result = 50/(3-i);
				System.out.println("result => 50/"+(3-i)+"="+result);
				}
	
				catch(ArithmeticException e) {
					System.out.println(">>> 분모는 0으로 할 수 없습니다.");
					
				}
			}
		System.out.println(">>> 프로그램 종료합니다. <<<");
		

	}//end of main-----------------

}
