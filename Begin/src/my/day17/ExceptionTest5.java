package my.day17;

public class ExceptionTest5 {

	public static void main(String[] args) {
		
		try {
			for(int i=0; i<=5; i++) {
			int result = 50/(3-i);
			System.out.println("result => 50/"+(3-i)+"="+result);
		}

		}catch(ArithmeticException e) {
			System.out.println(">>> 분모는 0으로 할 수 없습니다.");
		//	return; //==> finally 절 수행하고 나서 종료한다. /*프로그램종료를 의미 그래도 finally는 무조건해*/
			
			System.exit(0); //==> finally 절 수행없이 바로 종료
			/*
			  	System.exit(0); ==> 정상종료
			  	System.exit(0이 아닌 정수 ,, -23,346); ==> 비정상종료
			  	
			  	형태가 정상종료인지, 비정상종료인지 구분하기 좋게 하기 위해서0과 0이 
			  	아닌 값으로 구분을 두는 것이지 실행되어지는 것은 동일하게 종료되어진다.
			*/
		}
		finally {
			/*
			  	try 부분의 실행에 있어서 오류(exception)가 발생하든지 안하든지 관계없이 
			  	try 부분의 실행이 끝나고나서 무조건 실행되어지는 부분이 finally{} 이다.
			*/
			System.out.println("--- 오류가 발생하든지 안하든지 관계없이 반드시 출력해야할 내용 ---");
		}
		
		System.out.println(">>> 프로그램 종료합니다. <<<");
		


	}//end of main------------------

}
