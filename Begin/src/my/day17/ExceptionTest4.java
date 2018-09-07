package my.day17;

public class ExceptionTest4 {

	public static void main(String[] args) {
		
		try {
			for(int i=0; i<=5; i++) {
			int result = 50/(3-i);
			System.out.println("result => 50/"+(3-i)+"="+result);
		}

		}catch(ArithmeticException e) {
			System.out.println(">>> 분모는 0으로 할 수 없습니다.");
		}
		finally {
			/*
			  	try 부분의 실행에 있어서 오류(exception)가 발생하든지 안하든지 관계없이 
			  	try 부분의 실행이 끝나고나서 무조건 실행되어지는 부분이 finally{} 이다.
			*/
			System.out.println("--- 오류가 발생하든지 안하든지 관계없이 반드시 출력해야할 내용 ---");
		}


	}

}
