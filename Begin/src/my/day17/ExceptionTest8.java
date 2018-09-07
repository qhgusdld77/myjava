/*
 	try{}블럭 하나에 catch 절은 여러 개 올 수 있다.
 	그러나 이때 catch 순서에 주의해야 한다.
 	
 	먼저 자식 Exception 을 먼저 기술하고
 	부모  Exception을 나중에 기술해야 한다.
*/
package my.day17;

public class ExceptionTest8 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
		String str = "abc";
		
		for(int i=0; i<arr.length+1; i++) {
			try {
				int no1 = arr[i];
				arr[i] = arr[i]/(3-i)*Integer.parseInt(str);
				// 10/3  20/2 30/0 >> 분모는 0으로 할 수 없습니다.
				System.out.println("result =>"+ arr[i]+"/"+(3-i)+"="+arr[i]);
				}
			catch(ArithmeticException e) {
				System.out.println(">>> 분모는 0으로 할 수 없습니다.");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(">>> 배열의 크기를 초과했으므로 안됩니다.");
			}
			catch(Exception e) {//이건 모든 오류를 거르기때문에 처음에 쓰면 안되고 맨아래에 써야된다.
				System.out.println("기타오류 발생");
				System.out.println(e.getMessage());
			}
			finally {
				if(i==arr.length+1 -1)
				System.out.println("--- 오류가 발생하든지 안하든지 관계없이 반드시 출력해야할 내용 ---");
			}
		}//end of for---------------
		System.out.println(">>> 프로그램 종료합니다. <<<");
		
		

	}//end of main-----------------

}
