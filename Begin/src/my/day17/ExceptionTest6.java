package my.day17;

public class ExceptionTest6 {

	public static void main(String[] args) {
		
		try {
			for(int i=0; i<=5; i++) {
			int result = 50/(3-i);
			System.out.println("result => 50/"+(3-i)+"="+result);
		}

		}catch(ArithmeticException e) {
			System.out.println(">>> 분모는 0으로 할 수 없습니다.");
			System.out.println("e.getMessage() => "+e.getMessage());
			//e.getMessage() => / by zero
			e.printStackTrace();//다끝난다음에 어디가 문제가 있는지 찾아주는거,, 추적 
			
		}
		finally {
			System.out.println("--- 오류가 발생하든지 안하든지 관계없이 반드시 출력해야할 내용 ---");
		}
		
		System.out.println(">>> 프로그램 종료합니다. <<<");
		

	}//end of main-----------------

}
